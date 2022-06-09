/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package filewrt;

/**
 *
 * @author sjcet
 */
import java.io.FileWriter;
import java.io.IOException;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
public class Filewrt {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        // TODO code application logic here
        try
        {
            FileWriter dataWriter=new FileWriter("Data.txt");
            dataWriter.write("Hai Hello");
            dataWriter.write("World");
            dataWriter.close();
        }
        catch(IOException ex)
        {
            System.err.println("An error occured !");
            ex.printStackTrace();
        }
        try {
            
            File dataFile=new File("Data.txt");
            Scanner dataRead=new Scanner(dataFile);
            while(dataRead.hasNextLine())
            {
                System.out.println(dataRead.nextLine());
            }
            dataRead.close();
        } catch (FileNotFoundException ex) {
            System.out.println("An error occured");
            ex.printStackTrace();
        }
    }
    
}
