import static org.junit.Assert.*;
import org.junit.*;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;
public class MarkdownParseTest {
    
    
    @Test
    public void getLinksTest() throws IOException {
        Path fileName = Path.of("/Users/owen/Documents/GitHub/markdown-parser/test1.md");
        String content = Files.readString(fileName);
        ArrayList<String> links = MarkdownParse.getLinks(content);
        ArrayList<String> expected = new ArrayList<>();
        expected.add("https://something.com");
        assertEquals(expected, links);
    }
}
