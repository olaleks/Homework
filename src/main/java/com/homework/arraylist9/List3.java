package com.homework.arraylist9;

import java.util.ArrayList;

/**
 * В классе List3 есть метод printAnything(ArrayList), который должен принимать список и выводить его содержимое в консоли.
 * Сейчас на вход принимается только список строк.
 * Твоя задача исправить метод так, чтобы принимался список с любыми типами данных (для этого нужно удалить соответствующий дженерик).
 * Метод main не участвует в проверке.
 * Требования:
 * •	Исправь сигнатуру метода printAnything, чтобы он принимал список с любыми типами данных.
 */

public class List3 {

  public static void printAnything(ArrayList<Object> arrayList) {
    for (int i = 0; i < arrayList.size(); i++) {
      System.out.println(arrayList.get(i));
    }
  }

  public static void main(String[] args) {
    var arrayList = new ArrayList<>();
    arrayList.add(15);
    arrayList.add("Hello");
    arrayList.add(154);
    arrayList.add("string2");

    printAnything(arrayList);
  }
}
