/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package products;

/**
 *
 * @author sjcet
 */
import java.util.Scanner;
//import jdk.nashorn.internal.runtime.regexp.joni.constants.OPCode;
public class Products {

    /**
     * @param args the command line arguments
     */
    int pcode,price;
    String pname;
    Products()
    {
        Scanner n1 = new Scanner(System.in);
        System.out.println("enter the product code");
        pcode=n1.nextInt();
        
        System.out.println("enter the price");
        price=n1.nextInt();
        
        System.out.println("enter the product name");
        pname=n1.next();
        
        
    }
    
    public static void main(String[] args) {
        // TODO code application logic here
        Products p1=new Products();
        Products p2=new Products();
        Products p3=new Products();
         System.out.println("THE LOWEST PRICED PRODUCT, ID AND PRICE:");
     if(p1.price<p2.price && p1.price<p3.price)
     {
         System.out.println("product code is "+p1.pcode);
         System.out.println("product name is "+p1.pname);
         System.out.println("price is"+p1.price);
         
     }
     else if(p2.price<p1.price && p2.price<p3.price)  {
         System.out.println("product code is "+p2.pcode);
         System.out.println("product name is "+p2.pname);
          System.out.println("price is"+p2.price);
            
        }
     else
     {
         System.out.println("product code is "+p3.pcode);
         System.out.println("product name is "+p3.pname);
          System.out.println("price is"+p3.price);
     }
         
    }
    
    
}
