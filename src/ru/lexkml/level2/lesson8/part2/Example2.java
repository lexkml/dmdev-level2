package ru.lexkml.level2.lesson8.part2;

import ru.lexkml.level2.lesson7.part2.task1.Time;

public class Example2 {
  public static void main(String[] args) {
    Time time2 = new Time(1, 1, 1);
    Time time3 = new Time(3661);

    System.out.println(time2.equals(time3)); // Ожидаемый вывод: true
  }
}
