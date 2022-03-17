package com.homework.arraylist9;

import java.util.ArrayList;
public class List2 {

  public static void main(String[] args) {
    ArrayList<Student> students = new ArrayList<>();
    students.add(new Student("Акакий"));
    students.add(new Student("Любослав"));

    printStudentNames(students);
  }

  public static void printStudentNames(ArrayList students) {
//    for (int i = 0; i < students.size(); i++) {
//      System.out.println(students.get(i).getName());
//    }
  }
}
