/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

/**
 *
 * @author sjcet
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    int modelyear;
    String modelname;
    Main(int year,String name)
    {
        modelyear=year;
        modelname=name;
    }
    

    public static void main(String[] args) {
        // TODO code application logic here
        Main my=new Main(1984,"Jeep");
        System.out.println(my.modelyear +" "+my.modelname );
    }
    
}
