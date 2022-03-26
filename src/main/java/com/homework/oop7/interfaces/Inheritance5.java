package com.homework.oop7.interfaces;

/**
 * Создай два интерфейса — Swimmable и Flyable.
 * В будущем их можно будет использовать для обозначения классов, объекты которых умеют плавать или летать.
 * Требования:
 * •	Должен быть создан публичный интерфейс Swimmable.
 * •	Должен быть создан публичный интерфейс Flyable.
 */

public class Inheritance5 {
    public interface Swimmable{
        public void swim();
    }
    public interface Flyable{
        public void fly();
    }
}
