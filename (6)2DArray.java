/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package array.with.input.multi.d;

import java.util.Scanner;
import java.util.*;
import java.util.ArrayList;
import java.util.Iterator;
/**
 *
 * @author CC2_1H-20
 */
public class ARRAYWITHINPUTMULTID {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
   Scanner input = new Scanner(System.in);
   StringBuilder output = new StringBuilder();


    System.out.println("Enter the number of rows & columns: ");

    System.out.print("Enter the number of rows: ");
    int row = input.nextInt();
    System.out.print("Enter the number of columns: ");
    int columns = input.nextInt();

    String [][] names = new String [row][columns];
    /*This is for the row*/
    for (int i = 0; i < row; i++)
    {
        System.out.println("Row "+i);
        /*This is for the row*/
        
        /*This is for the column*/
        for (int j = 0; j < columns; j++)
        {
            System.out.print("Name " + (j + 1) + ": ");
            names[i][j] = input.next();
            
       output.append("\nArray ["+i+"]["+j+"]\t").append(names[i][j]); 
        }
        System.out.println( " " );

    }
    /*This is for the column*/
    
        System.out.print (output);
    }
    

   }
