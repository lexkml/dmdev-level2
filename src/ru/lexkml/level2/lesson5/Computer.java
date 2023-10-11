package ru.lexkml.level2.lesson5;

public class Computer {
  private int ssd;
  public int ram;

  public Computer(int ssd, int ram) {
    this.ssd = ssd;
    this.ram = ram;
    load();
  }

  private void load() {
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
