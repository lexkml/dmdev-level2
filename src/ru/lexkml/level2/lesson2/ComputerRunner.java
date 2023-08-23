package ru.lexkml.level2.lesson2;

public class ComputerRunner {
  public static void main(String[] args) {
    Computer computer = new Computer();
    computer.load();

    System.out.println();

    computer.printProperties();
  }
}
