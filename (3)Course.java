/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package usercourse;

import java.util.Scanner;

/**
 *
 * @author CC2_1H-20
 */
public class USERCOURSE {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here\
        Scanner course= new Scanner (System.in);
        String inputcourse, major;
                
        System.out.print("What is your Course? ");
        inputcourse= course.next();
        //this is for the course Information Technology
        if ((inputcourse.equals ("IT")||(inputcourse.equals ("it"))) )
        {
            System.out.print("What is your Major? ");
            major= course.next();
            if (major.equals("NETSEC")) {System.out.print("Your course is IT and your major is Network and Security");}
            else if (major.equals("WEBDEV")){System.out.print("Your course is IT and your major is Web Development");}
            else if (major.equals("ERP")){System.out.print("Your course is IT and your major is Enterprise and Resource Planning");}
            else{System.out.print("Your course is IT and you entered an invalid Major");}
        }
        //this is for the course Computer Science
        else if ((inputcourse.equals("CS")||(inputcourse.equals("cs"))))
        {
            System.out.print("What is your Major? ");
            major= course.next();
            if (major.equals("MOBDEV")){ System.out.print("Your course is CS and your major is Mobile App Development");}
            else if (major.equals("DIGITAL ARTS")){System.out.print("Your course is CS and your major is Digital Arts");}
            else if (major.equals("AIMATION")){System.out.print("Your course is CS and your major is Animation");}
            else {System.out.print("Your course is CS and you entered an invalid major");}
        }
        //this is for the course Data Analytics
        else if ((inputcourse.equals("BSDA")||(inputcourse.equals("bsda"))))
        {
        System.out.print("Your course is BSDA");
        }
        //If the input is invalid
        else { System.out.print("Error");}
        
        
       
        
        
        
    }
    
}
