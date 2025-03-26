package br.com.fiap;

import java.util.Scanner;

public class idade {
    public static void main(String[] args) {
        int  nasceu = + 0, ano =  2025, idade = + 0;
        Scanner scan;
        try{
            scan = new Scanner(System.in);
            System.out.print("Coloque o ano em que nasceu: ");
            nasceu = scan.nextInt();
            idade = ano - nasceu;
            System.out.println("Nasceu: " + nasceu + "\nAno: " + ano + "\nIdade: " + idade);

        } catch (Exception e) {
            System.out.println("Formato incorreto");
        }
    }}
