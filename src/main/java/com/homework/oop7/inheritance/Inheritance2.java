package com.homework.oop7.inheritance;

/**
 * Правильно унаследуй классы:
 *
 * человека — от существа;
 * Java-девелопера — от человека.
 * Удали дублирующие методы.
 * Требования:
 * •	Класс Human должен наследоваться от класса Entity.
 * •	Класс JavaDeveloper должен наследоваться от класса Human.
 * •	Дублирующих методов не должно быть.
 */

public class Inheritance2 {

  public class Entity {
    public void move(){
      System.out.println("Я передвигаюсь.");
    }

    public void eat(){
      System.out.println("Я ем.");
    }
  }

  public class Human extends Entity{
    public void speak(){
      System.out.println("Я умею общаться.");
    }
  }

  public class JavaDeveloper extends Human {
    public void code(){
      System.out.println("Я умею общаться на Java.");
    }
  }
}
