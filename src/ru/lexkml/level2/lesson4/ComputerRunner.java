package ru.lexkml.level2.lesson4;

public class ComputerRunner {
  public static void main(String[] args) {
    var computer = new Computer();
    computer.load();

    var computer2 = new Computer();
    computer2.load(true);

    var computer3 = new Computer();
    computer3.load(false);
  }
}
