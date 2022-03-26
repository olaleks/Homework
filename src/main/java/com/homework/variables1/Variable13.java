package com.homework.variables1;

/**
 * Посмотри, что делает программа. Расставь модификатор final общепринятым константам (переменным с неизменными значениями).
 * Требования:
 * •	Модификатор final должен быть установлен всем константам.
 */

public class Variable13 {

  public static final double pi = 3.14;
  public static double radius = 2.5;
  public static double diameter = 5;

  public static void main(String[] args) {
    System.out.println("Плошадь круга равна: " + pi * radius * radius);
    System.out.println("Периметр круга равен: " + pi * diameter);
  }
}
