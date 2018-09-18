import java.io.IOException;
import java.net.URL;
import java.util.Scanner;


public class MjClass {

    public static String urlToString(final String url) {
        Scanner urlScanner;
        try {
            urlScanner = new Scanner(new URL(url).openStream(), "UTF-8");
        } catch (IOException e) {
            return "";
        }
        String contents = urlScanner.useDelimiter("\\A").next();
        int wordcount = 0;
        int endOfLine = contents.length()-1;
        for(int i = 0; i < contents.length(); i++) {
            if((contents.charAt(i)== ' ') && (contents.charAt(i+1) != ' ')) {
                wordcount++;
            }
        }
        System.out.println(wordcount);
        urlScanner.close();
        return contents;
    }
}