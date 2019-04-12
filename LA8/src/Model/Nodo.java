/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.awt.Color;
import java.awt.Graphics;

/**
 *
 * @author jevin
 */
public class Nodo {
    
    private int posX;
    private int posY;
    private int id;
    private int diameter;
    private Color color;

    public Nodo(int posX, int posY, int id, int diameter, java.awt.Color color) {
        this.posX = posX;
        this.posY = posY;
        this.id = id;
        this.diameter = diameter;
        this.color = color;
    }
    
    
    public void draw(Graphics g){
        g.setColor(color);
        g.fillOval(posX, posY, diameter, diameter);
    }

    public int getPosX() {
        return posX;
    }

    public void setPosX(int posX) {
        this.posX = posX;
    }

    public int getPosY() {
        return posY;
    }

    public void setPosY(int posY) {
        this.posY = posY;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getDiameter() {
        return diameter;
    }

    public void setDiameter(int diameter) {
        this.diameter = diameter;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

}
