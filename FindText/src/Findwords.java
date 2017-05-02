import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;
import java.io.File;
import java.io.BufferedReader;
import java.nio.file.Files;
import java.nio.file.Path;

public class Findwords {
    String word;
    File file;



    public Findwords(String word, File file)  {

        int count = 0;
        Scanner s = new Scanner(.txt);
        while (s.hasNextLine()){
            String nextToken = s.next();
            if (nextToken.equalsIgnoreCase(word));
                count++;
        }
            return count;


    }



    public static void main(String[] args) {


    }
}


