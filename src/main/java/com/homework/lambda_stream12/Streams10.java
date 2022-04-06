package com.homework.lambda_stream12;

import java.util.HashSet;
import java.util.Set;
import java.util.stream.Stream;

/**
 * Необходимо, чтобы метод getFilteredStrings(Stream<String>) преобразовывал входящий поток строк во множество строк, длина которых больше шести символов.
 * Реализуй его, используя метод collect() объекта типа Stream<String>.
 * В качестве параметра передай нужный коллектор (объект типа Collector<Set<String>>).
 * Такой объект можно получить, вызвав статический метод toSet() класса Collectors.
 *
 * Метод main() не принимает участие в тестировании.
 * Требования:
 * •	В публичном статическом методе getFilteredStrings(Stream<String>) нужно вызывать статический метод toSet() класса Collectors.
 * •	Метод getFilteredStrings(Stream<String>) нужно реализовать согласно условию.
 */
public class Streams10 {

  public static void main(String[] args) {
    var stringStream = Stream.of("FreeCodeCamp", "CodeGym", "Amigo", "Elly", "Kim", "Risha");

    getFilteredStrings(stringStream).forEach(System.out::println);
  }

  public static Set<String> getFilteredStrings(Stream<String> stringStream) {
    //напишите тут ваш код
    return new HashSet<>();
  }

}
