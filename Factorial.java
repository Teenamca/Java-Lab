/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package factorial;

/**
 *
 * @author sjcet
 */
import java.util.Scanner;
public class Factorial {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number :");
        int num = sc.nextInt();   //Input the number
        if(num>=0) 
        {
           //Call a recursive function to find the factorial
           int factorial=findFactorial(num);
           System.out.println("The factorial of the entered the number is :"+factorial);
        }        
        else
        {
            System.out.println("Factorial not possible.");
            System.out.println("Please enter valid input.");
        } 
    }
    //Recursive Function to Find the Factorial of a Number
    public static int findFactorial(int num)
    {
        if(num==0)
        return 1;
        else if(num==1)
        return 1;
        else
        return num*findFactorial(num-1);        
    }
}
