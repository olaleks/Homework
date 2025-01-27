package com.homework.oop7.incapsulation;

/**
 * Скрой все внутренние переменные класса Cat, а также методы,
 * позволяющие менять внутреннее состояние объектов класса Cat.
 *
 * Требования:
 * •	Переменная name класса Cat должна быть скрыта.
 * •	Переменная age класса Cat должна быть скрыта.
 * •	Переменная weight класса Cat должна быть скрыта.
 * •	В Cat должны быть private и public методы.
 */

public class Incapsulation2 {

  public static void main(String[] args) {
  }

  public class Cat {
    private String name;
    private int age;
    private int weight;

    public Cat(String name, int age, int weight) {
      this.name = name;
      this.age = age;
      this.weight = weight;
    }

    private String getName() {
      return name;
    }

    public void setName(String name) {
      this.name = name;
    }

    private int getAge() {
      return age;
    }

    public void setAge(int age) {
      this.age = age;
    }
  }
}
