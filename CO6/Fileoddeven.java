/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fileoddeven;

/**
 *
 * @author sjcet
 */
import java.io.FileWriter;
import java.io.IOException;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Fileoddeven {

    /**
     * @param args the command line arguments
     */
    static String data = "";
    static File dataFile = new File("example.txt");

    public static void main(String[] args) {
        // TODO code application logic here
           try {
            FileWriter oddFile = new FileWriter("odd.txt");
            FileWriter evenFile = new FileWriter("even.txt");

            Scanner dataRead = new Scanner(dataFile);
            while (dataRead.hasNextLine()) {
                data += dataRead.nextLine();
            }
            dataRead.close();
            String values[] = data.split(" ");
            int valuesInt[] = new int[values.length + 1];
            int count = 0;
            for (String i : values) {
                valuesInt[count++] = Integer.parseInt(i);
                
                if (Integer.parseInt(i) % 2 == 0) {
                    evenFile.write(i+" ");

                } else {
                    oddFile.write(i+" ");
                }
            }
            oddFile.close();
            evenFile.close();
        } catch (IOException ex) {
            System.out.println("An error occured !");
            ex.printStackTrace();
        }catch (Exception ex) {
            System.out.print("An error occured : ");
            System.out.println(ex.getMessage()); 
        }

    }
}


