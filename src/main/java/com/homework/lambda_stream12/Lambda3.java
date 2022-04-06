package com.homework.lambda_stream12;

import java.util.ArrayList;
import java.util.Collections;

/**
 * В классе Lambda3 публичный метод print(ArrayList<String>) выводит в консоли все элементы списка по порядку.
 * Сейчас метод реализован с использованием метода списка forEach().
 * Необходимо переписать реализацию метода print(ArrayList<String>), используя оператор for, не меняя логику работы метода.
 *
 * Метод main() не принимает участие в тестировании.
 * Требования:
 * •	В методе print(ArrayList<String>) нужно использовать оператор for.
 * •	В методе print(ArrayList<String>) не нужно использовать метод списка forEach().
 * •	В методе print(ArrayList<String>) нужно выводить в консоли все элементы полученного списка по порядку.
 */
public class Lambda3 {

  public static void main(String[] args) {
    var strings = new ArrayList<String>();
    Collections.addAll(strings, "Hello", "Amigo", "JavaRush", "CodeGym");

    print(strings);
  }

  public static void print(ArrayList<String> strings) {
    strings.forEach(System.out::println);
  }
}
