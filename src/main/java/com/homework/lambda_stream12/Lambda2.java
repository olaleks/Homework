package com.homework.lambda_stream12;

import java.util.ArrayList;
import java.util.Collections;

/**
 * В классе Lambda2 публичный метод print(ArrayList<Integer>) выводит в консоли все элементы списка по порядку.
 * Сейчас метод реализован с использованием оператора for. Необходимо переписать реализацию метода print(ArrayList<Integer>),
 * используя метод списка forEach(), принимающий лямбда-выражение. Логику работы метода print(ArrayList<Integer>) менять не нужно.
 *
 * Метод main() не принимает участие в тестировании.
 * Требования:
 * •	В методе print(ArrayList<Integer>) нужно использовать метод списка forEach(), принимающий лямбда-выражение.
 * •	В методе print(ArrayList<Integer>) не нужно использовать оператор for.
 * •	В методе print(ArrayList<Integer>) нужно выводить в консоли все элементы полученного списка по порядку.
 */
/*
Знакомство с foreach
*/
public class Lambda2 {


  public static void main(String[] args) {
    var numbers = new ArrayList<Integer>();
    Collections.addAll(numbers, 1, 2, 3, 4, 5, 6, 7, 8, 9, 0);

    print(numbers);
  }

  public static void print(ArrayList<Integer> numbers) {
    for (int i = 0; i < numbers.size(); i++) {
      System.out.println(numbers.get(i));
    }
  }
}
