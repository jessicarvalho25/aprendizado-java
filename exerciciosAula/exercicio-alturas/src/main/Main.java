package main;

import java.util.Locale;
import java.util.Scanner;

import utilities.Pessoa;

public class Main {

	public static void main(String[] args) {
		/*
		 * Fazer um programa para ler nome, idade e altura de N pessoas, conforme
		 * exemplo. Depois, mostrar na tela a altura média das pessoas, e mostrar também
		 * a porcentagem de pessoas com menos de 16 anos, bem como os nomes dessas
		 * pessoas caso houver.
		 */
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		System.out.printf("Quantas pessoas serão digitadas?");
		int n = sc.nextInt();
		sc.nextLine();
		Pessoa[] pessoas = new Pessoa[n];
		for (int i = 0; i < n; i++) {
			pessoas[i] = new Pessoa();
			System.out.printf("Dados da %da pessoa: %n", i+1);
			System.out.print("Nome: ");
			pessoas[i].setNome(sc.nextLine());
			System.out.printf("Idade: ");
			pessoas[i].setIdade(sc.nextInt());
			System.out.print("Altura: ");
			pessoas[i].setAltura(sc.nextDouble());
			sc.nextLine();

		}

		sc.close();
		
		double somaAltura = 0;
		int pessoasMenosDezesseis = 0;
		
		for (Pessoa pessoa : pessoas) {
			somaAltura += pessoa.getAltura();
			if (pessoa.getIdade() < 16) {
				pessoasMenosDezesseis++;
			}
		}

		double alturaMedia = somaAltura/n;
		System.out.printf("Altura media: %.2f %n", alturaMedia);
		System.out.printf("Pessoas com menos de 16 anos: %.1f%% %n", ((double)pessoasMenosDezesseis/n)*100.0);
		for (Pessoa pessoa : pessoas) {
			if(pessoa.getIdade()<16) {
				System.out.println(pessoa);
			}
		}
	
	}

}
