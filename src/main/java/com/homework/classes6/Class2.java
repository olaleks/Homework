package com.homework.classes6;

/**
 *
 В методе main конвертируй строку string в тип double с помощью статического метода parseDouble класса Double.
 Затем округли полученное значение, используя статический метод round класса Math.
 Результат выведи на экран.
 Требования:
 •	В методе main должен вызываться метод parseDouble класса Double.
 •	В методе main должен вызываться метод round класса Math.
 •	В консоли должно выводиться число 13.
 */

public class Class2 {

  public static void main(String[] args) {
    String string = "12.84";
    double doubleFromString = Double.parseDouble(string);
    System.out.println(Math.round(doubleFromString));
  }
}

