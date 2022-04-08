/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package string_manipulate;

/**
 *
 * @author sjcet
 */
import java.util.Scanner;
public class String_manipulate {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the string");
        String str1=sc.nextLine();
        System.out.println("Length of string=" +str1.length());
        System.out.println("Character at first position=" +str1.charAt(0));
        System.out.println("Lowecase=" +str1.toLowerCase());
        System.out.println("Uppercase=" +str1.toUpperCase());
        System.out.println("String ends with e : "+str1.endsWith("e"));
        System.out.println("Replace'Jesus' with 'Mary' : "+str1.replaceAll("Jesus","Mary"));
        System.out.println("Sting index is :" +str1.indexOf(1));
    }
    
}
