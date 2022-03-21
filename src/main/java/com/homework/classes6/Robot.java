package com.homework.classes6;

public class Robot {

  public static int robotCounter;

  public static int id;

  public static String model;

  public static int productionYear;

  public static String vendor = "Marvel Co.";

  public Robot(String model, int productionYear) {
    this.model = model;
    this.productionYear = productionYear;
    this.id = ++robotCounter;
  }

  public void displayInformation() {
    System.out.printf("Я %d-й из %d роботов. Модель: %s. Произведен компанией %s в %d году.\n",
        id, robotCounter, model, vendor, productionYear);
  }
}
