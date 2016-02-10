/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chapter2;
import java.lang.*;

// New line - to check Git repository
// Another new line
/**
 *
 * @author laxuanthang
 */
public class HelloWorld {

    /**
     * @param args the command line arguments
     */
    
    public ListElement<Integer> insertInFront(ListElement<Integer> list,int data){
        ListElement<Integer> l = new ListElement<Integer>(data);
        l.setNext(list);
        return l;
    }
    
    public ListElement<Integer> find(ListElement<Integer> head, int value){
        ListElement<Integer> element = head;
        while (element != null && element.value() != value){
            element = element.next();
        }
        return element;
    }
    
    
    public static void main(String[] args) {
        /*
        // TODO code application logic here
        //System.out.print("Hello world");
        Counter c = new Counter();
        System.out.println("Initial counter = " + c.getCount());
        Counter cn = c;
        cn.increment(3);
        System.out.println("New counter = " + c.getCount());
        //System.out.print(b.getData());
        Car myCar = new Car();
        myCar.setNumberOfSeat(5);
        myCar.setLicensePlate("LicenseN5");
        Vehicle myVehicle = myCar;
        myVehicle.setLicensePlate("LicenseN6");
        //System.out.print(myVehicle.getLicensPlate());
        boolean isCar = myVehicle instanceof Car;        
        System.out.print(myCar.getLicensePlate());
        myCar.updateLicensePlate("LicenseN7");
        System.out.print(myCar.getLicensePlate());
        System.out.println(isCar);        
        String myString = "3.14";
        System.out.println(Double.parseDouble(myString));        
        int[] arrInt = new int[100];
        int i;
        for (i=0; i<arrInt.length; i++){
            arrInt[i] = i+1;
        }
        for (i=0; i<arrInt.length; i++){
            //System.out.print(arrInt[i]);
        }
        /*
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your name:");
        String name = input.next();
        System.out.println("Hello " + name);
        */
        /*
        String str;
        str = "123";
        try {
            System.out.println(Integer.parseInt(str));
            System.out.println("End parse here");
        }   
        catch (NumberFormatException e) {
            System.out.println (str + " is not a number");
        }
        finally {
            System.out.println("Final here");
        }
        double numberToDivide = 5;
        double numberToDivideBy = 10;
        TestException test = new TestException();
        test.getResult(numberToDivide, numberToDivideBy);   
        /*
        Scanner input = new Scanner(System.in);
        int myInt = input.nextInt();
        System.out.println(myInt);
        double myDbl = input.nextDouble();
        */
        /*
        String className = "HelloWord";
        try{
            Class myClass = Class.forName(className);
            System.out.println(myClass.getName());
        }
        catch (ClassNotFoundException ex){
            System.out.println(ex.toString());
        }
        Number n;
        Integer j;
        n = new Integer(3);
        if (n instanceof Integer){
            j = (Integer)n;
            System.out.println(j);
        }
        n = new Double(3.1415926);
        if (n instanceof Integer){
            j = (Integer)n;
            System.out.println(j);
        }
        else System.out.println("Error of conversion");        
        ObjectPairOld bid = new ObjectPairOld(3.14, "Thang");
        double d = (Double)bid.getFirst();
        String str1 = (String)bid.getSecond();
        System.out.println(d + " " + str1);
        ObjectPairNew bid2 = new ObjectPairNew<>(4.18, "Ira");
        d = (Double)bid2.getFirst();
        str1 = (String)bid2.getSecond();
        System.out.println(d + " " + str1);
        */
        /*
        String myStr = "abc";
        Permutations permutation = new Permutations(myStr);
        permutation.permutate();
        Combinations combinations = new Combinations(myStr);
        combinations.combine();
        */
        String name = "Thang";
        Person person = new Person(name);
        System.out.println(person.greet(name));
    }    
}


