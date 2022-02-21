package de.unituebingen.compilerbau;

import de.unituebingen.compilerbau.exception.ASTException;
import de.unituebingen.compilerbau.exception.CompilerException;
import de.unituebingen.compilerbau.exception.TypeCheckException;
import org.junit.Before;
import org.junit.Test;

import java.io.*;
import java.lang.reflect.Method;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLClassLoader;
import java.nio.file.Files;
import java.nio.file.Paths;

public abstract class CompilerTest {
    /* Below functions to be implemented by subclasses */

    public abstract String getMockFilePath();

    @Test
    public abstract void testAST() throws ASTException, IOException;

    @Test
    public abstract void testTypeCheckedAST() throws TypeCheckException;

    @Test
    public abstract void testGeneratedBytecode() throws CompilerException, IOException;

    /* Below functions for initializing test case */

    Class clazz = null;

    private String sourcecode;

    public String getSourcecode() {
        return sourcecode;
    }

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

//    @Before
//    public void instantiateExpectedClassInstance() throws Exception {
//        URL target = Paths.get("target", "test-classes").toUri().toURL();
//        URLClassLoader loader = new URLClassLoader(new URL[]{target});
//        this.clazz = loader.loadClass("clazz.MockEmptyClass");
//    }

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
}
