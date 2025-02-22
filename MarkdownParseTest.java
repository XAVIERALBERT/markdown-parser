import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.*;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class MarkdownParseTest {
    @Test
    public void addition() {
        assertEquals(2, 1+1);
    }

    @Test 
    public void testGetLinks() {
        String toTest1 = 
        "# Title [link1](https://something.com) [link2](some-thing.html)";

        ArrayList<String> expected = new ArrayList<>();
        expected.add("https://something.com");
        expected.add("some-thing.html");
        ArrayList<String> result = MarkdownParse.getLinks(toTest1);
        assertEquals(expected,result);
    }
    @Test 
    public void testGetLinks2() {
        String toTest2 = 
        "# Title2 [link](https://rando.org/file-name) [link2](https://google.com) [link3](rando.gov)";

        ArrayList<String> expected = new ArrayList<>();
        expected.add("https://rando.org/file-name");
        expected.add("https://google.com");
        expected.add("rando.gov");
        ArrayList<String> result = MarkdownParse.getLinks(toTest2);
        assertEquals(expected,result);
    }
    @Test 
    public void testGetLinks3() {
        String toTest3 = 
        "[link]rando.com [link](rando.gov) [link](rando.org) link(rando.com)";

        ArrayList<String> expected = new ArrayList<>();
        expected.add("rando.gov");
        expected.add("rando.org");
        ArrayList<String> result = MarkdownParse.getLinks(toTest3);
        assertEquals(expected,result);
    }
    @Test 
    public void testGetLinks4() {
        String toTest = "";

        ArrayList<String> expected = new ArrayList<>();
        ArrayList<String> result = MarkdownParse.getLinks(toTest);
        assertEquals(expected,result);
    }

    @Test
    public void testGetLinks5() throws IOException {
        
        Path fileName = Path.of("C:\\Users\\xaval\\OneDrive\\Documents\\GitHub\\markdown-parser\\test-file2.md");
        String content = Files.readString(fileName);
        ArrayList<String> links = MarkdownParse.getLinks(content);
        ArrayList<String> expected = new ArrayList<>();
        expected.add("https://something.com");
        expected.add("some-page.html");

        assertEquals(expected,links);

    }

    @Test
    public void testGetLinks6() throws IOException {
        
        Path fileName = Path.of("C:\\Users\\xaval\\OneDrive\\Documents\\GitHub\\markdown-parser\\test-file3.md");
        String content = Files.readString(fileName);
        ArrayList<String> links = MarkdownParse.getLinks(content);
        ArrayList<String> expected = new ArrayList<>();

        assertEquals(expected,links);

    }

    @Test
    public void testGetLinks7() throws IOException {
        
        Path fileName = Path.of("C:\\Users\\xaval\\OneDrive\\Documents\\GitHub\\markdown-parser\\test-file4.md");
        String content = Files.readString(fileName);
        ArrayList<String> links = MarkdownParse.getLinks(content);
        ArrayList<String> expected = new ArrayList<>();

        assertEquals(expected,links);

    }

    @Test
    public void testGetLinks8() throws IOException {

        Path fileName = Path.of("C:\\Users\\xaval\\OneDrive\\Documents\\GitHub\\markdown-parser\\test-file7.md");
        String content = Files.readString(fileName);
        ArrayList<String> links = MarkdownParse.getLinks(content);
        ArrayList<String> expected = new ArrayList<>();

        assertEquals(expected,links);

    }

    @Test
    public void testGetLinks9() throws IOException {
        
        Path fileName = Path.of("C:\\Users\\xaval\\OneDrive\\Documents\\GitHub\\markdown-parser\\test-file8.md");
        String content = Files.readString(fileName);
        ArrayList<String> links = MarkdownParse.getLinks(content);
        ArrayList<String> expected = new ArrayList<>();
        expected.add("a link on the first line");

        assertEquals(expected,links);

    }

    @Test
    public void testSnippet1() throws IOException {
        Path fileName = Path.of("C:\\Users\\xaval\\OneDrive\\Documents\\GitHub\\markdown-parser\\Snippet-1.md");
        String content = Files.readString(fileName);
        ArrayList<String> links = MarkdownParse.getLinks(content);
        ArrayList<String> expected = new ArrayList<>();
        expected.add("url.com");
        expected.add("`google.com"); 
        expected.add("google.com"); 
        expected.add("ucsd.edu");

        assertEquals(expected,links);
    }

    @Test
    public void testSnippet2() throws IOException{
        Path fileName = Path.of("C:\\Users\\xaval\\OneDrive\\Documents\\GitHub\\markdown-parser\\Snippet-2.md");
        String content = Files.readString(fileName);
        ArrayList<String> links = MarkdownParse.getLinks(content);
        ArrayList<String> expected = new ArrayList<>();
        expected.add("a.com"); //ASK
        expected.add("a.com((");
        expected.add("example.com");

        assertEquals(expected,links);
    }

    @Test
    public void testSnippet3() throws IOException{
        Path fileName = Path.of("C:\\Users\\xaval\\OneDrive\\Documents\\GitHub\\markdown-parser\\Snippet-3.md");
        String content = Files.readString(fileName);
        ArrayList<String> links = MarkdownParse.getLinks(content);
        ArrayList<String> expected = new ArrayList<>();
        expected.add("https://www.twitter.com"); 
        expected.add("https://sites.google.com/eng.ucsd.edu/cse-15l-spring-2022/schedule"); 
        expected.add("https://cse.ucsd.edu/"); 
        
        assertEquals(expected,links);
    }
}
