/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package signexception;

/**
 *
 * @author sjcet
 */
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class MyException extends Exception
{
 public MyException(String str)
 {
  System.out.println(str);
 }
}
public class SignException {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException{
        // TODO code application logic here
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
  System.out.print("Input number :: ");
  
  try {
   int num = Integer.parseInt(br.readLine());
   if(num < 0)
    throw new MyException("Number is negative");
   else
    throw new MyException("Number is positive");
  }
  catch (MyException m) {
   System.out.println(m);
  }
 }
    }
    

