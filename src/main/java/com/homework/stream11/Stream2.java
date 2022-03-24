package com.homework.stream11;

import java.io.InputStream;
import java.io.OutputStream;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Scanner;

/**
 * Есть программа, которкая считывает из консоли путь к файлу1 и путь к файлу2 и копирует содержимое файла1 в файл2.
 *  * Но она не работает корректно. Найди и исправь ошибки в оде, чтобы программа заработала как нужно.
 * Требования:
 * •	Программа должна считать с консоли пути к файлам.
 * •	Программа должна переписывать содержимое из одного файла в другой.
 * •	Потоки для чтения и записи должны быть закрыты.
 * •	Не используй следующие классы: File, FileInputStream, FileOutputStream, FileReader, FileWriter пакета java.io.
 */

public class Stream2 {
  public static void main(String[] args) {
    try (Scanner scanner = new Scanner(System.in);
        InputStream inputStream = Files.newInputStream(Paths.get(scanner.nextLine()));
        OutputStream outputStream = Files.newOutputStream(Paths.get(scanner.nextLine()))
    ) {
      int size = 1024;
      byte[] buffer = new byte[size];
      while (inputStream.available() > 0) {
        int read = inputStream.read();
        outputStream.write(buffer, size, read);
        System.out.println(read);
      }
    } catch (Exception e) {
      System.out.println("Something went wrong : " + e);
    }
  }
}
