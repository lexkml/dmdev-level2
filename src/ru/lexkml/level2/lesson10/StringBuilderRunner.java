package ru.lexkml.level2.lesson10;

public class StringBuilderRunner {
  public static void main(String[] args) {
    var startTime = System.currentTimeMillis();
    var str = "";
    for (int i = 0; i < 100_000; i++) {
      str += i;
    }

    var endTime = System.currentTimeMillis();
    System.out.println("Time (if value is String): " + (endTime - startTime));
    System.out.println("___________________________________");

    startTime = System.currentTimeMillis();
    var strBuilder = new StringBuilder();
    for (int i = 0; i < 100_000; i++) {
      strBuilder.append(i);
    }

    endTime = System.currentTimeMillis();
    System.out.println("Time (if value is String): " + (endTime - startTime));
  }
}
