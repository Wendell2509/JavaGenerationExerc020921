package br.com.generation.exercicios;

public class while_4 {

	/*
	 * idade sexo tipo
	 */

	public static void main(String[] args) {
		
		int[][] matriz = new int[150][3];

		int pessoasCalmas = 0;
		int mulherNervosa = 0;
		int homemAgressivo = 0;
		int outroCalmo = 0;
		int nervosa40mais = 0;
		int calmo18menos = 0;

		// c0 idade 0-100
		// c1 sexo 1fem 2masc 3outro
		// c2 tipo 1calma 2nervosa 3agressiva

		for (int l = 0; l < 150; l++) {

			matriz[l][0] = (int) Math.floor(Math.random() * (100 - 1 + 1) + 1);
			matriz[l][1] = (int) Math.floor(Math.random() * (3 - 1 + 1) + 1);
			matriz[l][2] = (int) Math.floor(Math.random() * (3 - 1 + 1) + 1);

		}

		for (int l = 0; l < 150; l++) {

			if (matriz[l][2] == 1) {
				pessoasCalmas++;
			}

			if (matriz[l][1] == 1 && matriz[l][2] == 1) {
				mulherNervosa++;
			}

			if (matriz[l][1] == 2 && matriz[l][2] == 3) {
				homemAgressivo++;
			}

			if (matriz[l][1] == 3 && matriz[l][2] == 1) {
				outroCalmo++;
			}

			if (matriz[l][0] > 40 && matriz[l][2] == 2) {
				nervosa40mais++;
			}

			if (matriz[l][0] < 18 && matriz[l][2] == 1) {
				calmo18menos++;

			}
		}

		System.out.println("Pessoas Calmas: " + pessoasCalmas);
		System.out.println("Mulheres Nervosas: " + mulherNervosa);
		System.out.println("Homens Agressivos: " + homemAgressivo);
		System.out.println("Outros Calmos: " + outroCalmo);
		System.out.println("Nervosos +40: " + nervosa40mais);
		System.out.println("Calmos -18: " + calmo18menos);

		// num pessoas calmas
		// num mulher nervosa
		// num homens agressivos
		// num outros calmos
		// pessoas nervosas com mais de 40 anos
		// num de pessoas calmas com menos de 18

	}

}
