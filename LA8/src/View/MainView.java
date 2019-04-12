/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import javax.swing.JFrame;

/**
 *
 * @author Kevin
 */
public class MainView {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Estructura de Datos");
        CirclePanel panel = new CirclePanel();
        frame.setContentPane(panel);
        panel.addMouseListener(new DrawNode(panel));
        frame.setSize(800,600);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
        
    }
}
