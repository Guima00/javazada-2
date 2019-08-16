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

public class edoidera {

    public static void main(String[] args) {
        String nome;
        nome = JOptionPane.showInputDialog("digite o seu nome");
        if (nome == null || nome.equals( "") ) {
            JOptionPane.showMessageDialog(null, "digita algo pfvr");
        } else {
            JOptionPane.showMessageDialog(null, "olá " + nome);
        }
    }
}
