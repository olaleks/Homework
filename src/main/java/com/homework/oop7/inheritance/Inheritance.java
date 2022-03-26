package com.homework.oop7.inheritance;

/**
 * Построй правильную цепочку наследования классов.
 * Женщина должна наследоваться от человека, а человек от землянина.
 * Требования:
 * •	Класс Woman должен наследоваться от класса Human.
 * •	Класс Human должен наследоваться от класса Terran.
 */

public class Inheritance {

  public class Woman extends Human {
  }

  public class Terran {
  }

  public class Human extends Terran{
  }
}
