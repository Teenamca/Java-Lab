/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package areashape;

/**
 *
 * @author sjcet
 */
import java.util.Scanner;
public class AreaShape {

    /**
     * @param args the command line arguments
     */
    void area(float x)
    {
        System.out.println("Area of square=" +(x*x));
    }
    void area(int x,int y)
    {
        System.out.println("Area of rectangle is=" +(x*y));
        
    }
    void area(int x,int y,int z)
    {
        double s=(x+y+z)/2;
        double triArea;
        triArea=Math.sqrt(s*(s-x)*(s-y)*(s-z));
        System.out.println("Area of rectangle ="+triArea);
    }
    public class AreaOverload 
    {
    
    }
    public static void main(String[] args) {
        // TODO code application logic here
        AreaShape obj = new AreaShape();
        obj.area(10); 
        obj.area(5,6); 
        obj.area(4,5,6);
    }
    
}
