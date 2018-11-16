/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fibonacci;

import java.util.Scanner;

/**
 *
 * @author cc2_1h-20
 */
public class FIBONACCI {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    Scanner input= new Scanner (System.in);
    System.out.print("Enter a number: ");
    int a=input.nextInt();

    //This is for the Fibonacci counter (e.g. f(0),f(1) and so on and so forth)
    
    for (int b=0; b<a+1;b++){System.out.print("f ("+b+")\t");}
    System.out.println();
    
    //This is for the rows and columns
    for (int row = 0; row < a+1; row++){
        for (int column=0;column<row+1;column++){ System.out.print(fact(column)+"\t");}
        System.out.println(); 
    }}
    
    //This is method is for the fibonacci
    static int fact (int n){
        if (n<=1)
        { return n ;} 
        else 
        { return fact (n-1)+ fact (n-2);}
        
    }
    
}
