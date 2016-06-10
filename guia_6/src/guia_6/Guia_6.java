package guia_6;

import java.util.Scanner;

public class Guia_6 {

	public static void pregunta1() {
		int totalPagar = 10;
		for (int i = 0; i <= 20; i++) {

			totalPagar += i * 10;
			System.out.println((i + 1) + ".-mes" + totalPagar);
		}

		System.out.print("\ntotal a pagar = " + totalPagar);
	}

	public static int pregunta2() {
		Scanner S = new Scanner(System.in);
		int moneda1 = 0, moneda2 = 0, moneda3 = 0, moneda4 = 0, moneda5 = 0, moneda6 = 0;
		int billete1 = 0, billete2 = 0, billete3 = 0, billete4 = 0, billete5 = 0;
		int totalPagar = 0;
		System.out.print("cuantas monedas son de 1");
		moneda1 = S.nextInt();
		System.out.print("cuantas monedas son de 5");
		moneda6 = S.nextInt();
		System.out.print("cuantas monedas son de 10");
		moneda2 = S.nextInt();
		System.out.print("cuantas monedas son de 50");
		moneda3 = S.nextInt();
		System.out.print("cuantas monedas son de 100");
		moneda4 = S.nextInt();
		System.out.print("cuantas monedas son de 500");
		moneda5 = S.nextInt();
		System.out.print("-------------------------------");
		System.out.print("cuantos billetes son de 1000");
		billete1 = S.nextInt();
		System.out.print("cuantos billetes son de 2000");
		billete2 = S.nextInt();
		System.out.print("cuantos billetes son de 5000");
		billete3 = S.nextInt();
		System.out.print("cuantos billetes son de 10000");
		billete4 = S.nextInt();
		System.out.print("cuantos billetes son de 20000");
		billete5 = S.nextInt();

		S.close();
		totalPagar = 1 * moneda1 + 5 * moneda6 + 10 * moneda2 + 50 * moneda3 + 100 * moneda4 + 500 * moneda5
				+ 1000 * billete1 + 2000 * billete2 + 5000 * billete3 + 10000 * billete4 + 20000 * billete5;
		return totalPagar;

	}

	public static void pregunta3(int numeroAlumnos) {
		float[] vec1 = new float[numeroAlumnos];
		Scanner S = new Scanner(System.in);
		int apro = 0;
		int repro = 0;
		float[] aprobados;
		float[] reprobados;
		int notas = 0;
		for (int i = 0; i < numeroAlumnos; i++) {
			System.out.print("ingrese notas.");
			notas = S.nextInt();
			vec1[i] = notas;
			if (vec1[i] >= 4) {
				apro++;
			} else
				repro++;
		}
		aprobados = new float[apro];
		reprobados = new float[repro];
		for (int i = 0; i < numeroAlumnos; i++) {
			if (vec1[i] >= 4) {
				aprobados[i] = vec1[i];
			} else
				repro++;
			reprobados[i] = vec1[i];
		}
		for (int i = 0; i < apro; i++) {
			System.out.print(aprobados[i] + " ");
		}
		for (int i = 0; i < repro; i++) {
			System.out.print(reprobados[i] + " ");
		}

	}

	public static int pregunta4() {
		Scanner S = new Scanner(System.in);
		int j = 10;
		int resto;
		int aux;
		int size = 0;
		int[] vec1;
		char aux1;
		int numero;
		int suma = 0;
		int checksum = 0;
		String a = new String();
		do {
			System.out.print("ingrese un numero de 9 digitos : ");
			numero = S.nextInt();
			a = Integer.toString(numero);
			size = a.length();

		} while (size > 9);
		vec1 = new int[size];
		for (int i = 0; i < a.length(); i++) {
			aux1 = a.charAt(i);
			aux = Integer.parseInt(a.valueOf(aux1));
			vec1[i] = aux;
		}
		for (int i = 0; i < size; i++) {

			System.out.println(vec1[i] + " x " + j);
			suma += vec1[i] * j;
			j--;
		}
		resto = suma % 11;
		if (resto > 9) {
			for (int i = 0; i < size; i++) {
				System.out.print(vec1[i] + " ");
			}
			System.out.print("X");
		} else if (resto == 0) {
			checksum = resto;
			for (int i = 0; i < size; i++) {
				System.out.print(vec1[i] + " ");
			}
			System.out.print("0");
		} else {
			checksum = 11 - resto;
			for (int i = 0; i < size; i++) {
				System.out.print(vec1[i] + " ");
			}
			System.out.print(resto);
		}
		return resto;
	}

	public static void pregunta5() {
		Scanner S = new Scanner(System.in);

		int p;
		int resto;
		int aux;
		int size = 0;
		int[] vec1;
		char aux1;
		int numero;
		int suma = 0;
		int checksum = 0;
		int j = 2;
		String a = new String();

		System.out.print("ingrese rut : ");
		numero = S.nextInt();
		a = Integer.toString(numero);
		size = a.length();
		vec1 = new int[size];
		p = size - 1;

		for (int i = 0; i < a.length(); i++) {
			if (p >= 0) {
				aux1 = a.charAt(p); // extraer_caracter.
				aux = Integer.parseInt(a.valueOf(aux1)); // transforma_de_Char
															// A_Int.
				vec1[i] = aux;
				p--;
			}
		}
		for (int i = 0; i < a.length(); i++) {

			if (j > 7)
				j = 2;
			suma += vec1[i] * j;
			j++;

		}
		resto = suma % 11;

		checksum = 11 - resto;

		if (checksum == 10) {
			for (int i = size - 1; i >= 0; i--) {
				System.out.print(vec1[i]);
			}
			System.out.print("-K");
		} else if (checksum == 11) {
			checksum = resto;
			for (int i = size - 1; i >= 0; i--) {
				System.out.print(vec1[i]);

			}
			System.out.print("-0");
		} else {

			for (int i = size - 1; i >= 0; i--) {
				System.out.print(vec1[i] + " ");
			}
			System.out.print("-" + checksum);
		}

	}

	public static void pregunta6(long numero) {
		String A = new String();
		A = Long.toString(numero);
		long[] vec1 = new long[A.length()];
		char aux = ' ';
		long aux1 = 0;
		int p = 1;
		long numero1 = 0;
		String aux3 = new String();
		int suma = 0;

		// -------------------------------------------
		for (int i = 0; i < A.length(); i++) {
			aux = A.charAt(i);
			aux1 = Long.parseLong(A.valueOf(aux));
			vec1[i] = aux1;

		}
		aux1 = 0;
		aux = ' ';

		while (p < vec1.length) {

			numero1 = vec1[p] * 2;
			if (numero1 > 10) {
				aux3 = Long.toString(numero1);
				for (int i = 0; i < 2; i++) {
					aux = aux3.charAt(i);
					aux1 = Long.parseLong(aux3.valueOf(aux));
					suma += aux1;
				}
			} else {

				suma += numero1;

			}
			p += 2;
		}

		for (int i = 0; i < 6; i++) {

			suma += vec1[2 * i];

		}
		int resto = suma % 10;
		if (resto == 0) {
			System.out.print("numero correcto.");
		} else {
			System.out.print("numero incorrecto.");
		}

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		pregunta1();
		pregunta2();
		pregunta3(2);
		pregunta4();
		pregunta5();
		pregunta6(49927398716L);

	}

}
