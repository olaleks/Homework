package com.homework.exception8;

/**
 * В методе copyFile перехвати исключения, которые бросают методы readFile и writeFile.
 * Перехваченные исключения оберни в RuntimeException и пробрось дальше.
 * Требования:
 * •	В методе copyFile должны перехватываться FileNotFoundException и FileSystemException.
 * •	Все перехваченные исключения нужно оборачивать в RuntimeException и пробрасывать дальше.
 * •	У метода copyFile не должно быть исключений в секции throws.
 */
public class Exceptions8 {

  public static void main(String[] args) {
    copyFile("book.txt", "book_final_copy.txt");
    copyFile("book_final_copy.txt", "book_last_copy.txt");
  }

  static void copyFile(String sourceFile, String destinationFile) {
//    FileUtils.readFile(sourceFile);
//    FileUtils.writeFile(destinationFile);
    //напишите тут ваш код
  }
}
