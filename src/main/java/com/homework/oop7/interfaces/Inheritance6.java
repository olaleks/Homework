package com.homework.oop7.interfaces;

/**
 *
 УсловиеДерево классов

 Имплементируй интерфейс Eatable только для классов, объекты которых могут быть съедобными, из этого списка:
 Apple — яблоко
 Carrot — морковь
 Fire — огонь
 Fish — рыба
 Stone — камень
 Требования:
 •	Класс Apple должен имплементировать интерфейс Eatable.
 •	Класс Carrot должен имплементировать интерфейс Eatable.
 •	Класс Fire не должен имплементировать интерфейс Eatable.
 •	Класс Fish должен имплементировать интерфейс Eatable.
 •	Класс Stone не должен имплементировать интерфейс Eatable.
 */

public class Inheritance6 {

  public class Fire {
  }

  public class Carrot implements Eatable{
  }

  public class Stone {
  }

  public class Apple implements Eatable{
  }

  public class Fish implements Eatable{
  }

  public interface Eatable {
  }

}
