package Cajero;

import java.util.InputMismatchException;
import java.util.Scanner;

public class funcionCajero {

	public static void main(String[] args) {
		Cuenta cuenta = null;
		Scanner sc = new Scanner(System.in);
		boolean repetir = true;
		while(repetir) {
			System.out.println("1.-Crear cuenta vacia");
			System.out.println("2.-Crear cuenta con saldo inicial");
			System.out.println("3.-Ingresar dinero");
			System.out.println("4.-Extraer dinero");
			System.out.println("5.-Ver saldo");
			System.out.println("6.-Salir");
			System.out.println("Seleccione una opcion");
			
			try {
				switch (sc.nextInt()) {
				case 1 : cuenta = new Cuenta();
				break;
				
				case 2 : 
					System.out.println("Dinero inicial de la cuenta:");
					cuenta = new Cuenta(sc.nextFloat());
				break;
				case 3 :System.out.println("Dinero a ingresar");
					cuenta.ingresar(sc.nextFloat());
				break;
				case 4:System.out.println("Dinero a retirar");
					cuenta.extraer(sc.nextFloat());
				break;
				case 5:System.out.println("Dinero total:"); 
					System.out.println(cuenta.getSaldo());
				break;
				case 6:  repetir = false;
				break;
				default : System.out.println("Opcion no valida");
				
				}
				
			}catch (InputMismatchException e) {
				System.err.println("Error: valor no valido");
			}catch (NullPointerException e) {
				System.err.println("Primero debes crear la cuenta");
			}
			
		}
	}
}
