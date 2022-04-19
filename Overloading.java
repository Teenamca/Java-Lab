/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package overloading;

/**
 *
 * @author sjcet
 */
import java.util.Scanner;
public class Overloading {

    /**
     * @param args the command line arguments
     */
    int addition(int a,int b)
    {
        int result;
        result=a+b;
        return result;
    }
    int addition(int a,int b,int c)
    {
        int result;
        result=a+b+c;
        return result;
    }
    int addition(int b)
    {
        int result;
        result=b+2;
        return result;
    }
    public class Method
    {
        
    }
    public static void main(String[] args) {
        // TODO code application logic here
        Overloading i=new Overloading();
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter three integers a,b,c");
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=sc.nextInt();
        System.out.println("Enter two parameter values:"+i.addition(a,b));
        System.out.println("Enter three parameter values:"+i.addition(a,b,c));
        System.out.println("Enter one parameter values:"+b+"+2:"+i.addition(b));
        //System.out.println("Addition Method with one parameter:"+a+"+1:"+obj.addition(a));
    }
    
}

