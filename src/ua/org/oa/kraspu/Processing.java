package ua.org.oa.kraspu;

import java.util.ArrayList;

public class Processing {


  // подсчет колличества повторяющихся слов
//  static ArrayList<Integer> countWord (ArrayList<String> arr) {
//    ArrayList<Integer> cW = new ArrayList<>();
//    for (String s : arr) {
//      int count = 0;
//      for (String sub : arr) {
//        if (s.equals(sub)) count++;
//      }
//      cW.add(count);
//    }
//    System.out.println("Count repeated Words = " + cW.size());
//    return cW;
//  }

  // проверка на повтор слов, чтобы не выводить в результате по несколько раз
//  static ArrayList<Boolean> repeatedWord (ArrayList<String> arr) {
//    ArrayList<Boolean> rW = new ArrayList<>();
//    for (int i = 0; i < arr.size(); i++) {
//         boolean b = false;
//         int j;
//         int count = 1;
//         for (j = 0; j < arr.size(); j++) {
//             if (i == j) continue;
//             if (arr.get(i).equals(arr.get(j))) {
//                count++;
//                rW.add(i,true);
//             }else rW.add(i,false);
//         }
//    }
//    for (int i = 0; i < arr.size(); i++) {
//      for (int j = 0; j < i; j++) {
//        if ((arr.get(i).equals(arr.get(j))) && (rW.get(i).equals(rW.get(j)))) {
//          rW.set(i, false);
//        }
//      }
//    }
//    System.out.println("count boolean = " + rW.size());
//    return rW;
//  }

  //вывод результата
  static void result (ArrayList<String> wordList, ArrayList<Integer> countList, boolean twiceAndMore){
    int size;
    if (wordList.size() == countList.size()) {
      size = wordList.size();
      for (int i = 0; i < size; i++) {
        if (!twiceAndMore || countList.get(i) > 1) {
          System.out.println(wordList.get(i).toUpperCase() + " \tвстречается " + countList.get(i) + " раз;");
        }
      }
    }else System.out.println("Что-то пошло не так");
  }
}
