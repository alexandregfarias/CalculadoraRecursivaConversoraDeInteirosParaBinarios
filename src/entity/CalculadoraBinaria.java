package entity;
/**
 * Classe responsável por converter números inteiros em binários, retornando uma String.
 * 
 * @author Alexandre Gomes 
 *
 * */

public class CalculadoraBinaria {

	static String decimal = "";

	public static String calculadoraBinaria(int x) {

		if (x == 3) {
			String decimalFinal = "";
			decimal +="11";
			for(int i = decimal.length() - 1; i >= 0; i--) {
				decimalFinal += decimal.charAt(i);

			}
			return decimalFinal;

		} else if (x == 2) {
			String decimalFinal = "";
			decimal +="0";
			for(int i = decimal.length() - 1; i >= 0; i--) {
				decimalFinal += decimal.charAt(i);
			}
			return decimalFinal;
		}

		if(x%2 == 0) {
			decimal += "0";
			x/=2;
			return calculadoraBinaria(x);
		} else {
			x /= 2;
			decimal += "1";

			return calculadoraBinaria(x);
		}

	}

}
