package Parking;

import java.util.Scanner;
/**
 * Main principal de los objetos Coche y Aparcamiento
 * @author andre
 *
 */
public class MainGestionPlaza {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Coche c = new Coche();
		Aparcamiento a = new Aparcamiento(c);	
		int opcion;
		do {
			a.menu();
			opcion = sc.nextInt();
			switch(opcion) {
			case 1: a.aparcar();
			break;
			case 2: a.desocuparPlaza();
			break;
			case 3: a.estadoPlaza();
			break;
			case 4: System.out.println("Fin del programa");
			break;
			default: System.err.println("Opcion no valida");
			}
		}while (opcion!=4);
	}

}
