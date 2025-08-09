
import java.util.Scanner;
import java.util.Locale;

public class Main {

	public static void main(String[] args) {
		/*
		 * Faça um programa para ler dois valores inteiros, e depois mostrar na tela a
		 * soma desses números com uma mensagem explicativa, conforme exemplos.
		 * 
		 * Scanner scx = new Scanner(System.in); Scanner scy = new Scanner(System.in);
		 * int x, y; x = scx.nextInt(); y = scy.nextInt(); int soma = x + y;
		 * System.out.printf("Soma: %d", soma); scx.close; scy.close;
		 */

		/*
		 * Faça um programa para ler o valor do raio de um círculo, e depois mostrar o
		 * valor da área deste círculo com quatro casas decimais conforme exemplos.
		 * 
		 * Locale.setDefault(Locale.US); double pi = 3.14159; double raio; Scanner
		 * scRaio = new Scanner(System.in); raio = scRaio.nextDouble(); double area =
		 * Math.pow(raio, 2.0)*pi; System.out.printf("A = %.4f", area); scRaio.close;
		 */

		/*
		 * Fazer um programa para ler quatro valores inteiros A, B, C e D. A seguir,
		 * calcule e mostre a diferença do produto de A e B pelo produto de C e D
		 * segundo a fórmula: DIFERENCA = (A * B - C * D). int A, B, C, D; Scanner scA =
		 * new Scanner(System.in); Scanner scB = new Scanner(System.in); Scanner scC =
		 * new Scanner(System.in); Scanner scD = new Scanner(System.in); A =
		 * scA.nextInt(); B = scB.nextInt(); C = scC.nextInt(); D = scD.nextInt(); int
		 * diferenca = (A * B - C * D); System.out.printf("DIFERENCA = %d", diferenca);
		 * scA.close(); scB.close(); scC.close(); scD.close();
		 * 
		 */

		/*
		 * Fazer um programa que leia o número de um funcionário, seu número de horas
		 * trabalhadas, o valor que recebe por hora e calcula o salário desse
		 * funcionário. A seguir, mostre o número e o salário do funcionário, com duas
		 * casas decimais. Locale.setDefault(Locale.US); Scanner scN = new
		 * Scanner(System.in); Scanner scH = new Scanner(System.in); Scanner scV = new
		 * Scanner(System.in); int numero = scN.nextInt(); int hora = scH.nextInt();
		 * double valor = scV.nextDouble(); double salario = hora * valor;
		 * System.out.printf("Number = %d\nSALARY = U$ %.2f", numero, salario);
		 * scN.close(); scH.close(); scV.close();
		 */

		/*
		 * Fazer um programa para ler o código de uma peça 1, o número de peças 1, o
		 * valor unitário de cada peça 1, o código de uma peça 2, o número de peças 2 e
		 * o valor unitário de cada peça 2. Calcule e mostre o valor a ser pago.
		 * 
		 * 
		 * Locale.setDefault(Locale.US); Scanner sc = new Scanner(System.in); int
		 * codigo1 = sc.nextInt(); int numero1 = sc.nextInt(); double unitario1 =
		 * sc.nextDouble(); int codigo2 = sc.nextInt(); int numero2 = sc.nextInt();
		 * double unitario2 = sc.nextDouble(); double total1 = unitario1 * numero1;
		 * double total2 = unitario2 * numero2; double total = total1 + total2;
		 * System.out.printf("VALOR A PAGAR: R$ %.2f", total); sc.close();
		 */

		/*
		 * Fazer um programa que leia três valores com ponto flutuante de dupla
		 * precisão: A, B e C. Em seguida, calcule e mostre: a) a área do triângulo
		 * retângulo que tem A por base e C por altura. b) a área do círculo de raio C.
		 * (pi = 3.14159) c) a área do trapézio que tem A e B por bases e C por altura.
		 * d) a área do quadrado que tem lado B. e) a área do retângulo que tem lados A
		 * e B
		 */
		
		
		/*
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		Double A, B, C;
		A = sc.nextDouble();
		B = sc.nextDouble();
		C = sc.nextDouble();
		double areaTriangulo = (A*C)/2.0;
		double areaCirculo = Math.pow(C, 2)*3.14159;
		double areaTrapezio = ((A+B)*C)/2.0;
		double areaRetangulo = A*B;
		System.out.printf("TRIANGULO: %.3f%nCIRCULO: %.3f%nTRAPEZIO: %.3f%nRETANGULO: %.3f", areaTriangulo, areaCirculo, areaTrapezio, areaRetangulo);
		sc.close();
		*/
			
	}

}
