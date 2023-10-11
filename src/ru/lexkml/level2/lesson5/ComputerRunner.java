package ru.lexkml.level2.lesson5;

public class ComputerRunner {
  public static void main(String[] args) {
    int ssd = 512;
    int ram = 16;

    var computer = new Computer(ssd, ram);
    var computerRam = computer.ram;

//    var computerSsd = computer.ssd; Не будет работать, так как поле ssd является private в классе Computer
//    computer.load(); Не будет работать метод load() без параметров, так как он является private в классе Computer
    computer.load(true); // Будет работать, так как он является public в классе Computer
  }
}
