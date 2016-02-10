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
public class TestException {
    private double divideBy(double numberToDivide, double numberToDivideBy) 
            throws ArithmeticException {
        if (numberToDivideBy == 0){
            throw new ArithmeticException("Divide by 0");
        }
        else return numberToDivide/numberToDivideBy;
    }
    public void getResult(double numberToDivide, double numberToDivideBy){
        try {
            double result = divideBy(numberToDivide, numberToDivideBy);
            System.out.println(result);
            System.out.println("End division here");
        }
        catch (ArithmeticException e){
            System.out.println("Division attemp is failed");
        }
        finally {
            System.out.println("Final division here");
        }
    }
}
