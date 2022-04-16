package com.homework.oop7.interfaces.task_interface;

import java.util.ArrayList;
import java.util.List;

/**
 * В деревне Вилларибо есть струнный оркестр, а в деревне Виллабаджо — клавишный.
 * Как-то раз повозки с музыкантами из двух деревень столкнулись на перекрестке, и все смешалось в кучу.
 * Помоги артистам разобрать свои инструменты. И естественно, после этого оба оркестра должны дать концерт.
 *
 * Для этого:
 *
 * в методе createKeyboardOrchestra() добавь в список orchestra один орган и три пианино;
 * в методе createStringedOrchestra() добавь в список orchestra две скрипки и одну гитару;
 * метод playOrchestra() должен вызывать метод play() у всех элементов списка orchestra.
 * Требования:
 * •	Метод createKeyboardOrchestra() должен добавлять в список orchestra один объект класса Organ и три объекта Piano.
 * •	Метод createStringedOrchestra() должен добавлять в список orchestra два объекта класса Violin и один объект Guitar.
 * •	Метод playOrchestra() должен вызывать метод play() у всех элементов списка orchestra.
 */

public class Solution {
  static List<MusicalInstrument> orchestra = new ArrayList<>();

  public static void main(String[] args) {
    createKeyboardOrchestra();
    createStringedOrchestra();
    playOrchestra();
  }

  public static void createKeyboardOrchestra() {
    orchestra.add(new Organ());
    orchestra.add(new Piano());
    orchestra.add(new Piano());
    orchestra.add(new Piano());
  }

  public static void createStringedOrchestra() {
    orchestra.add(new Violin());
    orchestra.add(new Violin());
    orchestra.add(new Guitar());
  }

  public static void playOrchestra() {
    for (MusicalInstrument mi: orchestra) {
      mi.play();
    }
  }
}
