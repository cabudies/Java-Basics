/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication10;

/**
 *
 * @author JATINDER
 */
public class JavaApplication10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        // 1. Star Pattern using function
        JavaApplication10 javaApplication10 = new JavaApplication10();
        javaApplication10.printStar(5);
        
        // 2. Print complex numeric pattern
        javaApplication10.printNumericPattern();
        
        // 3. Polymorphism
        javaApplication10.addNumbers(5, 6);
        javaApplication10.addNumbers(5, 6, 7);
        
        // 4. Creating a constructor to call initialize a class variable, 
        // then call the function
        BaseClass baseClassObj = new BaseClass(6);
        baseClassObj.printStarPattern();
        
        // 5. Creating a new class and extending it from another class and 
        // understanding function overriding
        NewClass obj = new NewClass(15);
        obj.printStarPattern();
    }
    
    //    1. Star pattern using functions
    void printStar(int numberOfRows) {
        for(int i=1; i<=numberOfRows; i++) {
            for (int j=1; j<=i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
    
    // 3. function overloading - same function name but arguments 
    //  or return type is different.
    void addNumbers(int a, int b) {
        
        System.out.print("Sum of two numbers is: " + (a+b));
    }
    
    void addNumbers(int a, int b, int c) {
        
        System.out.print("Sum of three numbers is: " + (a+b+c));
    }
    
    // 2. program to print Numeric complex pattern
    void printNumericPattern() {
        for (int i=1; i<=4; i++) {
            for (int j=3; j>=i; j--) {
                System.out.print(" ");
            }
            for (int k=1; k<=i; k++) {
                System.out.print(k);
            }
            if(i>1) {
                for (int m=1; m<i; m++) {
                    System.out.print(m);
                }
            }
            System.out.println();
        }
    }  
     
}
