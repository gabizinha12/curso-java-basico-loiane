package com.loiane.javabasico.exercicios;

import java.util.Scanner;

public class Ex16 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite o tamanho da área");
		double area = sc.nextDouble();
		double litros = area/3;
		double preco = 80.00;
		double qtdLitros = litros/18;
		double precoTotal = qtdLitros * preco;
		System.out.printf("Deverá comprar %.2f litros de latas e pagará %.2f", litros, precoTotal);
		
		

	}

}
