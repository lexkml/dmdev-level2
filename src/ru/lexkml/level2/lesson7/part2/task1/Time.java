package ru.lexkml.level2.lesson7.part2.task1;

public class Time {
  private final int hours;
  private final int minutes;
  private final int seconds;

  public Time(int seconds) {
    this.hours = seconds / 3600;
    this.minutes = (seconds % 3600) / 60;
    this.seconds = seconds % 60;
  }

  public Time(int hours, int minutes, int seconds) {
    this.hours = hours;
    this.minutes = minutes;
    this.seconds = seconds;
  }

  public int getTotalSeconds() {
    return hours * 3600 + minutes * 60 + seconds;
  }

  public void printTime() {
    System.out.println(getHours() + ":" + getMinutes() + ":" + getSeconds());
  }

  public int getSeconds() {
    return seconds;
  }

  public int getMinutes() {
    return minutes;
  }

  public int getHours() {
    return hours;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    Time time = (Time) o;
    return hours == time.hours && minutes == time.minutes && seconds == time.seconds;
  }
}
