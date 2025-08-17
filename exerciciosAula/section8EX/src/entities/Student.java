

/*
 * Exercício 3
 * Fazer um programa para ler o nome de um aluno e as três notas que ele obteve nos três trimestres do ano
(primeiro trimestre vale 30 e o segundo e terceiro valem 35 cada). Ao final, mostrar qual a nota final do aluno no
ano. Dizer também se o aluno está aprovado (PASS) ou não (FAILED) e, em caso negativo, quantos pontos faltam
para o aluno obter o mínimo para ser aprovado (que é 60% da nota). Você deve criar uma classe Student para
resolver este problema.
 */


package entities;

public class Student {

	public double primtrimestre;
	public double segtrimestre;
	public double terctrimestre;
	public String name;
	
	public double finalGrade() {
		return primtrimestre + segtrimestre + terctrimestre;
	}


public boolean passFailed () {
	if (finalGrade() >= 60.00) {
		return true;
	}
	else {
		return false;
	}
}



public String toString () {
	if (!passFailed()) {
		return "FINAL GRADE = " +
				String.format("%.2f%n", finalGrade()) +
				"FAILED" +
				"MISSING POINTS " +
				String.format("%.2f%n", (60.00 - finalGrade()));
				
	}
	else {
		return "FINAL GRADE = " +
				String.format("%.2f%n", finalGrade()) +
				"PASS";
	}
}

}
