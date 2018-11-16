/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package activity.pkg5.loop;
import java.util.Scanner;
/**
 *
 * @author CC2_1H-20
 */
public class ACTIVITY5LOOP {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    
        Scanner input= new Scanner (System.in);
        int num,guess;
        String hint;
        System.out.print("Enter your number (1 to 1000): ");
        num= input.nextInt();
        
        if (num%2==0)
            hint= "even";
        else
            hint="odd";
        
        
        if (num<=1000)
        {
      
            do 
            { 
                System.out.print("Guess a number: ");
                guess=input.nextInt();
                if (guess!=num)
                        {
                    if (guess % 2 == 0){
                    System.out.println("The number you entered is even, the number to be guessed is " + hint+".");}
                    else{
                    System.out.println("The number you entered is odd, the number to be guessed is " + hint + "."); }
                        }
                else {System.out.print("Correct!");}
            }
            while (guess!=num);
        }
        else {System.out.print("The value you entered is greater than 1000.");} ;
    
}   
}
