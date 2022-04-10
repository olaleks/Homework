package com.homework.lambda_stream12;

import java.util.stream.Stream;

/**
 * Необходимо, чтобы метод getString(Stream<String>) преобразовывал входящий поток строк в строку,
 * слова в которой нужно разделить пробелом. Порядок слов в строке должен соответствовать порядку элементов в потоке.
 * Реализуй его, используя метод collect() объекта типа Stream<String>.
 * В качестве параметра передай нужный коллектор (объект типа Collector<String>).
 * Такой объект можно получить, вызвав статический метод joining() класса Collectors.
 *
 * Метод main() не принимает участие в тестировании.
 * Требования:
 * •	В публичном статическом методе getString(Stream<String>) нужно вызывать статический метод joining() класса Collectors.
 * •	Метод getString(Stream<String>) нужно реализовать согласно условию.
 */
public class Streams12 {

  public static void main(String[] args) {
    var stringStream = Stream.of("To", "be", "a", "programmer", "you", "need", "to", "code");

    System.out.println(getString(stringStream));
  }

  public static String getString(Stream<String> stringStream) {
    //напишите тут ваш код
    return "";
  }

}
