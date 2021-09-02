package br.com.generation.exercicios;

import java.util.Scanner;

public class doWhile_5 {

	public static void main(String[] args) {

		Scanner read = new Scanner(System.in);

		int numDig;
		int soma = 0;

		do {
			
			System.out.print("Digite um numero: ");
			numDig = read.nextInt();
			soma += numDig;

		} while (numDig != 0);

		System.out.println("Soma: " + soma);
		read.close();
	}

}
