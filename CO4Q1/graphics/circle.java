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
public class circle implements area_cal{
    int radius;
    
    public void area() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Input radius of circle : ");
        radius = sc.nextInt();
        String area = Double.toString(Math.PI*radius*radius);
        System.out.println("Area of the circle is : "+area);
        sc.close();
    
}
}
