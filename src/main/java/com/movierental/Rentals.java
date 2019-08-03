package com.movierental;

import java.util.ArrayList;

public class Rentals extends ArrayList<Rental> {

    public int frequentRenterPoints() {
        int frequentRenterPoints = 0;
        for (Rental each : this) {
            frequentRenterPoints += each.frequentRenterPoints();
        }
        return frequentRenterPoints;
    }

    public double totalAmount() {
        double totalAmount = 0;
        for (Rental each : this) {
            double thisAmount = each.amount();
            totalAmount += thisAmount;
        }
        return totalAmount;
    }

}
