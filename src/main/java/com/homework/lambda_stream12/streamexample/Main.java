package com.homework.lambda_stream12.streamexample;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import static com.homework.lambda_stream12.streamexample.Selector.initData;
import static com.homework.lambda_stream12.streamexample.Selector.owners;

public class Main {

  // найти рыжих котов и отсортироавть их по убыванию
  public static void main(String[] args) {
    initData();

    List<Cat> findCats = new ArrayList<>();
    for (Owner owner : owners) {
      for (Animal pet : owner.getPets()) {
        if (Cat.class.equals(pet.getClass()) && Color.FOXY == pet.getColor()) {
          findCats.add((Cat) pet);
        }
      }
    }

    Collections.sort(findCats, new Comparator<Cat>() {
      public int compare(Cat o1, Cat o2) {
        return o2.getAge() - o1.getAge();
      }
    });

    List<String> findNames = new ArrayList<>();

    for (Cat cat : findCats) {
      findNames.add(cat.getName());
    }

    //   final List<String> findNames = owners.stream()
    //           .flatMap(owner -> owner.getPets().stream()) // переход от Stream<Owner> к Stream<Pet>
    //           .filter(pet -> Cat.class.equals(pet.getClass())) // в потоке данных оставляем только котов
    //           .filter(cat -> Color.FOXY == cat.getColor()) // в потоке данных оставляем только рыжих
    //           .sorted((o1, o2) -> o2.getAge() - o1.getAge()) / сортируем по возрасту в убывающем порядке
    //           .map(Animal::getName) // берем имена
    //           .collect(Collectors.toList()); // результат складываем в список

    findNames.forEach(System.out::println);
  }
}
