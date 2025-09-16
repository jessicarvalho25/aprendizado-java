package principal;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		/*
		 * Faça um programa que leia um número inteiro positivo N (máximo = 10) e depois N números inteiros
e armazene-os em um vetor. Em seguida, mostrar na tela todos os números negativos lidos. 
		 */

		int n;
		Scanner sc = new Scanner(System.in);
		int elemento;
		
		
		do {
		System.out.println("Quantos numeros voce vai digitar?");
		n = sc.nextInt();
		}
		
		while (n>10);
		
		
		int[] array = new int [n];
		
		for (int i  = 0; i<n; i++) {
			System.out.printf("Digite um numero: ");
			elemento = sc.nextInt();
			array[i] = elemento;
		}
		System.out.printf("NUMEROS NEGATIVOS: \n");
		for (int elementos : array) {
			if(elementos < 0) {
				System.out.println(elementos);
			}
		}
		sc.close();
	}

}
