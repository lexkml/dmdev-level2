package ru.lexkml.level2.lesson10;

import java.util.ArrayList;
import java.util.List;

public class StringRunner {
  public static void main(String[] args) {
    var arguments = new String[]{};

    printHeader(Task1.class);
    Task1.main(arguments);
    printTail();

    printHeader(Task2.class);
    Task2.main(arguments);
    printTail();

    printHeader(Task3.class);
    Task3.main(arguments);
    printTail();

    printHeader(Task4.class);
    Task4.main(arguments);
    printTail();

    printHeader(Task5.class);
    Task5.main(arguments);
    printTail();
  }

  private static void printHeader(Class<?> clazz) {
    System.out.println("__________________________");
    System.out.println(clazz.getSimpleName() + ":");
  }

  private static void printTail() {
    System.out.println("__________________________");
  }

  private static class Task1 {
    public static void main(String[] args) {
      var str = "asdsad :( asdas :( asdsadg :( asdfg :) asdgg :( alalla :)";
      System.out.printf("Старая строка: '%s'\n", str);
      var result = replaceSadSmiles(str);
      System.out.printf("Новая строка: '%s'\n", result);
    }

    private static String replaceSadSmiles(String str) {
      return str.replace(":(", ":)");
    }
  }

  private static class Task2 {
    public static void main(String[] args) {
      var str = "Hello, my friend! Hello";
      var word1 = "hello";
      var result = isStartAndEnd(str, word1);
      System.out.printf("Заканчивается ли строка: '%s', на слово '%s'?%n", str, word1);
      System.out.println(result);

      var word2 = "friend";
      result = isStartAndEnd(str, word2);
      System.out.printf("Заканчивается ли строка: '%s', на слово '%s'?%n", str, word2);
      System.out.println(result);
    }

    private static boolean isStartAndEnd(String target, String word) {
      target = target.toLowerCase();
      word = word.toLowerCase();
      return target.startsWith(word) && target.endsWith(word);
    }
  }

  private static class Task3 {
    public static void main(String[] args) {
      var str = "Alexandr Alexandrovich Kamelchukov";
      System.out.printf("ФИО полностью: '%s'\n", str);
      var result = convertToInitials(str);
      System.out.printf("Инициалы: '%s'\n", result);
    }

    private static String convertToInitials(String str) {
      var splittedStr = str.split(" ");
      var result = new StringBuilder();

      for (String word : splittedStr) {
        result.append(word.charAt(0)).append(".");
      }

      return result.toString().toUpperCase();
    }
  }

  private static class Task4 {
    public static void main(String[] args) {
      var str = "asdlkjgfds.,!asdfg.,?asgffgd!asgsd";
      System.out.printf("Исходная строка: '%s'\n", str);
      int count = countSpecialCharacters(str);
      System.out.println("Количество символов .,!,?: " + count);
    }

    public static int countSpecialCharacters(String str) {
      int count = 0;
      for (int i = 0; i < str.length(); i++) {
        char ch = str.charAt(i);
        if (ch == '.' || ch == ',' || ch == '!' || ch == '?') {
          count++;
        }
      }
      return count;
    }
  }

  private static class Task5 {
    public static void main(String[] args) {
      var str = "Примердлиннойстрокидляразбиения";
      System.out.println("Исходная строка: " + str);
      var parts = splitStringIntoParts(str, 5);
      System.out.print("Результат: ");
      for (String part : parts) {
        System.out.print(part + " ");
      }
      System.out.println();
    }

    public static List<String> splitStringIntoParts(String str, int n) {
      List<String> parts = new ArrayList<>();

      for (int i = 0; i < str.length(); i += n) {
        parts.add(str.substring(i, Math.min(i + n, str.length())));
      }

      return parts;
    }
  }
}

