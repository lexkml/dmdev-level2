package ru.lexkml.level2.lesson7.part1;

public class Ssd {
  private int value;

  public Ssd(int value) {
    this.value = value;
  }

  public int getValue() {
    return value;
  }

  public void setValue(int value) {
    this.value = value;
  }

  @Override
  public String toString() {
    return "Ssd{" +
        "value=" + value +
        '}';
  }
}
