package edu.vt.hokie.model;

/**
 * Calculator for 3for2
 * Created by Moses Cho on 2/16/17.
 */
public class ThreeForTwoCalculator implements Calculator {
    public double calculate(int quantity, double price) {
    	return quantity * price; 
    }
}
