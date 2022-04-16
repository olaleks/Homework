package com.homework.stream11;

import java.io.IOException;
import java.nio.file.DirectoryStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Scanner;

/**
 * УсловиеДерево классов
 * <p>
 * Напиши программу, которая будет считывать с клавиатуры пути к двум директориям и копировать файлы из одной директории
 * в другую (только файлы, директории игнорируй).
 * Используй соответствующие методы класса Files: newDirectoryStream(), isRegularFile() или isDirectory(), copy().
 * Требования:
 * •	Программа должна считать из консоли путь к директории.
 * •	В программе должны быть использованы соответствующие методы класса Files: newDirectoryStream(), isRegularFile() или isDirectory(), copy().
 * •	Программа должна копировать файлы из одной директории в другую согласно условию.
 * •	Не используй следующие классы: File, FileInputStream, FileOutputStream, FileReader, FileWriter пакета java.io.
 */

public class File3 {

    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        Path sourceDirectory = Path.of(scanner.nextLine());
        Path targetDirectory = Path.of(scanner.nextLine());
        try (DirectoryStream<Path> pathList = Files.newDirectoryStream(sourceDirectory)) {
            for (Path path : pathList) {
                if (Files.isRegularFile(path)) {
                    Path resolve = targetDirectory.resolve(path.getFileName());
                    Files.copy(path, resolve);
                }
            }
        }
    }
}
