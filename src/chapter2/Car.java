/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chapter2;

/**
 *
 * @author laxuanthang
 */
public class Car extends Vehicle{
    int numberOfSeats = 0;
    protected String licensePlate = null;
    public void setNumberOfSeat(int number){
        this.numberOfSeats = number;
    }
    public int getNumberOfSeat(){
        return this.numberOfSeats;
    }    
    @Override
    public void setLicensePlate(String license){
        super.setLicensePlate(license);
    }
    @Override
    public String getLicensePlate(){
        return super.getLicensePlate();
    }
    public void updateLicensePlate(String license){
        this.licensePlate = license;
    }
}
