
import java.awt.Dimension;
import javax.swing.JFrame;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Oleg
 */
public class Client {
    public static void main (String args[]){
    JFrame frame = new JFrame("Matviyishyn's Client");
    frame.add(new ClientView());
    frame.setResizable(true);
    frame.setSize(new Dimension(600,550));
    frame.setMinimumSize(new Dimension(600,550));
    frame.setVisible(true);
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
