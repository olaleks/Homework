package com.homework.lambda_stream12;

public class Car {
  private String model;
  private boolean isElectric;
  private Integer price;
  private String name;

  public Car(String model, boolean isElectric) {
    this.model = model;
    this.isElectric = isElectric;
  }

  public Car(String name, Integer price) {
    this.name = name;
    this.price = price;
  }

  public String getModel() {
    return model;
  }

  public boolean isElectric() {
    return isElectric;
  }

  public String string() {
    return "Car " + model + ", electric - " + isElectric;
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
