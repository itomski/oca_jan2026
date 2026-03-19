package de.gfn.basic.mock;

public class Vehicle {

    private long id;
    private String registration;
    private String brand;
    private String modell;

    public Vehicle(long id, String registration, String brand, String modell) {
        this.id = id;
        this.registration = registration;
        this.brand = brand;
        this.modell = modell;
    }

    public Vehicle() {
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getRegistration() {
        return registration;
    }

    public void setRegistration(String registration) {
        this.registration = registration;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModell() {
        return modell;
    }

    public void setModell(String modell) {
        this.modell = modell;
    }
}
