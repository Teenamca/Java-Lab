/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package largest;

/**
 *
 * @author sjcet
 */
import java.util.Scanner;
public class Largest {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int num1,num2,num3;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the first number");
        num1=sc.nextInt();
        System.out.println("Enter the second number");
        num2=sc.nextInt();
        System.out.println("Enter the third number");
        num3=sc.nextInt();
        boolean num;
        if(num1 >= num2) {
            if(num1 >= num3)
                System.out.println(num1 + " is the largest number.");
            else
                System.out.println(num3 + " is the largest number.");
        } else {
            if(num2 >= num3)
                System.out.println(num2 + " is the largest number.");
            else
                System.out.println(num3 + " is the largest number.");
                
    }
    }
    
}
