package com.movierental;

public class Customer {
  private String name;
  private Rentals rentals;

  public Customer(String name) {
    this.name = name;
    this.rentals = new Rentals();
  }

  public void addRental(Rental arg) {
    rentals.add(arg);
  }

  public String getName() {
    return name;
  }

  public String statement() {
    return new TextStatement(name, rentals).statement();
  }

  public String htmlStatement() {
    return new HTMLStatement(name, rentals).statement();
  }

}

