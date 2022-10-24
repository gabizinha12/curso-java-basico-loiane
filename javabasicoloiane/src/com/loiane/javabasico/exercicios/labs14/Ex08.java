package com.loiane.javabasico.exercicios.labs14;

import java.util.Scanner;

public class Ex08 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Digite o preço dos três produtos");
		float preco1 = sc.nextFloat();
		float preco2 = sc.nextFloat();
		float preco3 = sc.nextFloat();

		if (preco1 <= preco2 && preco1 <= preco3) {
			System.out.println("Compre o produto 1");
		} else if (preco2 <= preco1 && preco2 <= preco3) {
			System.out.println("Compre o produto 2");
		} else {
			System.out.println("Compre o produto 3");
		}
		sc.close();
	}

}
