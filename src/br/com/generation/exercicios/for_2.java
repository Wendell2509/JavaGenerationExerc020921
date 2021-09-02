package br.com.generation.exercicios;

public class for_2 {

	public static void main(String[] args) {
		
		int numPares = 0;
		int numImpares = 0;
		
		for (int i = 0; i < 11; i++){
			
			System.out.println(i);
			
			if (i % 2 == 0) {
				numPares++;
			}else {
				numImpares++;
			}							
		}
		
		System.out.println("Numeros Pares :" + numPares);
		System.out.println("Numeros Impares: " + numImpares);		
	}

}
