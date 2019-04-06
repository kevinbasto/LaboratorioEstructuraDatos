/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import java.awt.Graphics;
import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 *
 * @author Kevin
 * 
 * vekin tobas
 */
public class Panel extends JPanel{
    
    
    public void paintComponent(Graphics g){
        
    }
    
    public static void main(String[] args) {
        
        Panel panel = new Panel();
        JFrame jframe = new JFrame();
        
        jframe.setTitle("Estructura de datos");
        jframe.setSize(800, 600);
        jframe.setVisible(true);
        jframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
