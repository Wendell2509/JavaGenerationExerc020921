package br.com.generation.exercicios;
import java.util.Scanner;

public class while_3 {

	public static void main(String args[]){		
				
		int idade = 0;
		int jovens = 0;
		int velhos = 0;
		int totalPessoas = 0;
		
		Scanner read = new Scanner(System.in);
		
		while(idade != -99) {		
			
			System.out.println("Digite uma idade: ");
			idade = read.nextInt();//pergunta
			
			if (idade > 50){//verifica
				velhos++;
			}
			else if (idade < 21 && idade > 0) {
				jovens++;
			}
			totalPessoas++;			
		}
		
		System.out.println("Jovens: " + jovens);
		System.out.println("Velhos: " + velhos);
		System.out.println("Total: "+ totalPessoas);		
	
		read.close();
	}
	
	
}
