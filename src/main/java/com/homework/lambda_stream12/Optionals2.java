package com.homework.lambda_stream12;

import java.util.Optional;
import java.util.stream.Stream;

/**
 * У автомобиля, представленного классом Car, есть две характеристики: название - поле name, цена - поле price.
 * В классе Optionals2 выполняются две операции поиска:
 *
 * метод getCheapestCar(Stream<Car>) ищет самый дешевый автомобиль в одном списке;
 * метод getCheaperCar(Stream<Car>, Car) в другом списке ищет автомобиль дешевле, чем полученный в методе getCheapestCar(Stream<Car>).
 * Методы возвращают не сам автомобиль (объект типа Car), а объект типа Optional<Car>.
 * Подсказка:
 * Для поиска элемента с минимальным искомым значением в потоке данных используй метод min(),
 * а чтобы найти первый попавшийся подходящий элемент из потока отфильтрованных данных используй метод findFirst().
 *
 * Метод main() не принимает участие в тестировании.
 * Требования:
 * •	В публичном статическом методе getCheapestCar(Stream<Car>) нужно вызывать метод min() объекта типа Stream<Car>.
 * •	В публичном статическом методе getCheaperCar(Stream<Car>, Car) нужно вызывать метод findFirst() объекта типа Stream<Car>.
 * •	Метод getCheapestCar(Stream<Car>) нужно реализовать согласно условию.
 * •	Метод getCheaperCar(Stream<Car>, Car) нужно реализовать согласно условию.
 */
public class Optionals2 {

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
        new Car("X1", 40_000),
        new Car("X6", 125_000)
    );

    Optional<Car> cheapestCar = getCheapestCar(tesla);
    cheapestCar.ifPresent(System.out::println);

    Optional<Car> cheaperCar = cheapestCar.flatMap(car -> getCheaperCar(bmw, car));
    cheaperCar.ifPresent(System.out::println);
  }

  public static Optional<Car> getCheapestCar(Stream<Car> car) {
    //напишите тут ваш код
    return Optional.empty();
  }

  public static Optional<Car> getCheaperCar(Stream<Car> car, Car cheapestCar) {
    //напишите тут ваш код
    return Optional.empty();
  }

}
