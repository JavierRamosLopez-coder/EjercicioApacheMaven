package com.everis.mvnJRL;

import org.apache.commons.lang3.StringUtils;
import org.apache.commons.lang3.math.NumberUtils;

/**
 * 
 * @author jramlope
 *
 */
public class App {
	public static void main(String[] args) {

		// Creación de los atributos para la realización del ejercicio
		// Atributos de tipo String
		final String firstString = "Javier";
		final String secondString = "Alonso";
		final String thirdString = "Burun";
		
		//Atributos tipo Integer
		final Integer firstInteger = 0;
		final Integer secondInteger = 5;
		final Integer thirdInteger = 10;

		/** ESTOS SON LOS MÉTODOS CARACTERÍSTICOS DE LA PRIMERA DEPENDENCIA AÑADIDA **/

		/*** Evaluaremos si los tres atributos String tienen información o no */

		// Atributo firstString
		if (StringUtils.isBlank(firstString)) {

			System.out.println("La cadena no tiene información");

		} else {

			System.out.println("La cadena " + firstString + " tiene caracteres");

		}

		// Atributo secondString
		if (StringUtils.isBlank(secondString)) {

			System.out.println("La cadena no tiene información");

		} else {

			System.out.println("La cadena " + secondString + " tiene caracteres");

		}

		// Atributo thirdString
		if (StringUtils.isNotBlank(thirdString)) {

			System.out.println("La cadena " + thirdString + " tiene caracteres");

		} else {

			System.out.println("La cadena no tiene información");

		}

		/*** Ahora vamos a evaluar si las cadenas String son números o no */

		// Atributo firstString
		if (NumberUtils.isCreatable(firstString)) {

			System.out.println("La cadena " + firstString + " es un número");

		} else {

			System.out.println("La cadena " + firstString + " no es un número");

		}

		// Atributo secondString

		/**
		 * es un número o no
		 */
		if (NumberUtils.isDigits(secondString)) {

			System.out.println("La cadena " + secondString + " es un número");

		} else {

			System.out.println("La cadena " + secondString + " no es un número ");

		}

		// Atributo thirdString 
		
		/***
		 * Vamos a usar otro método para comprobar si la tercera cadena es un número o
		 * no
		 **/
		if (NumberUtils.isParsable(thirdString)) {

			System.out.println("La cadena " + thirdString + " es un número");

		} else {

			System.out.println("La cadena " + thirdString + " no es un número");

		}
		
		/** Ahora vamos a realizar algunos métodos para los valores enteros **/
		
		//Atributo firstInteger y secondInteger
		if(NumberUtils.compare(firstInteger, secondInteger)== 0) {
			
			System.err.println("Los números " + firstInteger + " y " + secondInteger + " son iguales");
			
		}else {
			
			System.out.println("Los números " + firstInteger + " y " + secondInteger + " no son iguales");
			
		}
		
		//Atributo secondInteger y thirdInteger
		if(NumberUtils.compare(secondInteger, thirdInteger) != 0) {
			
			System.out.println("Los números " + secondInteger + " y " + thirdInteger + " no son iguales");
			
		}else {
			
			System.out.println("Los números " + secondInteger + " y " + thirdInteger + "son iguales");
			
		}

	}
}
 