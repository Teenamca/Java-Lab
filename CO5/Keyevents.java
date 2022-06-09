/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package keyevents;

/**
 *
 * @author sjcet
 */
import java.awt.*;
import java.awt.event.*;

public class Keyevents extends Frame implements KeyListener{
    Label l;
    TextArea area;

    public Keyevents() throws HeadlessException {
        l=new Label();
        l.setBounds(20,50,100,20);
        area=new TextArea();
        area.setBounds(20,80,300,300);
        area.addKeyListener(this);
        add(l);
        add(area);
        setSize(400,400);
        setLayout(null);
        setVisible(true);
    }
    public void keyPressed (KeyEvent e)
    {
        l.setText("Key pressed");
        
    }
    public void keyReleased (KeyEvent e)
    {
        l.setText("Key released");
    }
    public void keyTyped (KeyEvent e)
    {
        l.setText("Key typed");
    }
    
    
    
    

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        new Keyevents();
    }
    
}
