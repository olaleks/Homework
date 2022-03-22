package com.homework.hashmap;

import java.util.ArrayList;

/**
 * В классе Map2 есть метод getProgrammingLanguages,
 * который возвращает список языков программирования. Тебе нужно переписать этот метод, чтобы он возвращал HashMap<Integer, String>.
 * Ключом в этой коллекции будет индекс элемента в ArrayList.
 * Требования:
 * •	В классе Map2 должен быть публичный статический метод getProgrammingLanguages с типом возвращаемого значения HashMap<Integer, String>.
 * •	Метод getProgrammingLanguages() должен возвращать HashMap заполненным в соответствии с списком.
 */

public class Map2 {

  public static void main(String[] args) {
    System.out.println(getProgrammingLanguages());
  }

  public static ArrayList<String> getProgrammingLanguages() {
    //напишите тут ваш код
    ArrayList<String> programmingLanguages = new ArrayList<>();
    programmingLanguages.add("Java");
    programmingLanguages.add("Kotlin");
    programmingLanguages.add("Go");
    programmingLanguages.add("Javascript");
    programmingLanguages.add("Typescript");
    programmingLanguages.add("Python");
    programmingLanguages.add("PHP");
    programmingLanguages.add("C++");
    return programmingLanguages;
  }
}
