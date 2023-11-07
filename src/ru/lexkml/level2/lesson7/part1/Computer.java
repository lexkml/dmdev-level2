package ru.lexkml.level2.lesson7.part1;

public class Computer {
  private Ram ram;
  private Ssd ssd;

  public Computer(Ram ram, Ssd ssd) {
    this.ram = ram;
    this.ssd = ssd;
  }

  @Override
  public String toString() {
    return "Computer: " +
        "ram=" + ram.getValue() + ", " +
        "ssd=" + ssd.getValue();
  }
}
