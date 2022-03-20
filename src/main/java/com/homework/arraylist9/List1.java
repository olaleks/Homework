package com.homework.arraylist9;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * Перед тобой программа, которая сортирует элементы списка по возрастанию методом "пузырька"(гуглим что то такое).
 * Перепиши код, чтобы вместо списка ArrayList<Integer> numbers использовался массив int[] numbers.
 * Методы main() и print() не принимают участие в проверке.
 * Требования:
 * •	Поле numbers должно быть типа int[].
 * •	Поле numbers должно инициализироваться десятью числами при создании.
 * •	Метод sort() должен сортировать элементы массива int[] numbers по возрастанию.
 */

public class List1 {


    public static int[] numbers = {56, 45, 89, 1, 45, 13, 4, 69, 11, -89};

    public static void main(String[] args) {
        print();
        sort();
        System.out.println("\nОтсортированные числа в натуральном порядке:");
        print();
    }

    public static void sort() {
        for (int i = numbers.length - 1; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                if (numbers[j] > numbers[j + 1]) {
                    int temp = numbers[j];
                    numbers[j] = numbers[j + 1];
                    numbers[j + 1] = temp;
                }
            }
        }
    }

    public static void print() {
        for (int i = 0; i < numbers.length; i++)
        System.out.print(numbers[i] + "\t");
    }
}
