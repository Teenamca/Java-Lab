/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mouseevents;

/**
 *
 * @author sjcet
 */
import java.awt.*;
import java.awt.event.*;
public class Mouseevents extends Frame implements MouseListener{
    Label l;

    public Mouseevents() throws HeadlessException {
        addMouseListener(this);
        l=new Label();
        l.setBounds(20,50,100,20);
        add(l);
        setSize(300,300);
        setLayout(null);
        setVisible(true);
    }
    public void mouseclicked(MouseEvent e)
    {
        l.setText("Mouse clicked");
    }
    public void mouseEntered(MouseEvent e)
    {
        l.setText("Mouse entered");
    }
    public void mouseExited(MouseEvent e)
    {
        l.setText("Mouse exited");
    }
    public void mousePressed(MouseEvent e)
    {
        l.setText("Mouse pressed");
    }
    public void mouseReleased(MouseEvent e)
    {
        l.setText("Mouse released");
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        new Mouseevents();
    }

    @Override
    public void mouseClicked(MouseEvent me) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
