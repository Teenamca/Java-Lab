/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package graphics;

/**
 *
 * @author sjcet
 */
import java.util.Scanner;
public class Rect implements area_cal{
     int l,b;
    
    public void area(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length of the rectangle :");
        l = sc.nextInt();
        System.out.println("Enter the breath of the rectangle");
        b = sc.nextInt();
        System.out.println("Area of the rectangle = "+l*b);
    }
}
