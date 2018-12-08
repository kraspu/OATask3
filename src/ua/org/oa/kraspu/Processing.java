package ua.org.oa.kraspu;

import java.util.ArrayList;

public abstract class Processing {

  static  void addToArray (String str, ArrayList<String> words, ArrayList<Integer> counts){
    int index = words.indexOf(str);
    if (index < 0) {
      words.add(str);
      counts.add(1);
    }else {
      int count = counts.get(index);
      counts.set(index, ++count);
    }
  }


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
