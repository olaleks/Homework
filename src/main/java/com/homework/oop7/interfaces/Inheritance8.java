package com.homework.oop7.interfaces;

/**
 * Существуют 2 интерфейса — Swimmable и Flyable, указывающие на то, что объект умеет плавать и/или летать соответственно.
 * Расставь эти интерфейсы для классов Zeppelin (Дирижабль), Ship (Корабль) и JamesBondCar (Машина Джеймса Бонда) в соответствии с их возможностями.
 *
 * Помни: машина Джеймса Бонда умеет все.
 * Требования:
 * •	Класс Zeppelin должен имплементировать интерфейс Flyable.
 * •	Класс Ship должен имплементировать интерфейс Swimmable.
 * •	Класс JamesBondCar должен имплементировать интерфейсы Flyable и Swimmable.
 */

public class Inheritance8 {

  public class Ship implements Swimmable {
  }

  public interface Swimmable {
  }

  public class JamesBondCar implements Flyable, Swimmable {
  }

  public class Zeppelin implements Flyable{
  }

  public interface Flyable {
  }
}
