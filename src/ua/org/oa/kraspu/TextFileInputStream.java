package ua.org.oa.kraspu;

import java.io.*;
import java.util.ArrayList;

public class TextFileInputStream {

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
  static ArrayList<String> wordArr (ArrayList<String> arr) {
      ArrayList<String> w = new ArrayList<>();
      for (String str : arr) {
        String[] result = str.split("(?U)\\W+");
        for (String s : result) {
          w.add(s.toLowerCase());
        }
      }
    System.out.println("Count of word2 = " + w.size());
      return w;
  }

  //вывод теста из файла
  static void fileOutput(ArrayList<String> array){

    for (String line : array) {
      System.out.println(line);
    }
  }




}
