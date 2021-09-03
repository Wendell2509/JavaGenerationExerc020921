package br.com.generation.exercicios;

import java.util.Scanner;

public class while_4_simplificado {

/*

idade (1-100)
sexo ([1]feminino [2]masculino [3]outros)
tipo ([1]calma [2]nervosa [3]agressivo)
	 
*/
	
	public static void main(String[] args) {
		
		Scanner read = new Scanner(System.in);
		
		int pessoas = 5;
		int contador = 0;
		
		int idade = 0;
		int sexo = 0;
		int tipo = 0;
		
		int pessoasCalmas = 0;//calma
		int mulheresNervosas = 0;//mulher e nervosa
		int homensAgressivos = 0;//homens e agressivos
		int outrosCalmos = 0;//outro e calmo
		int nervosos40 = 0;//nervoso e +40 anos
		int calmos18 = 0;//calma e -18
		
		while (contador < pessoas) {//repeticao para 5 pessoas
			
			System.out.println("Digite sua idade: ");
			idade = read.nextInt();
			
			System.out.println("Digite sua sexo (1Fem 2Masc 3Outr): ");
			sexo = read.nextInt();
			
			System.out.println("Digite seu tipo (1Calm 2Nerv 3Agres): ");
			tipo = read.nextInt();
			
			if(tipo == 1) {//pessoa calma
				pessoasCalmas++; // >> 1ª alternativa para somar
				//pessoasCalmas += 1; >> 2ª alternativa para somar
				//pessoasCalmas = pessoasCalmas + 1; >> 3ª alternativa para somar
			}
			
			if (sexo == 1 && tipo == 2){//mulheres nervosas
				mulheresNervosas++;
			}
			
			if(sexo == 2 && tipo == 3){//homens agressivos
				homensAgressivos++;
			}
			
			if(sexo == 3 && tipo == 1) {//outros calmos
				outrosCalmos++;
			}
			
			if(idade >= 40 && tipo == 2) {//nervoso e +40 idade
				nervosos40++;
			}
			
			if(idade < 18 && tipo == 1 ){// calmo e -18 idade
				calmos18++;			
			}		
			
			contador++;//adiciona um ao valor do contador (repetição)
		}
		System.out.println("Pessoas Calmas: " + pessoasCalmas);
		System.out.println("Mulheres Nervosas: " + mulheresNervosas);
		System.out.println("Homens Agressivos: " + homensAgressivos);
		System.out.println("Outras Calmos: " + outrosCalmos);
		System.out.println("Idosos Nervosos: " + nervosos40);
		System.out.println("Jovens Calmos: " + calmos18);
		
		read.close();
	}

}
