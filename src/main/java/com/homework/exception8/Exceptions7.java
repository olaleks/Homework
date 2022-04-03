package com.homework.exception8;

/**
 * —делай так, чтобы программа компилировалась, не использу€ try-catch.
 * “ребовани€:
 * Х	¬ методе main не должно быть блока try-catch.
 * Х	ћетод main должен бросать исключение.
 * Х	ћетод main должен вызывать метод generateLuckyNumber().
 * Х	ћетод generateLuckyNumber измен€ть нельз€.
 */

public class Exceptions7 {

  public static void main(String[] args) throws Exception {
    generateLuckyNumber();
  }

  static void generateLuckyNumber() throws Exception {
    int luckyNumber = (int) (Math.random() * 100);
    if (luckyNumber == 13) {
      throw new Exception("не повезло");
    }
    System.out.println("твое счастливое число: " + luckyNumber);
  }
}
