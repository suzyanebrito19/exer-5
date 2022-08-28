package application;

import java.util.Locale;
import java.util.Scanner;
import entidade.ConversorMoeda;
public class Programa {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Qual é o preço do dólar? ");
		double precoDolar = sc.nextDouble();
		
		System.out.print("Quantos dólares serão comprados? ");
		double quantia = sc.nextDouble();
		
		double result = ConversorMoeda.dolarParaReal(quantia, precoDolar);
		System.out.printf("Valor a ser pago em reais: = %.2f%n", result);
		sc.close();

	}

}
