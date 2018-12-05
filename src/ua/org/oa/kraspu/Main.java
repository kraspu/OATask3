package ua.org.oa.kraspu;

import java.util.ArrayList;

public class Main {


  public static void main(String[] args) {

//    System.out.println(new TextProcessing().f.getAbsolutePath());
//    TextFileReader.fileOut();

    String pathToFile = "src\\ua\\org\\oa\\kraspu\\Test.txt";

    ArrayList<String> aL = TextFileInputStream.fileReadLineToArray(pathToFile);

    Processing.fileOutput(aL); // вывод содержимого файла
    System.out.println("--------------------------------------------------------------------------");


    ArrayList<String> wordArray = TextFileInputStream.wordArr(aL);
    ArrayList<Integer> countWord = TextFileInputStream.countWord(wordArray);

    TextFileInputStream.result(wordArray, countWord);

//    MyImpl my = new MyImpl("Hello my friend");
//    int length = my.length();
//    char c = my.charAt(2);
//    System.out.println(length);
//    System.out.println(c);



  }
}
