package com.homework.methods5;

/**
 * Напишем утилиту для работы с массивами. Основная часть функционала готова: метод printArray() выводит в консоли все элементы массива.
 * Тебе осталась мелочь: реализовать метод reverseArray(). Он должен менять порядок элементов массива на обратный.
 * Метод должен работать только с массивами целочисленных значений (int[]).
 *
 * Пример:
 * Если массив содержал элементы:
 * 1, 2, 3, 4, 5, 6, 7, 8, 9, 0
 * то после вызова метода reverseArray() должен содержать:
 * 0, 9, 8, 7, 6, 5, 4, 3, 2, 1
 * Требования:
 * •	Метод reverseArray() должен менять порядок элементов массива на обратный.
 */


public class Method4 {


  public static void main(String[] args) {
    int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 0};
    printArray(array);
    reverseArray(array);
    printArray(array);
  }

  public static void reverseArray(int[] array) {
    for (int i = 0; i < array.length / 2; i++) {
      int a = array[i];
      array[i] = array[array.length - 1 - i];
      array[array.length - 1 - i] = a;

    }
  }

  public static void printArray(int[] array) {
    for (int i : array) {
      System.out.print(i + ", ");
    }
    System.out.println();
  }
}
