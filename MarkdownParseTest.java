import static org.junit.Assert.*;
import org.junit.*;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;

public class MarkdownParseTest {

    @Test
    public void adddition(){
        assertEquals(2, 1 + 1);
    }

    @Test
    public void testGetLinks() throws IOException{

        Path fileName = Path.of("test-file.md");
        String content = Files.readString(fileName);
        ArrayList<String> links = MarkdownParse.getLinks(content);

        ArrayList<String> result = new ArrayList<String>();
        result.add("https://something.com");
        result.add("some-thing.html");


        assertEquals(result, links);

    }

    @Test
    public void testGetLinks2() throws IOException{

        Path fileName = Path.of("test2-file.md");
        String content = Files.readString(fileName);
        ArrayList<String> links = MarkdownParse.getLinks(content);

        ArrayList<String> result = new ArrayList<String>();

        assertEquals(result, links);

        
    }

    @Test
    public void testGetLinks3() throws IOException{

        Path fileName = Path.of("test3-file.md");
        String content = Files.readString(fileName);
        ArrayList<String> links = MarkdownParse.getLinks(content);

        ArrayList<String> result = new ArrayList<String>();
        result.add("https://upload.wikimedia.org/wikipedia/commons/thumb/7/77/Google_Images_2015_logo.svg/800px-Google_Images_2015_logo.svg.png");

        assertEquals(result, links);
    }
    

    @Test
    public void testGetLinks4() throws IOException{
        Path fileName = Path.of("test4-file.md");
        String content = Files.readString(fileName);
        ArrayList<String> links = MarkdownParse.getLinks(content);

        ArrayList<String> result = new ArrayList<String>();
        result.add("https://sites.google.com/eng.ucsd.edu/cse-15l-spring-2022/schedule?authuser=0");



        assertEquals(result, links);

    }


    @Test
    public void testGetLinks5() throws IOException{



        Path fileName = Path.of("test-file2.md");
        String content = Files.readString(fileName);
        ArrayList<String> links = MarkdownParse.getLinks(content);

        ArrayList<String> result = new ArrayList<String>();
        result.add("https://something.com");
        result.add("some-page.html");



        assertEquals(result, links);

    }

    @Test
    public void testGetLinks6() throws IOException{

        Path fileName = Path.of("test-file3.md");
        String content = Files.readString(fileName);
        ArrayList<String> links = MarkdownParse.getLinks(content);

        ArrayList<String> result = new ArrayList<String>();


        assertEquals(result, links);

    }    

    @Test
    public void testGetLinks7() throws IOException{



        Path fileName = Path.of("test-file4.md");
        String content = Files.readString(fileName);
        ArrayList<String> links = MarkdownParse.getLinks(content);

        ArrayList<String> result = new ArrayList<String>();


        assertEquals(result, links);

    }    

    @Test
    public void testGetLinks8() throws IOException{

        Path fileName = Path.of("test-file7.md");
        String content = Files.readString(fileName);
        ArrayList<String> links = MarkdownParse.getLinks(content);

        ArrayList<String> result = new ArrayList<String>();


        assertEquals(result, links);

    }    

    @Test
    public void testGetLinks9() throws IOException{



        Path fileName = Path.of("test-file8.md");
        String content = Files.readString(fileName);
        ArrayList<String> links = MarkdownParse.getLinks(content);

        ArrayList<String> result = new ArrayList<String>();
        result.add("a link on the first line");


        assertEquals(result, links);

    }    
    
    @Test
    public void testGetLinks10() throws IOException{

        Path fileName = Path.of("test5-file.md");
        String content = Files.readString(fileName);
        ArrayList<String> links = MarkdownParse.getLinks(content);

        ArrayList<String> result = new ArrayList<String>();


        assertEquals(result, links);

    }

    /**
public class MarkdownParseTest {
    
    
    @Test
    public void getLinksTest() throws IOException {
        Path fileName = Path.of("test-file.md");
        String content = Files.readString(fileName);
        ArrayList<String> links = MarkdownParse.getLinks(content);
        ArrayList<String> expected = new ArrayList<>();
        expected.add("https://something.com");
        expected.add("some-thing.html");
        assertEquals(expected, links);

        Path fileName2 = Path.of("lab5_test.md");
        String content2 = Files.readString(fileName2);
        ArrayList<String> links2 = MarkdownParse.getLinks(content2);
        ArrayList<String> expected2 = new ArrayList<>();
        expected2.add("www.google.com");
        assertEquals(expected2, links2);
        
    }
}
*/


}


