package com.homework.hashmap10;

import java.util.Arrays;
import java.util.HashSet;

/**
 * В классе Set3 есть метод print(HashSet<String>), который должен выводить в консоли все элементы множества, используя iterator().
 * Метод main не участвует в проверке.
 * Требования:
 * •	В классе Set3 должен быть публичный статический метод print(HashSet<String>) с типом возвращаемого значения void.
 * •	Метод print(HashSet<String>) должен работать согласно условию.
 */
public class Set3 {

  public static void print(HashSet<String> words) {
    //напишите тут ваш код
  }

  public static void main(String[] args) {
    HashSet<String> words = new HashSet<>(Arrays.asList("Программированию обычно учат на примерах.".split(" ")));
    print(words);
  }
}
