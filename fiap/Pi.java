package br.com.fiap;

import java.util.Scanner;

public class Pi {
    public static void main(String[] args) {
        double raio, area;
        final double PI = 3.1415;
        Scanner scan;
        try{
            scan = new Scanner(System.in);
            System.out.print("Digite o valor do raio: ");
            raio = scan.nextDouble();
            area = PI * (raio * raio);
            System.out.print("A área do círculo é: " + area);
        } catch (Exception e) {
            System.out.println("Formato incorreto");
        }
    }}
