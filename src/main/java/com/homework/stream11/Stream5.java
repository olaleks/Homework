package com.homework.stream11;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Set;

/**
 Программа считывает из консоли строку и выводит список букв, из которых состоит введенная строка.
 Не меняя функциональности программы, перепиши код с использованием Scanner для чтения из консоли.
 Требования:
 •	Программа должна считать из консоли строку и вывести на экран список букв, из которых состоит введенная строка.
 •	Для чтения из консоли в программе должен быть использован Scanner вместо BufferedReader.
 */
public class Stream5 {

  public static void main(String[] args) {
    try (InputStream stream = System.in;
        InputStreamReader reader = new InputStreamReader(stream);
        BufferedReader buff = new BufferedReader(reader)) {
      String line = buff.readLine();
      char[] chars = line.toCharArray();
      Set<Character> characters = new HashSet<>();
      for (char aChar : chars) {
        if (Character.isAlphabetic(aChar)) {
          characters.add(Character.toLowerCase(aChar));
        }
      }
      System.out.println(characters);
    } catch (IOException e) {
      System.out.println("Something went wrong : " + e);
    }
  }
}
