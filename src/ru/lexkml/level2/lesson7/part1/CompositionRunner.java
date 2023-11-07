package ru.lexkml.level2.lesson7.part1;

public class CompositionRunner {
  public static void main(String[] args) {
    var ram = new Ram(32);
    var ssd = new Ssd(512);
    var computer = new Computer(ram, ssd);
    System.out.println(computer);
  }
}
