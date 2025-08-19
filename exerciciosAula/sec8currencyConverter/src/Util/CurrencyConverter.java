package Util;

public class CurrencyConverter {

	/*
	 * Faça um programa para ler a cotação do dólar, e depois um valor em dólares a
	 * ser comprado por uma pessoa em reais. Informar quantos reais a pessoa vai
	 * pagar pelos dólares, considerando ainda que a pessoa terá que pagar 6% de IOF
	 * sobre o valor em dólar. Criar uma classe CurrencyConverter para ser
	 * responsável pelos cálculos.
	 */

public static double IOF = 0.06;

public static double currencyConverter (double dollarPrice, double dollarQuantity) {
	return dollarPrice * dollarQuantity * (1.0 + IOF);
}


}
