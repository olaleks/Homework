package com.homework.lambda_stream12;

import java.util.HashMap;
import java.util.Map;
import java.util.stream.Stream;

/**
 * Необходимо, чтобы метод getMap(Stream<String>) преобразовывал входящий поток строк в карту (map),
 * ключом которой является сама строка, а значением — её длина.
 * Реализуй его, используя метод collect() объекта типа Stream<String>.
 * В качестве параметра передай нужный коллектор (объект типа Collector<Map<String, Integer>>).
 * Такой объект можно получить, вызвав статический метод toMap() класса Collectors.
 *
 * Метод main() не принимает участие в тестировании.
 * Требования:
 * •	В публичном статическом методе getMap(Stream<String>) нужно вызывать статический метод toMap() класса Collectors.
 * •	Метод getMap(Stream<String>) нужно реализовать согласно условию.
 */
public class Streams11 {

  public static void main(String[] args) {
    var stringStream = Stream.of("FreeCodeCamp", "CodeGym", "Amigo", "Elly", "Kim", "Risha");

    getMap(stringStream).forEach((s, i) -> System.out.println(s + " - " + i));
  }

  public static Map<String, Integer> getMap(Stream<String> stringStream) {
    //напишите тут ваш код
    return new HashMap<>();
  }
}
