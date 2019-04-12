/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import Model.Nodo;
import java.awt.Color;
import java.awt.Graphics;
import java.util.ArrayList;


import javax.swing.JPanel;

/**
 *
 * @author Kevin
 */
public class CirclePanel extends JPanel{    
    
    private ArrayList<Nodo> nodos = new ArrayList<Nodo>();
    
    public void addNodo(Nodo nodo){
        nodos.add(nodo);
        this.repaint();
    }
    
    @Override
    public void paint(Graphics g){
        g.setColor(Color.RED);
        
        nodos.forEach((e) -> {
            e.draw(g);
        });
    }
    
}
