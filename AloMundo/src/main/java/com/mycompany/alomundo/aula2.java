/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.alomundo;

/**
 *
 * @author ice
 */
import javax.swing.JOptionPane;
import java.lang.Math;

public class aula2 {

    public static void main(String[] args) {
        double x1, x2,y1,y2;
        String v1, v2,v3,v4;

        v1 = JOptionPane.showInputDialog("digite um ponto x");
        v2 = JOptionPane.showInputDialog("digite um ponto y");
        v3 = JOptionPane.showInputDialog("digite outro ponto x");
        v4 = JOptionPane.showInputDialog("digite outro ponto y");
        
        x1 = Double.parseDouble(v1);
        y1 = Double.parseDouble(v2);
        x2 = Double.parseDouble(v3);
        y2 = Double.parseDouble(v4);
        
        double distancia;
        distancia = Math.sqrt(Math.pow((x1-x2),2)+Math.pow((y1-y2),2));
        
        JOptionPane.showMessageDialog(null,distancia);
        
    }

}
