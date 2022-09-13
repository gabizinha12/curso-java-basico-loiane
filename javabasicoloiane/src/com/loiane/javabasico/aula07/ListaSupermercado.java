package com.loiane.javabasico.aula07;

import java.util.Arrays;
import java.util.Scanner;

public class ListaSupermercado {
	public static void main(String[] args) {
		String[] frutasEmPromocao = {"banana", "maçã", "abacaxi", "melão", "mamão"};
		Scanner sc = new Scanner(System.in);
		System.out.println("Qual a sua lista de compras para hoje?");
		String[] listaFrutas = new String[4];
		int numeroFrutas = 0;
		String minhasFrutas = "";
		
		
		for(int i = 0; i < frutasEmPromocao.length; i++) {
		//	System.out.println(frutasEmPromocao[i]);
			for(int j = 0; j < listaFrutas.length; j++) {
				minhasFrutas = sc.nextLine();
				listaFrutas[i] += numeroFrutas;
				//int desconto = (numeroFrutas * 5);
				System.out.println(Arrays.toString(listaFrutas));
				System.out.println(minhasFrutas);
				//System.out.println(desconto);
			//	if(frutasEmPromocao.equals(listaFrutas)) {
					
				//}

			}
		}
		sc.close();
	}

}
