package com.homework.lambda_stream12;

import java.util.Optional;
import java.util.stream.Stream;

/**
 * У автомобиля, представленного классом Car, есть две характеристики: название - поле name, цена - поле price.
 * В классе Solution выполняются две операции поиска:
 *
 * метод getMostExpensiveCar(Stream<Car>) ищет самый дорогой автомобиль в одном списке;
 * метод getMoreExpensiveCar(Stream<Car>, Car) в другом списке ищет автомобиль дороже,
 * чем полученный в методе getMostExpensiveCar(Stream<Car>).
 * Методы возвращают не сам автомобиль (объект типа Car), а объект типа Optional<Car>.
 * Подсказка:
 * Для поиска элемента с максимальным искомым значением в потоке данных используй метод max(),
 * а чтобы найти первый попавшийся подходящий элемент из потока отфильтрованных данных используй метод findFirst().
 *
 * Метод main() не принимает участие в тестировании.
 * Требования:
 * •	В публичном статическом методе getMostExpensiveCar(Stream<Car>) нужно вызывать метод max() объекта типа Stream<Car>.
 * •	В публичном статическом методе getMoreExpensiveCar(Stream<Car>, Car) нужно вызывать метод findFirst() объекта типа Stream<Car>.
 * •	Метод getMostExpensiveCar(Stream<Car>) нужно реализовать согласно условию.
 * •	Метод getMoreExpensiveCar(Stream<Car>, Car) нужно реализовать согласно условию.
 */
public class Optionals1 {

  public static void main(String[] args) {
    var tesla = Stream.of(
        new Car("Model S", 94_490),
        new Car("Model 3", 50_690),
        new Car("Model X", 99_690),
        new Car("Model Y", 65_000)
    );

    var bmw = Stream.of(
        new Car("X5", 110_000),
        new Car("X3", 54_000),
        new Car("X7", 143_000),
        new Car("X6", 125_000)
    );

    Optional<Car> mostExpensiveCar = getMostExpensiveCar(tesla);
    mostExpensiveCar.ifPresent(System.out::println);

    Optional<Car> moreExpensiveCar = mostExpensiveCar.flatMap(car -> getMoreExpensiveCar(bmw, car));
    moreExpensiveCar.ifPresent(System.out::println);
  }

  public static Optional<Car> getMostExpensiveCar(Stream<Car> car) {
    //напишите тут ваш код
    return Optional.empty();
  }

  public static Optional<Car> getMoreExpensiveCar(Stream<Car> car, Car mostExpensiveCar) {
    //напишите тут ваш код
    return Optional.empty();
  }

}


