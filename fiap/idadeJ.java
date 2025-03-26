package br.com.fiap;

import javax.swing.*;
import java.awt.*;

public class idadeJ {
    public static void main(String[] args) {
        int  nasceu = + 0, ano =  2025, idade = + 0;
        String auxiliar;
        try{
        auxiliar = JOptionPane.showInputDialog("Digite o ano em que nasceu: ");
        nasceu = Integer.parseInt(auxiliar);
        idade = ano - nasceu;
        JOptionPane.showMessageDialog(null,"Ano em que nasceu: " + nasceu + "\nAno: " + ano + "\nIdade: " + idade);
    } catch (HeadlessException e) {
           JOptionPane.showMessageDialog(null, "Formato incorreto");
        }
        }
    }
