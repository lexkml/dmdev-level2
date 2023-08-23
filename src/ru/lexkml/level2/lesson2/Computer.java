package ru.lexkml.level2.lesson2;

public class Computer {
  int ssd = 500;
  int ram = 1024;

  void load() {
    System.out.println("Привет! Я - экзмепляр класса `Computer`. Я загрузился!");
  }

  void printProperties() {
    System.out.println("Мои свойства: ");
    System.out.println("ram - " + ram);
    System.out.println("ssd - " + ssd);
  }
}
