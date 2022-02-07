package de.unituebingen.compilerbau;

import de.unituebingen.compilerbau.exception.CompilerException;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Map;

public class App {
    public static void main( String[] args ) {
        if (args.length == 1 && args[0].equals("--help")) {
            System.out.println("Usage: java -jar java5Compiler <source file>");
            return;
        }

        String sourceFilePath;
        try {
            sourceFilePath = App.sourceFilePath(args);
        } catch (IllegalArgumentException e) {
            System.out.println("Invalid arguments. Only --help or a single <source file> permitted.");
            return;
        }

        Compiler compiler = new Compiler();

        try {
            Map<String, byte[]> resultMap = compiler.compile(sourceFilePath);
            App.saveByteCodeToFiles(resultMap);
        } catch (CompilerException e) {
            System.err.println(e.getMessage());
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static String sourceFilePath(String[] args) throws IllegalArgumentException {
        if (args.length != 1) {
            throw new IllegalArgumentException();
        }

        String filePath = args[0];

        if (!filePath.startsWith("/")) { // Relative path
            while (!filePath.isEmpty() && (filePath.charAt(0) == '.' || filePath.charAt(0) == '/')) {
                filePath = filePath.substring(1);
            }

            if (filePath.isEmpty()) {
                throw new IllegalArgumentException();
            }

            String executionDir = System.getProperty("user.dir");
            filePath = executionDir + "/" + filePath;
        }

        File f = new File(filePath);
        if (!f.exists()) {
            System.out.println("No File at path " + f + " found");
            throw new IllegalArgumentException();
        }

        return filePath;
    }


    private static void saveByteCodeToFiles(Map<String, byte[]> resultMap) {
        for (Map.Entry<String, byte[]> entry : resultMap.entrySet()) {
            File classFile = new File(entry.getKey());

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
