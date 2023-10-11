package ru.lexkml.level2.lesson4;

public class Computer {

  public void load() {
    System.out.println("Я загрузился!");
  }

  public void load(boolean open) {
    if (open) {
      System.out.println("Я загрузился и открыл крышку!");
    } else {
      System.out.println("Я загрузился с закрытой крышкой!");
    }
  }
}
