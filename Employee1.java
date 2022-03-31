/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package employee1;

/**
 *
 * @author sjcet
 */
public class Employee1 {

    /**
     * @param args the command line arguments
     */
    int empid,salary;
    String name;

    Employee1(int id,int sa,String na)
    {
        empid=id;
        salary=sa;
        name=na;
        
    }
    public void total()
    {
        int total;
        total=salary+((salary*20)/100);
        System.out.println("Total salary:"+total);
    }
    public static void main(String[] args) {
        // TODO code application logic here
        Employee1 e1=new Employee1(12, 15000, "Ammu");
        e1.total();
        Employee1 e2=new Employee1(15, 20000, "anu");
        e2.total();
    }
    
}
