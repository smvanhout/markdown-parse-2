// File reading code from https://howtodoinjava.com/java/io/java-read-file-to-string-examples/
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import static org.junit.Assert.*;
import org.junit.*;

public class MarkdownParseTest {
    final String BASE_FILE_PATH = "/Users/sebastiaan/Documents/GitHub/markdown-parse-2/testfiles";
    

    public void testFile(String filename, String[] expectedOutput) {
        String absolute_path = BASE_FILE_PATH + "/" + filename;
        // Use this for local runs: "Path filePath = Path.of(absolute_path);"
        Path filePath = Path.of("testfiles/" + filename);
        try {
            String contents = Files.readString(filePath);
            ArrayList<String> links = MarkdownParse.getLinks(contents);
            System.out.println(links);
            for(int i = 0; i < expectedOutput.length; i++) {
                assertEquals(expectedOutput[i], links.get(i));
            }
        }
        catch(Exception e) {
            System.out.println(e.getMessage());
            fail(System.getProperty("user.dir") + e.getMessage() + "  " + e.getClass().getName());
        }
    }

    @Test
    public void testWorkingAlmostValidFile() {
        String[] expectedOutput = {};
        testFile("almost-valid.md", expectedOutput);
    }

    @Test
    public void testBreakingFile() {
        String[] expectedOutput = {};
        testFile("breaking-file.md", expectedOutput);
    }

    @Test
    public void testOtherTestFile() {
        String[] expectedOutput = {};
        testFile("other-test.md", expectedOutput);
    }

    @Test
    public void testWorkingTestFile() {
        String[] expectedOutput = {};
        testFile("working-test-file.md", expectedOutput);
    }

    @Test
    public void testTestFile() {
        String[] expectedOutput = {"https://something.com", "some-page.html"};
        testFile("test-file.md", expectedOutput);
    }

    @Test
    public void testTestFile2() {
        String[] expectedOutput = {"https://something.com", "some-page.html"};
        testFile("test-file.md", expectedOutput);
    }
    @Test
    public void testTestFile3() {
        String[] expectedOutput = {};
        testFile("test-file.md", expectedOutput);
    }
    @Test
    public void testTestFile4() {
        String[] expectedOutput = {};
        testFile("test-file.md", expectedOutput);
    }
    @Test
    public void testTestFile5() {
        String[] expectedOutput = {};
        testFile("test-file.md", expectedOutput);
    }
    @Test
    public void testTestFile6() {
        String[] expectedOutput = {};
        testFile("test-file.md", expectedOutput);
    }
    @Test
    public void testTestFile7() {
        String[] expectedOutput = {};
        testFile("test-file.md", expectedOutput);
    }
    @Test
    public void testTestFile8() {
        String[] expectedOutput = {};
        testFile("test-file.md", expectedOutput);
    }
}