/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package table.array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author CC2_1H-20
 */
public class TABLEARRAY {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        /*
        Scanner input = new Scanner(System.in);
        int howmany= input.nextInt();
        System.out.print("Enter a number: ");
        for (int z=0; z < howmany; z++) {  
        int arrays [] = new int [howmany];
        arrays = input.nextInt();
        System.out.print("Enter a number: ");} */
        
    int array_sort []={3,9,15,20,65,23,18,4,2,14};
          List<Integer> even = new ArrayList<Integer>();
          List<Integer> odd = new ArrayList<Integer>();
          int i;
          System.out.println("Even \tOdd"); 
          for ( i =0 ; i < array_sort.length ; i++) {
               if (array_sort[i] % 2 == 0) {
                 even.add(array_sort[i]);
           
               }
               else {
                  odd.add(array_sort[i]);
               }
           }
          for (int a=0; a<odd.size() && a<even.size();a++)
          {System.out.println(even.get(a)+"\t"+odd.get(a));}
           



        

    }
    
}
