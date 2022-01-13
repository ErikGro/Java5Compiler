package de.unituebingen.compilerbau;

import de.unituebingen.compilerbau.exception.ASTException;
import de.unituebingen.compilerbau.exception.CompilerException;
import de.unituebingen.compilerbau.exception.TypeCheckException;
import org.junit.Before;
import org.junit.Test;

import java.io.*;

public abstract class CompilerTest {
    public final Compiler compiler = new Compiler();

    public String sourceFile;
    public String expectedByteCode;

    // File name to test from resource folder without suffix
    public abstract String getFileName();

    @Test
    public abstract void testAST() throws ASTException, IOException;

    @Test
    public abstract void testTypeCheckedAST() throws TypeCheckException;

    @Test
    public abstract void testGeneratedBytecode() throws CompilerException, IOException;

    @Before
    public void loadTestFiles() {
        String sourceFileName = getFileName() + ".java";
        String byteCodeFileName = getFileName() + ".class";

        ClassLoader classLoader = this.getClass().getClassLoader();

        File source = new File(this.getClass().getResource(sourceFileName).getFile());
        File byteCode = new File(this.getClass().getResource(sourceFileName).getFile());

        try {
            InputStream isSource = new FileInputStream(source);
            InputStream isByteCode = new FileInputStream(byteCode);
            sourceFile = readFromInputStream(isSource);
            expectedByteCode = readFromInputStream(isByteCode);
        } catch (IOException e) {
            System.err.println("Couldnt read file: " + getFileName());
            System.err.println("Input file need to be in the classpath");
            e.printStackTrace();
            return;
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
}
