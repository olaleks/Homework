package com.homework.lambda_stream12;

import java.util.Optional;
import java.util.stream.Stream;

/**
 * У автомобиля, представленного классом Car2, есть две характеристики: название - поле name, цена - поле price.
 * В классе Solution выполняются две операции поиска:
 *
 * метод getCheapestCar2(Stream<Car2>) ищет самый дешевый автомобиль в одном списке;
 * метод getCheaperCar2(Stream<Car2>, Car2) в другом списке ищет автомобиль дешевле, чем полученный в методе getCheapestCar2(Stream<Car2>).
 * Методы возвращают не сам автомобиль (объект типа Car2), а объект типа Optional<Car2>.
 * Подсказка:
 * Для поиска элемента с минимальным искомым значением в потоке данных используй метод min(),
 * а чтобы найти первый попавшийся подходящий элемент из потока отфильтрованных данных используй метод findFirst().
 *
 * Метод main() не принимает участие в тестировании.
 * Требования:
 * •	В публичном статическом методе getCheapestCar2(Stream<Car2>) нужно вызывать метод min() объекта типа Stream<Car2>.
 * •	В публичном статическом методе getCheaperCar2(Stream<Car2>, Car2) нужно вызывать метод findFirst() объекта типа Stream<Car2>.
 * •	Метод getCheapestCar2(Stream<Car2>) нужно реализовать согласно условию.
 * •	Метод getCheaperCar2(Stream<Car2>, Car2) нужно реализовать согласно условию.
 */
public class Optionals2 {

  public static void main(String[] args) {
    var tesla = Stream.of(
        new Car2("Model S", 94_490),
        new Car2("Model 3", 50_690),
        new Car2("Model X", 99_690),
        new Car2("Model Y", 65_000)
    );

    var bmw = Stream.of(
        new Car2("X5", 110_000),
        new Car2("X3", 54_000),
        new Car2("X1", 40_000),
        new Car2("X6", 125_000)
    );

    Optional<Car2> cheapestCar2 = getCheapestCar2(tesla);
    cheapestCar2.ifPresent(System.out::println);

    Optional<Car2> cheaperCar2 = cheapestCar2.flatMap(Car2 -> getCheaperCar2(bmw, Car2));
    cheaperCar2.ifPresent(System.out::println);
  }

  public static Optional<Car2> getCheapestCar2(Stream<Car2> car) {
    //напишите тут ваш код
    return Optional.empty();
  }

  public static Optional<Car2> getCheaperCar2(Stream<Car2> car, Car2 cheapestCar2) {
    //напишите тут ваш код
    return Optional.empty();
  }

}
