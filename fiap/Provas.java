package br.com.fiap;

import java.util.Scanner;

public class Provas {
    public static void main(String[] args) {
        float p1 = 0, p2 = 0, p3 = 0, p4 = 0, media = 0;
        Scanner scan;
        try{
            scan = new Scanner(System.in);
            System.out.print("Digite uma nota: ");
            p1 = scan.nextFloat();
            System.out.print("Digite uma nota: ");
            p2 = scan.nextFloat();
            System.out.print("Digite uma nota: ");
            p3 = scan.nextFloat();
            System.out.print("Digite uma nota: ");
            p4 = scan.nextInt();
            media = (p1 + p2 + p3 + p4) /4;
            System.out.println("Valor 1: " + p1 + "\nValor 2: " + p2 + "\nValor 3: " + p3 + "\nValor 4: " + p4 + "\nSoma dos valores "+ media);








        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }}
