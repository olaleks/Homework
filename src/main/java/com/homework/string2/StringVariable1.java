package com.homework.string2;

/**
 * В методе main напиши код попарного сравнения по ссылке строк string1, string2 и string3 с выводом соответствующего сообщения после каждого сравнения:
 * "ссылки на строки одинаковые" или "ссылки на строки разные".
 *
 * Порядок сравнения должен быть следующим:
 * - строку string1 со строкой string2
 * - строку string1 со строкой string3
 * - строку string2 со строкой string3.
 * Требования:
 * •	Поля string1, string2 и string3 и их значения изменять нельзя.
 * •	В методе main должно быть сравнение строк string1 и string2 по ссылке.
 * •	В методе main должно быть сравнение строк string2 и string3 по ссылке.
 * •	В методе main должно быть сравнение строк string1 и string3 по ссылке.
 * •	Программа должна выводить соответствующие сообщения на экран.
 * •	Программа должна выводить на экран 3 строки.
 */

public class StringVariable1 {

  public static String string1 = "Амиго";
  public static String string2 = string1;
  public static String string3 = new String(string1);

  public static void main(String[] args) {
    String same = "ссылки на строки одинаковые";
    String different = "ссылки на строки разные";
    if (string1 == string2) {
      System.out.println(same + " при сравнении строк 1 и 2");
    } else {
      System.out.println(different + " при сравнении строк 1 и 2");
    }
    if (string2 == string3) {
      System.out.println(same + " при сравнении строк 2 и 3");
    } else {
      System.out.println(different + " при сравнении строк 2 и 3");
    }
    if (string1 == string3) {
      System.out.println(same +" при сравнении строк 1 и 3");
    } else {
      System.out.println(different + " при сравнении строк 1 и 3");
    }
  }
}
