package com.homework.for_while_do_while4;

/**
 * Используя вложенные циклы while (цикл в цикле) выведи на экран прямоугольник размером 5 (высота) на 10 (ширина), заполненный буквой 'Q'.
 *
 * Пример вывода:
 * QQQQQQQQQQ
 * QQQQQQQQQQ
 * QQQQQQQQQQ
 * QQQQQQQQQQ
 * QQQQQQQQQQ
 * Требования:
 * •	Программа должна выводить текст на экран.
 * •	Программа должна выводить прямоугольник высотой 5 и шириной 10, заполненный буквами 'Q'.
 * •	В программе необходимо использовать вложенные циклы while (цикл в цикле).
 * •	Вывод на экран должен происходить в цикле while.
 */

public class Cycle3 {

  public static void main(String[] args) {
    int h = 0;
    while (h < 5){
      int w = 0;
      while (w < 10){
        System.out.print("Q");
        w++;
      }
      System.out.println();
      h++;
    }
  }
}
