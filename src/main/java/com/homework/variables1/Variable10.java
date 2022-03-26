package com.homework.variables1;

import java.nio.channels.ScatteringByteChannel;
import java.util.Scanner;

/**
 * Напиши программу, которая считывает с клавиатуры два вещественных числа (double) и выдает сообщение о том, равны ли эти числа с точностью до одной миллионной.
 * Требования:
 * •	Программа должна считывать два числа c клавиатуры.
 * •	Если числа равны, то программа должна вывести сообщение "числа равны".
 * •	Если числа не равны, то программа должна вывести сообщение "числа не равны".
 * •	Точность сравнения должна достигать одной миллионной (0.000001).
 */

public class Variable10 {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    double num1 = scanner.nextDouble();
    double num2 = scanner.nextDouble();
    double res =  num1/num2;
    double scale = Math.pow(10,6);
    double result = Math.ceil(res * scale) / scale;
    if (result == 1){
    System.out.println("числа равны");
    } else{
      System.out.println("числа не равны");
    }
  }
}
