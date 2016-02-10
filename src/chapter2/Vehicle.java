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
public class Vehicle {
    protected String licensePlate = null;
    public void setLicensePlate(String license){
        this.licensePlate = license;
    }    
    public String getLicensePlate(){
        return this.licensePlate;
    }
}
