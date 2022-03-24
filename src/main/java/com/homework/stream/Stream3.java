package com.homework.stream;

import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;
import java.util.Scanner;

/**
 * Напиши программу, которая считывает из консоли имя текстового файла,
 * далее читает символы из этого файла (используй метод readAllLines(Path) класса Files) и выводит на экран все,
 * за исключением точки, запятой и пробела.
 * Требования:
 * •	Программа должна считать с консоли путь к файлу.
 * •	Программа должна вывести в консоль содержимое файла согласно условию.
 * •	Для чтения строк из файла должен быть использован метод readAllLines(Path) класса Files.
 * •	Не используй следующие классы: File, FileInputStream, FileOutputStream, FileReader, FileWriter пакета java.io.
 */
public class Stream3 {

  public static void main(String[] args) {
    try (Scanner scanner = new Scanner(System.in)) {
      List<String> lines = Files.readAllLines(Paths.get(scanner.nextLine()));
      for (String str: lines) {
        char[] chars = str.toCharArray();
        for (char character : chars) {
          if (character != ' ' && character != ',' && character != '.') {
            System.out.println(character);
          }
        }
      }
    } catch (Exception e) {
      System.out.println("Something went wrong : " + e);
    }
  }
}
