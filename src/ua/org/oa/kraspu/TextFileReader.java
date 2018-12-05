package ua.org.oa.kraspu;

import java.io.FileReader;
import java.io.IOException;

public class TextFileReader {


    static void fileOut() {
      {
        try {
          FileReader fr;
          fr = new FileReader("src\\ua\\org\\oa\\kraspu\\Test.txt");
          int c;

          while ((c = fr.read()) != -1 && (char)c != '\n') {
            System.out.print((char) c);
          }
        } catch (IOException e) {
          System.out.println("IO Error");
          //e.printStackTrace();
        }
      }
    }
}
