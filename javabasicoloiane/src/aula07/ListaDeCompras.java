package aula07;

import java.util.Arrays;
import java.util.Scanner;

public class ListaDeCompras {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Insira sua lista de compras");
		String[] frutas = new String[5];

		frutas[0] = sc.nextLine();
		frutas[1] = sc.nextLine();
		frutas[2] = sc.nextLine();
		frutas[3] = sc.nextLine();
		frutas[4] = sc.nextLine();

		for (int i = 0; i < frutas.length; i++) {
			Arrays.toString(frutas);
			System.out.println("As frutas no seu carrinho são " + String.join(null, frutas));

		}

		sc.close();

	}

}
