package CalculadoraFp;

import java.util.Scanner;

public class CalculadoraFp {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Entre com o valor/hora : ");
        double valorHora = sc.nextDouble();

        System.out.println("Entre com a quantidade de horas trabalhadas no mês: ");
        double horaMes = sc.nextDouble();

        double salarioBruto = valorHora * horaMes;
        double inss = (salarioBruto / 100) * 8;
        double sindicato = (salarioBruto / 100) * 5;
        double ir = (salarioBruto / 100) * 11;
        double totalDescontos = inss + sindicato + ir;
        double salarioLiquido = salarioBruto - inss - sindicato - ir;

        System.out.println("Salário bruto: " + salarioBruto);
        System.out.println("INSS: " + inss);
        System.out.println("Sindicato: " + sindicato);
        System.out.println("IR: " + ir);
        System.out.println("Total de descontos: " + totalDescontos);
        System.out.println("Salário Liquido: " + salarioLiquido);


    }
}








