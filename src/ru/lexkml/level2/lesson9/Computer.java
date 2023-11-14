package ru.lexkml.level2.lesson9;

public class Computer {
  private final Ram ram;
  private final Ssd ssd;
  private static int count = 0;

  public Computer(Ram ram, Ssd ssd) {
    this.ram = ram;
    this.ssd = ssd;
    count++;
  }

  public static int getCount() {
    return count;
  }

  @Override
  public String toString() {
    return "Computer: " +
        "ram=" + ram.getValue() + ", " +
        "ssd=" + ssd.getValue();
  }
}
