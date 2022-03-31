/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rectangle;

import com.sun.javafx.scene.layout.region.BorderImageWidthConverter;

/**
 *
 * @author sjcet
 */
public class Rectangle {

    /**
     * @param args the command line arguments
     */
    int l,b;

    Rectangle(int length,int breadth) 
    {
        l=length;
        b=breadth;
        
    }
    public void area()
    {
        float area=l*b;
        System.out.println("Area of rectangle is:"+area);
    }
    public void perimeter()
    {
        float peri=2*(l+b);
        System.out.println("Perimeter is"+peri);
        
    }
    public static void main(String[] args) {
        // TODO code application logic here
        Rectangle r=new Rectangle(5,4);
        r.area();
        r.perimeter();
    }
    
}
