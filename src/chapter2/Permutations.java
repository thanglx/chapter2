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
public class Permutations {
    private boolean[] used;
    private StringBuilder out  = new StringBuilder();
    private final String in;
    private static int round = 0;
    public Permutations(final String str){
        in = str;
        used = new boolean[in.length()];
    }
    
    public void permutate(){
        round ++;
        String str = "";
        int j;
        for (j=0; j<round; j++) str = str + "_";
        System.out.println(str + "Start " + round);
        if (out.length() == in.length()){            
            System.out.println(str + "output = " + out);                        
            return;
        }
        
        for (int i=0; i < in.length(); i++){
            System.out.println();
            System.out.println(str + "Head " + round);
            System.out.println(str + "i= " + i);
            if (used[i]){
                System.out.print(used[i] + " - ");
                continue;
            }
           
            else {
                System.out.print("ZZZ "+used[i] + " - ");
            }
            
            System.out.println();
            out.append(in.charAt(i));
            used[i] = true;
            System.out.println(i+ " "+ out);
            permutate();
            --round;
            System.out.println(str + "Body" + i);
            System.out.println("new round =" + round);
            used[i] = false;
            System.out.println("new i = " + i);
            out.setLength(out.length() - 1);
            System.out.println("Lenght = " + out.length() + " out = " + out);
            System.out.println(str + "Tail");
            System.out.println(str);            
            System.out.println(str+ "End " + round);
        }
    }
    
}
