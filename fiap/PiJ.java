package br.com.fiap;

import javax.swing.*;

public class PiJ {
    public static void main(String[] args) {
        double raio, area;
        String auxiliar;
        try{
            auxiliar = JOptionPane.showInputDialog("Digite o valor do raio");
            raio = Double.parseDouble(auxiliar);
            area = Math.PI * Math.pow(raio, 2);
            JOptionPane.showMessageDialog(null, "A área do círculo é: " + area);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Formato incorreto");

        }
    }}
