package com.homework.stream;

import java.io.InputStream;
import java.io.OutputStream;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Scanner;

public class Stream2 {
  public static void main(String[] args) {
    try (Scanner scanner = new Scanner(System.in);
        InputStream inputStream = Files.newInputStream(Paths.get(scanner.nextLine()));
        OutputStream outputStream = Files.newOutputStream(Paths.get(scanner.nextLine()))
    ) {
      byte[] buffer = new byte[1024];
      while (inputStream.available() > 0) {
        int read = inputStream.read(buffer);
        outputStream.write(buffer, 0, read);
      }
    } catch (Exception e) {
      System.out.println("Something went wrong : " + e);
    }
  }
}
