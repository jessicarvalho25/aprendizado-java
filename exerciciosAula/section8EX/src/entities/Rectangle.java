package entities;

public class Rectangle {

	/*
	 * Exercício 1 Fazer um programa para
	 * ler os valores da largura e altura de um retângulo. Em seguida, mostrar na
	 * tela o valor de sua área, perímetro e diagonal. Usar uma classe como mostrado
	 * no projeto ao lado.
	 * 
	 * RECTANGLE ---------- -Width: double -Height: double ---------------- +
	 * Area(): double +Perimeter(): double + Diagonal(): double
	 * 
	 */

	public double widht;
	public double height;

	public double area() {
		return (widht * height);
	}

	public double perimeter() {
		return 2 * (widht + height);

	}

	public double diagonal() {
		return Math.sqrt(height * height + widht * widht);

	}

}
