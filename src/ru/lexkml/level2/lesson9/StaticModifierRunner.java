package ru.lexkml.level2.lesson9;

public class StaticModifierRunner {
  public static void main(String[] args) {
    Computer computer = new Computer(new Ram(16), new Ssd(512));
    Computer computer2 = new Computer(new Ram(16), new Ssd(512));
    Computer computer3 = new Computer(new Ram(16), new Ssd(512));
    Computer computer4 = new Computer(new Ram(16), new Ssd(512));
    Computer computer5 = new Computer(new Ram(16), new Ssd(512));

    var generalCountOfCreatedComputers = Computer.getCount();
    System.out.println(generalCountOfCreatedComputers);
  }
}
