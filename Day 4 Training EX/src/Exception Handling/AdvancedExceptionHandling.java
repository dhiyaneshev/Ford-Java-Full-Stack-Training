package exceptionhandling;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

class CustomIOException extends Exception {
    public CustomIOException(String message) {
        super(message);
    }
}

public class AdvancedExceptionHandling {
    public static void main(String[] args) {
        try {
            String filePath = "complex.txt";
            openAndPerformOperations(filePath);
            System.out.println("Complex operation performed successfully.");
        } catch (FileNotFoundException e) {
            System.out.println("File not found: " + e.getMessage());
        } catch (IOException e) {
            System.out.println("IO Exception: " + e.getMessage());
        } catch (CustomIOException e) {
            System.out.println("Custom IO Exception: " + e.getMessage());
        } finally {
            closeFile();
        }
    }

    public static void openAndPerformOperations(String filePath) throws FileNotFoundException, CustomIOException {
        FileInputStream fileInputStream = null;
        try {
            // Open the file
            File file = new File(filePath);
            fileInputStream = new FileInputStream(file);
            // Perform operations on the file
            // For example: Read the contents of the file
            int data;
            while ((data = fileInputStream.read()) != -1) {
                System.out.print((char) data);
            }
            // Perform operations
            if (true) {
                throw new CustomIOException("Custom IO Exception occurred.");
            }
        } catch (IOException e) {
//            throw new IOException("IO Exception occurred.");
        }
    }

    public static void closeFile() {
//        try {
//            // Close the file
//            System.out.println("File closed successfully.");
//        } catch (IOException e) {
//            System.out.println("Error while closing the file: " + e.getMessage());
//        }
    }
}