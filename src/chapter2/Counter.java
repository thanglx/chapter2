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
public class Counter {
    private int count;
    public  Counter(){}
    public Counter(int initial){
        count = initial;
    }
    public int getCount(){
        return count;
    }
    public void increment(){
        count++;
    }
    public void increment(int delta){
        count +=delta;
    }
    public void reset(){
        count = 0;
    }
}
