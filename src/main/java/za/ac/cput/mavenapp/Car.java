/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package za.ac.cput.mavenapp;

/**
 *
 * @author Nussayr Saidi 220425477
 */
public class Car {
    
    private String brand;
    private String colour;
    private int passengerCapacity;
    
    public Car()
    {}
    
    public Car(String brand, String colour, int passengerCapacity)
    {
        this.brand = brand;
        this.colour = colour;
        this.passengerCapacity = passengerCapacity;
    }
    
    public String getBrand()
    {
        return this.brand;
    }
    
    public String getColour(){
        return this.colour;
    }
    
    public int getPassengerCapacity(){
        return this.passengerCapacity;
    }
    
    public void setBrand(String brand){
        this.brand = brand;
    }
    
    public void setColour(String colour){
        this.colour = colour;
    }
    
    public void setPassengerCapacity(int passengerCapacity){
        this.passengerCapacity = passengerCapacity;
    }
    
    public String toString()
    {
        String str = String.format("Car Details: \nBrand: %s \nColour: %s \nPassenger Capacity: %d", this.brand, this.colour, this.passengerCapacity);
        return str;
    }
     
    
}
