package br.com.fiap.main;

import br.com.fiap.bean.FolhadePagamento;

import java.util.Arrays;
import java.util.Scanner;

public class MainScanner {
    public static void main(String[] args) {
        FolhadePagamento folha = new FolhadePagamento();
        double salarioBruto, descontoINSS, valorPlanoDeSaude;
        int numeroDeDependentes ;
        Scanner scan;
        try{
            scan = new Scanner(System.in);
            //leitura dos valores e armazenamento das variáveis
            System.out.print("Digite o salario bruto: ");
            salarioBruto = scan.nextDouble();

            System.out.print("Digite o desconto do INSS: ");
            descontoINSS = scan.nextDouble();

            System.out.print("Digite o valor do plano de saúde: ");
            valorPlanoDeSaude = scan.nextDouble();

            System.out.print("Digite o número de dependentes: ");
            numeroDeDependentes = scan.nextInt();
            //atribuir os valores ao objeto
            folha.salarioBruto = salarioBruto;
            folha.numeroDeDependentes = numeroDeDependentes;
            folha.descontoINSS = descontoINSS;
            folha.valorPlanoDeSaude = valorPlanoDeSaude;
            //exibindo valores e resultados
            System.out.printf("Salário Bruto: R$ %.2f \nNúmero de Dependentes: %d \nINSS: %.1f%% \nPlano de Saúde: R$ %.2f \nSalário Líquido: R$ %.2f ", folha.salarioBruto,folha.numeroDeDependentes,folha.descontoINSS,folha.valorPlanoDeSaude,folha.calcularSalarioLiquido());
        } catch (Exception e) {
            System.out.println("Formato do número incorreto");
        }
    }}
