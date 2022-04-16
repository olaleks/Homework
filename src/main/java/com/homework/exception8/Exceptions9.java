package com.homework.exception8;

import java.io.FileNotFoundException;
import java.nio.file.FileSystemException;

/**
 * В методе main перехвати RuntimeException. Определи, какое исключение в нем сохранено.
 * Если это FileNotFoundException, выведи в консоли сообщение: "Не удалось прочесть файл.", а если FileSystemException — "Не удалось записать в файл.".
 * Требования:
 * •	В методе main должно перехватываться RuntimeException.
 * •	Нужно вывести "Не удалось прочесть файл.", если в RuntimeException упаковано FileNotFoundException.
 * •	Нужно вывести "Не удалось записать в файл.", если в RuntimeException упаковано FileSystemException.
 * •	Класс FileManager не изменяй.
 */

public class Exceptions9 {


  public static final String FAILED_TO_READ = "Не удалось прочесть файл.";
  public static final String FAILED_TO_WRITE = "Не удалось записать в файл.";

  public static FileManager fileManager = new FileManager();

  public static void main(String[] args) {
    try {
      fileManager.copyFile("book.txt", "book_final_copy.txt");
      fileManager.copyFile("book_final_copy.txt", "book_last_copy.txt");
    } catch (RuntimeException e){
      if (e.getCause() instanceof FileNotFoundException){
        System.out.println(FAILED_TO_READ);
      }
      if (e.getCause() instanceof FileSystemException){
        System.out.println(FAILED_TO_READ);
      }
    }
  }
}
