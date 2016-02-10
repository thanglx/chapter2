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
public class ListElement<T>{
    private T data;
    private ListElement<T> next;
    public ListElement(T value){
        data = value;
    }
    public void setNext(ListElement<T> element){
        next = element;
    }
    public void setData(T value){
        data = value;
    }
    public T value(){
        return data;
    }
    public ListElement<T> next(){
        return next;
    }
}
