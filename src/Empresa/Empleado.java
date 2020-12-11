package Empresa;

public class Empleado {

	private String nombre;
	private int horas,sueldo,tarifa;
	/**
	 * Inicializa el constructor empleado con todos sus atributos 
	 * @param nombre
	 * @param horas
	 * @param tarifa
	 */
	public Empleado(String nombre, int horas, int tarifa) {

		this.nombre = nombre;
		this.horas = horas;
		this.tarifa = tarifa;
	}
	public void Sueldo() { //Analiza si trabaja mas de 40 horas y el aplica las tarifas
		if(horas<=40) {
			sueldo=horas*tarifa;
			System.out.println("Pepe trabajó "+horas+" horas, cobra "+tarifa+" euros la hora por lo que le corresponde un sueldo de "+sueldo+" euros");
		}else {
			sueldo= 40*tarifa + (horas - 40)*(tarifa + tarifa/2);
			System.out.println("Pepe trabajó "+horas+" horas, cobra "+tarifa+" euros la hora por lo que le corresponde un sueldo de "+sueldo+" euros");
		}
	}
	
		
}
