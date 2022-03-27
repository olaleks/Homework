package com.homework.hashmap10;

import java.util.HashMap;

/**
 *В классе Map объявлено поле grades типа HashMap<String, Double>, где ключ — имя и фамилия студента, а значение - его средняя оценка.
 *   задача — реализовать методы:
 * printStudents, который выводит только имена всех студентов (ключ коллекции);
 * getAverageMark, который возвращает средний балл всех студентов.
 * Требования:
    В классе Map1 нужно инициализировать публичное статическое поле grades типа HashMap<String, Double>.
 •	Метод printStudents должен выводить всех студентов (имя и фамилия) из коллекции grades с новой строки.
 •	Метод getAverageMark должен возвращать средний балл всех студентов из коллекции grades.
 */
public class Map1 {

  public static HashMap<String, Double> grades = new HashMap<>();

  public static void main(String[] args) {
    addStudents();
    System.out.println("Список студентов группы: ");
    printStudents();
    System.out.print("Средний балл группы: " + getAverageMark());
  }

  public static void addStudents() {
    grades.put("Давыдов Олег", 4.3d);
    grades.put("Шульга Николай", 4.1d);
    grades.put("Колос Василий", 4.9d);
    grades.put("Шевченко Тарас", 3.7d);
    grades.put("Марчук Любослав", 3.2d);
  }

  //реализовать метод printStudents, который выводит только имена всех студентов (ключ коллекции);
  public static void printStudents() {
    //напишите тут ваш код
  }

  //реализовать метод getAverageMark, который возвращает средний балл всех студентов.
  public static Double getAverageMark() {
    return null;//напишите тут ваш код
  }
}
