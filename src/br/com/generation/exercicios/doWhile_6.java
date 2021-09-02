package br.com.generation.exercicios;

import java.util.Scanner;

public class doWhile_6 {

	public static void main(String[] args) {

		int numDig;
		int multiplosTres = 0;
		int quantidadeMultiplosTres = 0;

		Scanner read = new Scanner(System.in);

		do {

			System.out.print("Digite um numero:");
			numDig = read.nextInt();
			if (numDig % 3 == 0 && numDig != 0) {
				multiplosTres += numDig;
				quantidadeMultiplosTres++;
			}
			
		} while (numDig != 0);
		
		System.out.println("Media dos multiplos de Três: " + (multiplosTres/quantidadeMultiplosTres));
		read.close();
	}

}
