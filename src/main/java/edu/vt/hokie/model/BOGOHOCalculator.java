package edu.vt.hokie.model;

/**
 * Calculator class for BOGOHO
 *
 * Created by Moses Cho on 2/16/17.
 */
public class BOGOHOCalculator implements Calculator {
    public double calculate(int quantity, double price) {
        return quantity * price;
    }
}
