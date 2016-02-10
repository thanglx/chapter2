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
public class Portfolio <T> {
    T[] data;
    public Portfolio(int capacity){
        //data = new T[capacity];
        data = (T[]) new Object[capacity];
    }
    public T get(int index){
        return data[index];
    }
    public void set(int index, T element){
        data[index] = element;
    }
}
