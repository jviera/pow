package com.vieracode.pow.util;

import com.vieracode.pow.exception.VieraCodeMathException;

public final class Util {

	/**
	 * Función de POW sin usar multiplicación/división ni las funciones de las mismas.
	 * @param base
	 * @param exponente
	 * @return
	 */
	public static double pow(int base, int exponente) {
		if (exponente == 0)
			return 1;
		else if (exponente > 0) {
			return mult(base, pow(base, exponente - 1));
		} else {
			return div(pow(base, exponente + 1), base);
		}
	}

	// Para evitar usar '*'
	public static int mult(double x, double y) {
		int z = 0;
		for (int i = 0; i < y; i++) {
			z += x;
		}
		return z;
	}

	// Para evitar usar '/'
	public static int div(double x, double y) {
		int c = 0;
		while (x >= y) {
			c++;
			x -= y;
		}
		// Exacta
		if (x == 0) {
			return c;
		} else {
			throw new VieraCodeMathException("ERROR: Exponente negativo no soportado.");
		}
	}
}