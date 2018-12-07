package ua.org.oa.kraspu;

import java.util.ArrayList;

public class Main {


  public static void main(String[] args) {

    String pathToFile = "src\\ua\\org\\oa\\kraspu\\Test.txt";

    // 1-ый способ - считываем текст файла в массив строк

    ArrayList<String> aL = TextFileInputStream.fileReadLineToArray(pathToFile);

    TextFileInputStream.fileOutput(aL); // вывод содержимого файла
//    System.out.println("--------------------------------------------------------------------------");


//    ArrayList<String> wordArray = TextFileInputStream.wordArr(aL);
//    ArrayList<Integer> countWord = Processing.countWord(wordArray);
//    ArrayList<Boolean> repeated = Processing.repeatedWord(wordArray);
//    Processing.result(wordArray, countWord, repeated);

//    System.out.println("===========================================================================");

    // 2-ой способ - переводим текст файла в массив слов

//    TextFileReader.fileOut(pathToFile); //можно так вывести текст файла на экран

    String text = TextFileReader.textToArray(pathToFile);
//    System.out.println(text); // а можно так вывести текст! и так проще
////    System.out.println("\n");
//    ArrayList<String> wordArr2 = TextFileReader.toWordArr(text);
//    ArrayList<Integer> countWord2 = Processing.countWord(wordArr2);
//    ArrayList<Boolean> repeated2 = Processing.repeatedWord(wordArr2);
    TextFileReader.toWordArr(text);
    Processing.result(TextFileReader.words, TextFileReader.counts, true);







//    MyImpl my = new MyImpl("Hello my friend");
//    int length = my.length();
//    char c = my.charAt(2);
//    System.out.println(length);
//    System.out.println(c);



  }
}
