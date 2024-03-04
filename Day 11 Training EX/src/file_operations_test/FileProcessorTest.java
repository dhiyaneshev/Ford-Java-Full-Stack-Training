package file_operations_test;

import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.TemporaryFolder;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.file.Files;
import static org.junit.Assert.*;

public class FileProcessorTest {
    private FileProcessor fileProcessor;
    private File testFile;

    @Rule
    public TemporaryFolder tempFolder = new TemporaryFolder();

    @Before
    public void setUp() throws IOException {
        fileProcessor = new FileProcessor();
        testFile = tempFolder.newFile("testFile.txt");
    }

    @Test
    public void testReadFromFile() throws IOException {
        String dataToWrite = "Hello, World!";
        Files.write(testFile.toPath(), dataToWrite.getBytes());

        String dataRead = fileProcessor.readFromFile(testFile.getAbsolutePath());
        assertEquals(dataToWrite, dataRead);
    }

    @Test
    public void testWriteToFile() throws IOException {
        String dataToWrite = "Hello, World!";
        fileProcessor.writeToFile(testFile.getAbsolutePath(), dataToWrite);

        String dataRead = new String(Files.readAllBytes(testFile.toPath()));
        assertEquals(dataToWrite, dataRead);
    }

    @Test(expected = FileNotFoundException.class)
    public void testReadFromFileFileNotFoundException() {
        fileProcessor.readFromFile("nonExistentFile.txt");
    }

    @Test(expected = IOException.class)
    public void testWriteToFileIOException() throws IOException {
        // Attempt to write to a read-only file to trigger IOException
        testFile.setReadOnly();
        fileProcessor.writeToFile(testFile.getAbsolutePath(), "Hello, World!");
    }
}
