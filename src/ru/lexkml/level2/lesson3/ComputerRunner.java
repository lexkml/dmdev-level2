package ru.lexkml.level2.lesson3;

public class ComputerRunner {
  public static void main(String[] args) {
    var computer = new Computer();

    int ssd = 512;
    int ram = 16;

    var computerWithSsdOnly = new Computer(ssd);
    var computerWithSsdAndRam = new Computer(ssd, ram);
  }
}
