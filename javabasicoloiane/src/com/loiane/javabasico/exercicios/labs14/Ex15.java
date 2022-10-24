package com.loiane.javabasico.exercicios.labs14;

import java.util.Scanner;

public class Ex15 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int primeiroLado = sc.nextInt();
		int segundoLado = sc.nextInt();
		int terceiroLado = sc.nextInt();
		
		
		if(primeiroLado + segundoLado > terceiroLado || segundoLado + primeiroLado > terceiroLado) {
			System.out.println("É um triângulo");
		} else if( primeiroLado == segundoLado || primeiroLado == terceiroLado || terceiroLado == segundoLado || segundoLado == primeiroLado || segundoLado == terceiroLado) {
			System.out.println("Equilátero");
		} else if(primeiroLado == segundoLado || segundoLado == primeiroLado) {
			System.out.println("Isósceles");
		} else if(primeiroLado != segundoLado || segundoLado != terceiroLado || primeiroLado != terceiroLado) {
			System.out.println("Escaleno");
		}
		
		sc.close();

	}

}
