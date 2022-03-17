package com.homework.variables1;

import java.util.Scanner;

/**
 * В методе main вызови метод div() 2 раза. Первый раз — с такими аргументами, чтобы вывод в консоли был "Infinity", а второй — "-Infinity".
 * Код метода div() изменять нельзя.
 * Требования:
 * •	В методе main() метод div() должен вызываться 2 раза.
 * •	Результатом двух вызовов метода div() должен быть вывод в консоли "Infinity" и "-Infinity".
 * •	Код метода div() не изменяй.
 */

public class Variable17 {

  public static void main(String[] args) {
    Scanner scanner = new Scanner (System.in);

    int k = scanner.nextInt (); {

      if (k > 0 && k < 10)
      {
        System.out.println("Это однозначное положительное число");
      }
      else if (k > 9 && k < 100) {

        System.out.println("Это двухзначное положительное число");
      }
      else if (k > 99 && k < 1000) {

        System.out.println ("Это трехзначное положительное число");
      }

      else if (k < 0 && k > -10) {

        System.out. println ("Это однозначное отрицательно число");
      }

      else if (k <-9 && k > -100) {

        System.out.println ("Это двухзначное отрицательное число ");
      }

      else if (k < -99 && k > -1000) {

        System.out.println ("Это трехзначное отрицательно число");
      }

      else {
        System.out.println("Другое");
      }
    }
  }

  public static void div(double a, double b){
    System.out.println(b/a);
  }
}
