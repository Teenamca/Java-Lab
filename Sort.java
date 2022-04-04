/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sort;

/**
 *
 * @author sjcet
 */
import java.util.Scanner;
import java.util.Arrays;
public class Sort {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int i,j;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of words");
        int num=sc.nextInt();
        String word[]=new String[num];
        sc.nextLine();
        for(i=0;i<num;i++)
        {
            System.out.println("Enter a word");
            word[i]=sc.nextLine();
        }
        for(i=0;i<num;i++)
        {
            for(j=i+1;j<num;j++)
            {
               if(word[i].compareTo(word[j])>0){
               String temp = word[i];
               word[i]=word[j];
               word[j]=temp;
            }
        }
        }
         System.out.println("Sorted Strings is ="+Arrays.toString(word));
    System.out.println(word);
}
}
