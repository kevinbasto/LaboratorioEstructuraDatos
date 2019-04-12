/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import Model.Nodo;
import java.awt.Color;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

/**
 *
 * @author Kevin
 */
public class DrawNode extends MouseAdapter{

    private CirclePanel panel;

    public DrawNode(CirclePanel panel) {
        super();
        
        this.panel = panel;
    }
     
    @Override
    public void mouseClicked(MouseEvent me) {
        panel.addNodo(new Nodo(me.getX()-12, me.getY()-12, 1, 18, Color.BLUE));
    }
    
}
