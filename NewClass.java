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

class BaseClass{
    int numberOfRows; // class-variable
    
    // 4. Constructor and star pattern using the value from constructor
    public BaseClass(int rows) {
        numberOfRows = rows;
    }
    
    void printStarPattern() {
        for (int i=1; i<=numberOfRows; i++) {
            for (int j=1; j<=i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}

// Inheritance and function overriding to call the base class function.
public class NewClass extends BaseClass{

    public NewClass(int rows) {
        super(rows);
    }
        
    @Override
    void printStarPattern() {
        super.printStarPattern();
    }
    
}
