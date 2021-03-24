package com.example.stdjavaprograms;

public class Country implements Measureable {
    private double area;
    private String country;

    public Country() {
    }

    public Country(String country, double area) {
        this.country = country;
        this.area = area;



    }

    public double getMeasure() {
        return area;
    }

    public void setArea(double area) {
        this.area = area;
    }

    public void setCountry(String country) {
        this.country = country;
    }
}
