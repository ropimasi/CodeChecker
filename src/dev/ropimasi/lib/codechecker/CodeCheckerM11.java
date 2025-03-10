package dev.ropimasi.lib.codechecker;

//ALGORITMO DE CÓDIGO VERIFICADOR MÓDULO 11.
//RETORNA UM CÓDIGO VERIFICADOR COM APENAS UM CARACTER: "0,1,2,3,4,5,6,7,8,9,X".

import java.security.InvalidParameterException;




public class CodeCheckerM11 {
	public static String getFor(String number) {
		if (!(number instanceof String))
			throw new InvalidParameterException(
					"The parameter whose verification code is being checked must be an string.");
		return calculate(number);
	}



	// Overload above "String getFor(String number)".
	public static String getFor(Long number) {
		if (!(number instanceof Long))
			throw new NumberFormatException(
					"The number whose verification code is being checked must be an integer number.");

		String rtn = String.valueOf(number);
		return calculate(rtn);
	}



	public static String getCompleteFor(String number) {
		if (!(number instanceof String))
			throw new InvalidParameterException(
					"The parameter whose verification code is being checked must be an string.");
		return number + "-" + calculate(number);
	}



	// Overload above "String getCompleteFor(String number)".
	public static String getCompleteFor(Long number) {
		if (!(number instanceof Long))
			throw new NumberFormatException(
					"The number whose verification code is being checked must be an integer number.");

		String rtn = String.valueOf(number);
		return number + "-" + calculate(rtn);
	}


	/* HERE: TODO: continuar desenvolvimento descrito a baixo:
	 * Provides one-digit numeric validation code:
	 * from an integer number (type Long) by multiples-11 approach, to Integer type;
	 * from an integer number (type String) by multiples-11 approach, to Integer type;
	 * */ 
	

	private static String calculate(String number) {
		try {
			Long.parseLong(number);
		} catch (NumberFormatException e) {
			throw new NumberFormatException(
					"The number whose verification code is being checked must be an integer number.");
		}

		String rtn = "";
		int weightSum = 0;
		int weight = 2;

		for (int i = number.length() - 1; i >= 0; i--) {
			int digit = Character.getNumericValue(number.charAt(i));
			weightSum += digit * weight;
			weight++;

			if (weight == 10)
				weight = 2;
		}

		int verifier = 11 - (weightSum % 11);

		if (verifier >= 10)
			rtn = "X";
		else
			rtn = String.valueOf(verifier);

		return rtn;
	}



	// Overload above "String calculate(String number)".
	private static String calculate(Long number) {
		if (!(number instanceof Long))
			throw new NumberFormatException(
					"The number whose verification code is being checked must be an integer number.");

		String strNumber = "";
		try {
			strNumber = Long.toString(number);
		} catch (NumberFormatException e) {
			throw new NumberFormatException(
					"The number whose verification code is being checked must be an integer number.");
		}

		String rtn = "";
		int weightSum = 0;
		int weight = 2;

		for (int i = strNumber.length() - 1; i >= 0; i--) {
			int digit = Character.getNumericValue(strNumber.charAt(i));
			weightSum += digit * weight;
			weight++;

			if (weight == 10)
				weight = 2;
		}

		int verifier = 11 - (weightSum % 11);

		if (verifier >= 10)
			rtn = "X";
		else
			rtn = String.valueOf(verifier);

		return rtn;
	}
}
