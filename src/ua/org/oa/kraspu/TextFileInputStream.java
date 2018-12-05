package ua.org.oa.kraspu;

import java.io.*;
import java.util.ArrayList;

public class TextFileInputStream {

  //создания массива строк из файла
  static ArrayList<String> fileReadLineToArray(String Path)
  {
    try {
      ArrayList arrayList = new ArrayList();
      File f = new File(Path);
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
      return w;
  }

    // подсчет колличества слов
  static ArrayList<Integer> countWord (ArrayList<String> arr) {
      ArrayList<Integer> cW = new ArrayList<>();
      for (String s : arr) {
        int count = 0;
        for (String sub : arr) {
          if (s.equals(sub)) count++;
        }
        cW.add(count);
      }
      return cW;
  }static void result (ArrayList<String> wordList, ArrayList<Integer> countList){

    int size;
    if (wordList.size() == countList.size()) {
      size = wordList.size();
      for (int i = 0; i < size; i++) {
        System.out.println(wordList.get(i).toUpperCase() + " \tвстречается " + countList.get(i) + " раз;");
      }
    }
  }




}
