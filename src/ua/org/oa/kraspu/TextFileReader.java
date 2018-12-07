package ua.org.oa.kraspu;

import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class TextFileReader {

  static ArrayList<String> words = new ArrayList<>();
  static ArrayList<Integer> counts = new ArrayList<>();


  // вывод текста файла
    static void fileOut(String path) {
      {
        try {
          FileReader fr;
          fr = new FileReader(path);
          int c;

          while ((c = fr.read()) != -1) {
            System.out.print((char) c);
          }
        } catch (IOException e) {
          System.out.println("IO Error");
          //e.printStackTrace();
        }
      }
    }

  static String textToArray (String path) {
      {
        try {
          FileReader fr;
          String textArr = "";
          fr = new FileReader(path);
          int c;
          while ((c = fr.read()) != -1) {
              textArr += ((char)c);
          }
          return textArr;
        } catch (IOException e) {
          System.out.println("IO Error"); return null;
          //e.printStackTrace();
        }
      }
    }


    //создание массива слов из файла
  static void toWordArr (String arr) {
    words.clear();
    counts.clear();
    String[] result = arr.split("(?U)\\W+");
      for (String s : result) {
        addToArray(s);
      }
    System.out.println("Count o words = " + words.size());
  }

  static  void addToArray (String str){
    int index = words.indexOf(str);
    if (index < 0) {
          words.add(str);
          counts.add(1);
      }else {
        int count = counts.get(index);
        counts.set(index, ++count);
      }
  }

}
