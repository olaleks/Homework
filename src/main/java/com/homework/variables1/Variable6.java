package com.homework.variables1;

/**
 * Заполни пробелы пустотой... или наоборот.
 *
 * Используй переменную emptiness, строки с одним пробелом и конкатенацию строк, чтобы записать в переменную fullness строку "пустота пустота пустота".
 * Требования:
 * •	Не изменяй значение переменной emptiness.
 * •	Переменную fullness нужно инициализировать в одну строку, используя переменную emptiness, строки с одним пробелом и конкатенацию строк.
 * •	Программа должна выводить на экран значение переменной fullness.
 */

public class Variable6 {

  public static void main(String[] args) {
    String emptiness = "пустота";

    String fullness = " ";

    System.out.println(emptiness + fullness + emptiness + fullness + emptiness);
  }
}

