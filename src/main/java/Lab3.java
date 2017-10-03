import java.io.IOException;
import java.net.URL;
import java.util.Scanner;

/**
 *
 * @author Rohith
 *
 */

public class Lab3 {

 /**
 * Retrieve contents from a URL and return them as a string.
 *
 * @param url url to retrieve contents from
 * @return the contents from the url as a string, or an empty string on error
 */

    public static String urlToString(final String url) {
    Scanner urlScanner;
    try {
        urlScanner = new Scanner(new URL(url).openStream(), "UTF-8");
    } catch (IOException e) {
        return "";
    }
    String contents = urlScanner.useDelimiter("\\A").next();
    urlScanner.close();
    return contents;
}

/**
*
* @param args does something
*/
   public static void main(final String[] args) {
       String text = urlToString("http://erdani.com/tdpl/hamlet.txt");
       int words = 0;
       String search = "prince";
       int searchNumber = 0;
       for (String textFile: text.split("\\s+")) {
           System.out.println(textFile);
           words = words + 1;
           System.out.println(words);
           if (textFile.startsWith(search) || textFile.startsWith("Prince")) {
               searchNumber = searchNumber + 1;
               System.out.println(searchNumber);
           }
        }
    }
}