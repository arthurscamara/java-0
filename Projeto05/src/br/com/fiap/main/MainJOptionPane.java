package br.com.fiap.main;

import br.com.fiap.bean.FolhadePagamento;

import javax.swing.*;

public class MainJOptionPane {
    public static void main(String[] args) {
        FolhadePagamento folha = new FolhadePagamento();
        double salarioBruto ,descontoINSS, valorPlanoDeSaude;
        int numeroDeDependentes;
        String auxiliar;
        try{
            auxiliar = JOptionPane.showInputDialog("Digite o salario bruto: ");
            salarioBruto = Double.parseDouble(auxiliar);

            auxiliar = JOptionPane.showInputDialog("Digite o desconto do INSS: ");
            descontoINSS = Double.parseDouble(auxiliar);

            auxiliar = JOptionPane.showInputDialog("Valor do plano de saúde: ");
            valorPlanoDeSaude = Double.parseDouble(auxiliar);

            auxiliar = JOptionPane.showInputDialog("Digite o número de dependentes: ");
            numeroDeDependentes = Integer.parseInt(auxiliar);
            //atribuir os valores ao objeto
            folha.salarioBruto = salarioBruto;
            folha.descontoINSS = descontoINSS;
            folha.numeroDeDependentes = numeroDeDependentes;
            folha.valorPlanoDeSaude = valorPlanoDeSaude;
            //exibindo valores e resultados
            String mensagem = String.format("Salário Bruto: R$ %.2f \nNúmero de Dependentes: %d \nINSS: %.1f%% \nPlano de Saúde: R$ %.2f \nSalário Líquido: R$ %.2f ", folha.salarioBruto,folha.numeroDeDependentes,folha.descontoINSS,folha.valorPlanoDeSaude,folha.calcularSalarioLiquido());
            JOptionPane.showMessageDialog(null, mensagem);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Formato de número incorreto");
        }
    }}
