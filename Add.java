/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package add;

import org.w3c.dom.events.MutationEvent;

/**
 *
 * @author sjcet
 */
import java.util.Scanner;
public class Add {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int a,b,c;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter first number");
        a=sc.nextInt();
        System.out.println("Enter second number");
        b=sc.nextInt();
        c=a+b;
        System.out.println("Addition of two numbers is:"+c);
        
        
    }
    //static int addition(int x,int y)
    //{
        //return x+y;
    //}
}
