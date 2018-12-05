package ua.org.oa.kraspu;

public class Main {


  public static void main(String[] args) {

    MyImpl my = new MyImpl("Hello my friend");
    int length = my.length();
    char c = my.charAt(2);
    System.out.println(length);
    System.out.println(c);

  }
}
