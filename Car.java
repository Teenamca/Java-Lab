/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package car;

/**
 *
 * @author sjcet
 */
class Vehicle
{
    protected String brand="Ford";
    public void honk()
    {
        System.out.println("tuut,tuut");
    }
}
public class Car extends Vehicle {

    /**
     * @param args the command line arguments
     */
    private String modelName="Mustang";
    public static void main(String[] args) {
        // TODO code application logic here
        Car mycar=new Car();
        mycar.honk();
        System.out.println(mycar.brand +" "+ mycar.modelName);
    }
    
}
