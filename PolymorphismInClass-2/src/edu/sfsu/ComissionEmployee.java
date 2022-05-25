package edu.sfsu;

public class ComissionEmployee extends Employee {
    private double commissionRate;
    private double grossSales;

    public ComissionEmployee(String firstName, String lastName, String SSN, double commissionRate, double grossSales) {
        super(firstName, lastName, SSN);
        this.commissionRate = commissionRate;
        this.grossSales = grossSales;
    }

    public double getCommissionRate() {
        return commissionRate;
    }

    public double getGrossSales() {
        return grossSales;
    }

    public void setCommissionRate(double commissionRate) {
        this.commissionRate = commissionRate;
    }

    public void setGrossSales(double grossSales) {
        this.grossSales = grossSales;
    }

    @Override
    public double earnings () {
        return commissionRate * grossSales;
    }
}
