package ru.lexkml.level2.lesson7.part2.task1;

public class TimeIntervalRunner {
  public static void main(String[] args) {
    var time = new Time(60661);
    time.printTime();

    var time2 = new Time(16, 51, 1);
    time2.printTime();

    System.out.println(time.equals(time2));
  }
}
