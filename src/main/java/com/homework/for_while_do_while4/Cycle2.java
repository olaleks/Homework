package com.homework.for_while_do_while4;

import java.util.Scanner;

/**
 * Напишем программу, в которой нужно вводить с клавиатуры целые числа и считать их сумму, пока пользователь не введет слово "ENTER".
 * Вывести на экран полученную сумму и завершить программу.
 * Требования:
 * •	Программа должна считывать данные c клавиатуры.
 * •	Программа должна выводить данные на экран, если пользователь ввел слово "ENTER".
 * •	Необходимо посчитать сумму введенных целых чисел и вывести её на экран.
 * •	В программе необходимо использовать цикл while.
 */

public class Cycle2 {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    String word = "ENTER";
    int sum = 0;
    while(scanner.hasNext()){
      if (scanner.hasNextInt()) {
        int n = scanner.nextInt();
        sum = sum + n;
      } else {
        String notNum = scanner.nextLine();
        if (notNum.equals(word)) {
          break;
        }
      }
    }
    scanner.close();
    System.out.println(sum);
  }
}
