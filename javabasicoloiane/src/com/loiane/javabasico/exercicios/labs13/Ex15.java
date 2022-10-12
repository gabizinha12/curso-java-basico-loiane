package com.loiane.javabasico.exercicios.labs13;

import java.util.Scanner;

public class Ex15 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Entre com o valor hora: ");
		double valorHora = sc.nextDouble();
		System.out.print("Entre com as horas trabalhadas:  ");
		double horasTrabalhadas = sc.nextDouble();
		double salarioBruto = valorHora * horasTrabalhadas;
		System.out.printf("O salário bruto é %.2f", salarioBruto);
		double descontoINSS = 0.08;
		double descontoSindicato = 0.05;
		double descontoIR = 0.11;
		double qtoPagouAoInss = salarioBruto * descontoINSS / 100.0f;;
		double qtoPagouAoSindicato = salarioBruto * descontoSindicato / 100.0f;;
		System.out.printf(" Pagou ao INSS : %.2f ", qtoPagouAoInss);
		System.out.printf(" Pagou ao sindicato: %.2f ", qtoPagouAoSindicato);
		double salarioLiquido = salarioBruto - (salarioBruto * (descontoINSS + descontoSindicato + descontoIR) / 100);
		System.out.printf(" O salário líquido é :%.2f ", salarioLiquido);
	}

}
