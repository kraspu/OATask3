package ua.org.oa.kraspu;

import java.io.*;
import java.util.ArrayList;

public class TextFileInputStream extends Processing {

  static ArrayList<String> words = new ArrayList<>();
  static ArrayList<Integer> counts = new ArrayList<>();

  //создания массива строк из файла
  static ArrayList<String> fileReadLineToArray(String path)
  {
    try {
      ArrayList arrayList = new ArrayList();
      File f = new File(path);
      FileInputStream fis = new FileInputStream(f);
      BufferedReader br = new BufferedReader(new InputStreamReader(fis));
      String strLine;

      while ((strLine = br.readLine()) != null) {
//        System.out.println(strLine);
        arrayList.add(strLine);
      }

      return arrayList;

    } catch (IOException e) {
      //e.printStackTrace();
      return null;
    }
  }

  //создание массива слов из файла
  static void toWordArr (ArrayList<String> arr) {
    words.clear();
    counts.clear();
      for (String str : arr) {
        String[] result = str.split("(?U)\\W+");
        for (String s : result) {
          addToArray(s.toLowerCase(), words, counts);
        }
      }
  }

  //вывод теста из файла
  static void fileOutput(ArrayList<String> array){

    for (String line : array) {
      System.out.println(line);
    }
  }




}
