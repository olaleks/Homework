package com.homework.lambda_stream12;

public class Car2 {
  private String name;
  private Integer price;

  public Car2(String name, Integer price) {
    this.name = name;
    this.price = price;
  }

  public String getName() {
    return name;
  }

  public Integer getPrice() {
    return price;
  }

  @Override
  public String toString() {
    return "Автомобиль " + name + ", цена - " + price + " USD";
  }
}
