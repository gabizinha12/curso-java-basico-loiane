package com.loiane.javabasico.aula07;

import java.util.Arrays;
import java.util.Scanner;

public class ListaSupermercado {
	public static void main(String[] args) {
		String[] frutasEmPromocao = { "banana", "maçã", "abacaxi", "melão", "mamão" };
		Scanner sc = new Scanner(System.in);
		System.out.println("Qual a sua lista de compras para hoje?");
		String[] listaFrutas = new String[4];
		int numeroFrutas = 0;
		String minhasFrutas = "";

		for (int i = 0; i < frutasEmPromocao.length; i++) {
			for (int j = 0; j < listaFrutas.length; j++) {
				if (minhasFrutas.equals(frutasEmPromocao)) {
					minhasFrutas = sc.next();
					numeroFrutas++;
					listaFrutas[j] = minhasFrutas;
					int desconto = (numeroFrutas * 5);
					System.out.println("Você tem direito a %d de desconto" + desconto);
					System.out.println("O %s está em promoção hoje." + minhasFrutas);
					System.out.println(Arrays.toString(listaFrutas));
					System.out.println(minhasFrutas);
					System.out.println(desconto);
				}

			}
		}
		sc.close();

	}
}
