package de.unituebingen.compilerbau;

import de.unituebingen.compilerbau.ast.Clazz;
import de.unituebingen.compilerbau.exception.ASTException;
import de.unituebingen.compilerbau.exception.CompilerException;
import de.unituebingen.compilerbau.exception.TypeCheckException;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.*;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLClassLoader;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public abstract class CompilerTest {
    /* Below functions to be implemented by subclasses */

    public abstract String getMockFilePath();

    public abstract Map<String, Clazz> getExpectedClassMap();

    @Test
    public abstract void testAST() throws ASTException, IOException;

    @Test
    public abstract void testTypeCheckedAST() throws TypeCheckException, CloneNotSupportedException;

    @Test
    public abstract void testGeneratedBytecode() throws IOException, CloneNotSupportedException, ReflectiveOperationException;

    /* Below functions for initializing test case */

    public Map<String, Class> compiledClasses = new HashMap<>();

    public String getSourcecode() {
        return sourcecode;
    }

    private String sourcecode;

    @Before
    public void loadTestFiles() {
        File source = new File(this.getClass().getResource(getMockFilePath()).getFile());

        try {
            InputStream isSource = new FileInputStream(source);
            sourcecode = readFromInputStream(isSource);
        } catch (IOException e) {
            System.err.println("Couldn't read file: " + getMockFilePath());
            System.err.println("Input file needs to be in classpath");
            e.printStackTrace();
            return;
        }
    }

    /* Helper methods below */

    private String getMockFileDirectory() {
        String[] components = getMockFilePath().split("/");
        if (components.length > 1) {
            components = Arrays.copyOf(components, components.length-1);
        }
        return System.getProperty("user.dir") + "/src/test/resources/" + String.join("/", components);
    }

    public void compileAndLoadClasses() throws IOException, CloneNotSupportedException, ClassNotFoundException {
        Compiler compiler = new Compiler();
        Map<String, byte[]> classMap = compiler.compile("src/test/resources/" + getMockFilePath());

        saveByteCodeToFiles(classMap, getMockFileDirectory());

        for (String entry : classMap.keySet()) {
            URL projectDir = new File(getMockFileDirectory()).toURI().toURL();
            URLClassLoader loader = new URLClassLoader(new URL[]{projectDir});
            this.compiledClasses.put(entry, loader.loadClass(entry));
        }
    }

    private String readFromInputStream(InputStream inputStream) throws IOException {
        StringBuilder resultStringBuilder = new StringBuilder();

        try (BufferedReader br = new BufferedReader(new InputStreamReader(inputStream))) {
            String line;
            while ((line = br.readLine()) != null) {
                resultStringBuilder.append(line).append("\n");
            }
        }

        return resultStringBuilder.toString();
    }
    private void saveByteCodeToFiles(Map<String, byte[]> resultMap, String targetDirectory) {
        for (Map.Entry<String, byte[]> entry : resultMap.entrySet()) {
            File classFile = new File(targetDirectory + "/" + entry.getKey() + ".class");

            try {
                classFile.createNewFile();
                FileOutputStream outputStream = new FileOutputStream(classFile);
                outputStream.write(entry.getValue());
                System.out.println("Created: " + classFile);
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
