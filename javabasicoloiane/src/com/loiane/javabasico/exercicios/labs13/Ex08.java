package com.loiane.javabasico.exercicios.labs13;

import java.util.Scanner;

public class Ex08 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Insira o valor da sua hora: ");
		double valorHora = sc.nextDouble();
		System.out.println("Insira as horas trabalhadas:  ");
		double horasTrabalhadas = sc.nextDouble();
		double salario = valorHora * horasTrabalhadas;
		System.out.printf("O salário do mês é: %f", salario);
		sc.close();
		
	}

}
