package ru.lexkml.level2.lesson3;

public class Computer {
  int ssd;
  int ram;

  public Computer() {
    System.out.printf("Привет! Я был создан конструктором по умолчанию, без каких-либо параметров! Мои свойства: SSD=%d, RAM=%d%n", ssd, ram);
  }

  public Computer(int ssd) {
    this.ssd = ssd;
    System.out.printf("Привет! Я был создан перегруженным конструктором, имеющим в параметрах только SSD! Мои свойства: SSD=%d, RAM=%d%n", ssd, ram);
  }

  public Computer(int ssd, int ram) {
    this.ssd = ssd;
    this.ram = ram;
    System.out.printf("Привет! Я был создан перегруженным конструктором, имеющим в параметрах как SSD, так и RAM! Мои свойства: SSD=%d, RAM=%d%n", ssd, ram);
  }
}
