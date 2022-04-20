/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sub_class;

/**
 *
 * @author sjcet
 */
class Super_class
{
    int z;
    public void addition(int x,int y)
    {
        z=x+y;
        System.out.println("Addition of two numbers=" +z);
    }
    public void substraction(int x,int y)
    {
        z=x-y;
        System.out.println("Substraction of two numbers=" +z);
    }
}
public class Sub_class extends Super_class {

    /**
     * @param args the command line arguments
     */
    public void multiplication(int x,int y)
    {
        z=x*y;
        System.out.println("Product of two numbers=" +z);
    }
    public static void main(String[] args) {
        // TODO code application logic here
        int a=4,b=3;
        Sub_class sub=new Sub_class();
        sub.addition(a,b);
        sub.substraction(a, b);
        sub.multiplication(a, b);
    }
    
}
