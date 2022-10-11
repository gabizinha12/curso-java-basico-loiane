package com.loiane.javabasico.aula16;

public class LoopWhile {

	public static void main(String[] args) {
		int i = 1;
		int max = 10;
		
		System.out.println("Contando até " + max);
		
		while(i <= max) { // avalia a expressão e depois executa
			System.out.println("Valor de i " + i);
			i++;
		}
		
		System.out.println(i);

		
		do { // primeiro executa dps avalia a expressão
			i++;
			System.out.println("Valor de i " + i);
		} while(i < 15);
	}

}
