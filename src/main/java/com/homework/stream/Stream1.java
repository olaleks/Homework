package com.homework.stream;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Scanner;

/**
 * Напиши программу, которая считывает с консоли путь к файлу1 и путь к файлу2.
 * Далее все байты из файла1 записывает в файл2, но при этом меняет их местами по такому принципу: первый со вторым, третий с четвертым, и т.д.
 * Если последний байт в файле1 нечетный, то пишем его в файл2 как есть.
 * Для чтения и записи файлов используй методы newInputStream и newOutputStream класса Files.
 * Требования:
 * •	Программа должна считать с консоли пути к файлам.
 * •	Программа должна переписывать байты из одного файла в другой согласно условию.
 * •	Для чтения и записи файлов должны быть использованы методы newInputStream и newOutputStream класса Files.
 * •	Потоки для чтения и записи должны быть закрыты.
 * •	Не используй следующие классы File, FileInputStream, FileOutputStream, FileReader, FileWriter пакета java.io.
 */

public class Stream1 {

    public static void main(String[] args) throws IOException {
      try (Scanner scanner = new Scanner(System.in);
          InputStream inputStream = Files.newInputStream(Paths.get(scanner.nextLine()));
          OutputStream outputStream = Files.newOutputStream(Paths.get(scanner.nextLine()))
      ) {
        byte[] bytesIn = inputStream.readAllBytes();
        byte[] bytesOut = new byte[bytesIn.length];
        for (int i = 0; i < bytesIn.length; i ++) {
          if (i < bytesIn.length - 1) {
            bytesOut[i] = bytesIn[i + 1];
            bytesOut[i + 1] = bytesIn[i];
          } else {
            bytesOut[i] = bytesIn[i];
          }
        }
        outputStream.write(bytesOut);
      } catch (IOException e) {
        System.out.println("Something went wrong : " + e);
      }
    }
}

