package ua.org.oa.kraspu;

import java.util.ArrayList;

public class Main {


  public static void main(String[] args) {

    String pathToFile = "src\\ua\\org\\oa\\kraspu\\Test.txt";

    // 1-ый способ - считываем текст файла в массив строк

    ArrayList<String> aL = TextFileInputStream.fileReadLineToArray(pathToFile);

    TextFileInputStream.fileOutput(aL); // вывод содержимого файла

    TextFileInputStream.toWordArr(aL);

    // вывод результата!
    // Добавлена возможность вывода только тех слов, которые встречаются 2 и более раза! (twiceAndMore = true)
//    Processing.result(TextFileInputStream.words, TextFileInputStream.counts, true);
    Processing.result(TextFileInputStream.words, TextFileInputStream.counts, false);


    // 2-ой способ - переводим текст файла в массив слов

//    TextFileReader.fileOut(pathToFile); //можно так вывести текст файла на экран

    String text = TextFileReader.textToArray(pathToFile);
    System.out.println(text); // а можно и так вывести текст! и так проще
    TextFileReader.toWordArr(text);

    // вывод результата!
    // Добавлена возможность вывода только тех слов, которые встречаются 2 и более раза! (twiceAndMore = true)
    Processing.result(TextFileReader.words, TextFileReader.counts, true);
//    Processing.result(TextFileReader.words, TextFileReader.counts, false);


  }
}
