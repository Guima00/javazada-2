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
import java.awt.Graphics;
import javax.swing.JPanel;

public class Classedodesafio extends JPanel {

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        int width = getWidth();
        int height = getHeight();
        
        double slices = 15;
        int x1,y1,x2,y2;
        double sliceWidth = width / slices;
        double sliceheight = height / slices;
        
        
    }
    
    
}
