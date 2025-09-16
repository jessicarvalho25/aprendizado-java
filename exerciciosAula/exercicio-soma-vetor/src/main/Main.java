package main;

import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		/*
		 * Faça um programa que leia N números reais e armazene-os em um vetor. Em
		 * seguida: - Imprimir todos os elementos do vetor - Mostrar na tela a soma e a
		 * média dos elementos do vetor
		 */

		Locale.setDefault(Locale.US);
		
		Scanner sc = new Scanner(System.in);
		System.out.printf("Quantos numeros voce vai digitar? ");
		int n = sc.nextInt();
		double [] array = new double[n];
		double soma = 0;

		for (int i = 0; i < n; i++) {
			System.out.printf("Digite um numero: ");
			array[i] = sc.nextFloat();

		}
		System.out.printf("Valores = ");
		for (double elemento : array) {
			System.out.printf("%.2f ", elemento);
			soma += elemento;

		}
		
		double media = soma/n;
		System.out.printf("%nSOMA = %.2f %n", soma);
		System.out.printf("MEDIA = %.2f", media);
	
	sc.close();
	}


}
