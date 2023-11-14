package ru.lexkml.level2.lesson9;

public class Ram {
  private int value;

  public Ram(int value) {
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
    return "Ram{" +
        "value=" + value +
        '}';
  }
}
