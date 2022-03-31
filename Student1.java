/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package student1;

/**
 *
 * @author sjcet
 */
public class Student1 {

    /**
     * @param args the command line arguments
     */
    int m1,m2,m3,age;
    String name;

    Student1(int a,int b,int c,int d,String na) 
    {
        m1=a;
        m2=b;
        m3=c;
        age=d;
        name=na;
    }
    public void sum()
    {
        int sum;
        sum=m1+m2+m3;
        System.out.println("Total sum"+sum);
    }
    public void perc()
    {
        float perc;
        perc=(m1+m2+m3*100)/300;
        System.out.println("Percentage:"+perc);
    }
    
    public static void main(String[] args) {
        // TODO code application logic here
        Student1 s1=new Student1(10, 20, 30, 24, "Ammu");
        s1.sum();
        s1.perc();
        Student1 s2=new Student1(30, 20, 12, 25, "Alona");
        s2.sum();
        s2.perc();
        
    }
    
}
