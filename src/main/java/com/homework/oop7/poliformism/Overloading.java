package com.homework.oop7.poliformism;

/**
 * В этой задаче тебе предстоит создать универсальный инструмент для поиска минимальных и максимальных чисел.
 * В классе Overloading создай публичные статические методы min() и max(),
 * которые в качестве аргументов принимают целочисленные (тип int) значения и возвращают минимальное и максимальное из них соответственно.
 *
 * Каждый из методов должен быть перегружен так, чтобы была возможность вызвать метод с двумя, тремя, четырьмя и пятью параметрами.
 * В общем, необходимо создать 8 методов, — 4 для min() и 4 для max().
 * Все аргументы методов должны быть типа int.
 * Требования:
 * •	В классе Overloading должно быть создано 4 перегруженных метода min() в соответствии с условием задания.
 * •	В классе Overloading должно быть создано 4 перегруженных метода max() в соответствии с условием задания.
 * •	Методы min() должны возвращать минимальное из переданных чисел.
 * •	Методы max() должны возвращать максимальное из переданных чисел.
 */

public class Overloading {

    public static int min(int a, int b){
        if (a < b){
            return a;
        } else{
            return b;
        }
    }
    public static int min(int a, int b, int c){
        if (a < b && a < c ){
            return a;
        } else if (b < a && b < c ){
            return b;
        } else{
            return c;
        }
    }
    public static int min(int a, int b, int c, int d){
        if (a < b && a < c && a < d){
            return a;
        } else if (b < a && b < c && b < d ){
            return b;
        } else if (c < a && c < b && c < d){
            return c;
        } else {
            return d;
        }
    }
    public static int min(int a, int b, int c, int d, int f){
        if (a < b && a < c && a < d){
            return a;
        } else if (b < a && b < c && b < d ){
            return b;
        } else if (c < a && c < b && c < d){
            return c;
        } else if (d < a && d < b && d < c && d < f ) {
            return d;
        } else {
            return f;
        }
    }

    public static int max(int a, int b){
        if (a > b){
            return a;
        } else {
            return b;
        }
    }
    public static int max(int a, int b, int c){
        if (a > b && a > c ){
            return a;
        } else if (b > a && b > c ){
            return b;
        } else {
            return c;
        }
    }
    public static int max(int a, int b, int c, int d){
        if (a > b && a > c && a > d){
            return a;
        } else if (b > a && b > c && b > d ){
            return b;
        } else if (c > a && c > b && c > d){
            return c;
        } else {
            return d;
        }
    }
    public static int max(int a, int b, int c, int d, int f){
        if (a > b && a > c && a > d && a > f){
            return a;
        } else if (b > a && b > c && b > d && b > f ){
            return b;
        } else if (c > a && c > b && c > d && c > f){
            return c;
        } else if (d > a && d > b && d > c && d > f ) {
            return d;
        } else {
            return f;
        }
    }
}
