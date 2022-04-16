//https://howtodoinjava.com/java/io/java-read-file-to-string-examples/

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;

public class MarkdownParse {

    public static ArrayList<String> getLinks(String markdown) {
        ArrayList<String> toReturn = new ArrayList<>();
        // find the next [, then find the ], then find the (, then read link upto next )
        int currentIndex = 0;
        String returnedStr;
        while(currentIndex < markdown.length()) {
            int openBracket = markdown.indexOf("[", currentIndex);
            int closeBracket = markdown.indexOf("]", openBracket);
            int openParen = markdown.indexOf("(", closeBracket);
            int closeParen = markdown.indexOf(")", openParen);

            // Check if there is a ! before []
            if (currentIndex == 0) {
                if (markdown.substring(currentIndex, currentIndex + 1).equals("!") 
                    == false) {
                    returnedStr = markdown.substring(openParen + 1, closeParen);
                    // Remove extra spaces if present
                    returnedStr = returnedStr.replaceAll(" ", "");
                    toReturn.add(returnedStr);
                }
            } else {
                if (markdown.substring(openBracket - 1, openBracket).equals("!") 
                    == false) {
                    returnedStr = markdown.substring(openParen + 1, closeParen);
                    // Remove extra spaces if present
                    returnedStr = returnedStr.replaceAll(" ", "");
                    toReturn.add(returnedStr);
                }
            }
            
            currentIndex = closeParen + 1;
        }

        return toReturn;
    }


    public static void main(String[] args) throws IOException {
        Path fileName = Path.of(args[0]);
        String content = Files.readString(fileName);
        ArrayList<String> links = getLinks(content);
	    System.out.println(links);
    }
}
