/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculator;
import java.util.Scanner;
import java.io;
/**
 *
 * @author M306User
 */
public class CALCULATOR {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input=new Scanner(System.in);
        double first,second,sum,quotient,difference,product;
        String method;
        

        
        
        
       
        System.out.print("Enter first value: ");
        first=input.nextDouble();  
        System.out.print("Enter second value value: ");
        second=input.nextDouble();  
        
        sum = (first + second);
        quotient= (first/ second);
        difference= (first-second);
        product= (first*second);
        
        System.out.print("What arithmetic method or symbol do you want to use?");
        method=input.next();
        
        if (method.equals("+")||method.equals("addition")) { System.out.println("The sum of value 1 and value 2 is "+ sum);}
        else if (method.equals("-")||method.equals("subtraction")) { System.out.println("The difference of value 1 and value 2 is "+ difference);}
        else if (method.equals("*")||method.equals("multiplication")) { System.out.println("The product of value 1 and value 2 is "+ product);}
        else if (method.equals("/")||method.equals("division")) { System.out.println("The difference of value 1 and value 2 is "+ quotient);}
        else {System.out.println("Wrong Method");}
    }
    
}
