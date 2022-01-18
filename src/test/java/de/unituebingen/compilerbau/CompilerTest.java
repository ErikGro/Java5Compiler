package de.unituebingen.compilerbau;

import de.unituebingen.compilerbau.exception.ASTException;
import de.unituebingen.compilerbau.exception.CompilerException;
import de.unituebingen.compilerbau.exception.TypeCheckException;
import org.junit.Before;
import org.junit.Test;

import java.io.*;
import java.nio.file.Files;

public abstract class CompilerTest {
    public final Compiler compiler = new Compiler();

    private String sourcecode;
    private byte[] expectedByteCode;

    public String getSourcecode() {
        return sourcecode;
    }

    public byte[] getExpectedByteCode() {
        return expectedByteCode;
    }

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

        File source = new File(this.getClass().getResource(sourceFileName).getFile());
        File byteCode = new File(this.getClass().getResource(byteCodeFileName).getFile());

        try {
            InputStream isSource = new FileInputStream(source);
            sourcecode = readFromInputStream(isSource);

            expectedByteCode = Files.readAllBytes(byteCode.toPath());
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
