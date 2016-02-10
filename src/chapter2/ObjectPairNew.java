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
public class ObjectPairNew <A,B>{
    A first;
    B second;
    ObjectPairNew(A a, B b){
        first = a;
        second = b;
    }
    public A getFirst(){
        return first;
    }
    
    public B getSecond(){
        return second;
    }
}
