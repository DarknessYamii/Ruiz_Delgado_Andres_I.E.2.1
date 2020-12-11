package Parking;

import java.util.Scanner;
/**
 * Objeto Aparcamiento asociado a Coche
 * @author andre
 *
 */
public class Aparcamiento {

	Scanner sc = new Scanner(System.in);
	/**
	 * @param static numCochesAparcados
	 * @param numero_plaza
	 * @param Coche coche
	 * @param aparcado
	 */
	private int numero_plaza;
	private static int numCochesAparcados;
	private Coche coche;
	private boolean aparcado;
	//Constructor predeterminado
	public Aparcamiento() {
		
	}

	public Aparcamiento(Coche coche) { //Constructor que por defecto se le asigna el objeto coche
		numero_plaza = 1;
		this.coche = coche;
		this.aparcado= true;
		this.numCochesAparcados=0;
		
	}
	public void menu() { //Menu desplegable para ver las diferentes opciones
		System.out.println("Plaza Aparcamiento:"
				+ "\n1. Aparcar noche"
				+ "\n2. Sacar coche"
				+ "\n3. Ver coche aparcado"
				+ "\n4. Salir aplicacion"
				+ "\nOpcion:");
		
	}
	//Metodo usado para aparcar el coche
	public void aparcar() {
		if(aparcado) {
			System.out.println("Introducir matricula");
			coche.setMatricula(sc.next());
			System.out.println("Introducir marca del coche");
			coche.setMarca(sc.next());
			System.out.println("Introducir el modelo del coche");
			coche.setModelo(sc.next());
			aparcado = false;
			numCochesAparcados++;
			System.out.println("El coche se ha aparcado");
		}else {
			System.out.println("Plaza ocupada por otro coche");
		}
	}
	//Metodo el cual se usara para cambiar los valores boolean y hacer que el coche ya no ocupe una plaza
	public void desocuparPlaza() {
		if(!aparcado) {
			System.out.println("Plaza libre, el coche ha salido de la plaza");
			aparcado = true;
		}else {
			System.out.println("ERROR, NO HAY COCHE EN LA PLAZA DE APARCAMIENTO LA PLAZA ESTÁ LIBRE");
		}
	}
	//Metodo que mostrara la informacion del ultimo coche aparcado o no si no hay coche y tambien mostrara todos los coches que han aparcado
	public void estadoPlaza() {
		System.out.println("La plaza esta libre (true) o ocupada (false): "+aparcado);
		System.out.println("Informacion del coche: "+coche.toString());
		System.out.println("Han aparcado un total de "+numCochesAparcados+" coches");
	}

}
