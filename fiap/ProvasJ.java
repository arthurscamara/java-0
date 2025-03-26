package br.com.fiap;

import javax.swing.*;

public class ProvasJ {
    public static void main(String[] args) {
        float p1 = 0, p2 = 0, p3 = 0, p4 = 0, media = 0;
        String auxiliar;
        try{
            auxiliar = JOptionPane.showInputDialog("Digite uma nota: ");
            p1 = Float.parseFloat(auxiliar);
            auxiliar = JOptionPane.showInputDialog("Digite uma nota: ");
            p2 = Float.parseFloat(auxiliar);
            auxiliar = JOptionPane.showInputDialog("Digite uma nota: ");
            p3 = Float.parseFloat(auxiliar);
            auxiliar = JOptionPane.showInputDialog("Digite uma nota: ");
            p4 = Float.parseFloat(auxiliar);
            media = (p1 + p2 + p3 + p4) /4;
           JOptionPane.showMessageDialog(null, "Sua média é: " + media);
    } catch (Exception e) {
            JOptionPane.showMessageDialog(null,"Formato incorreto");
        }
    }}
