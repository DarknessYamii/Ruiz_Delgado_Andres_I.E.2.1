	package Marciano;
/**
 * Objeto Marciano
 * @author andre
 *
 */
public class Marciano {
/**
 * @param vivo
 * @param nombre
 * @param static numMarciano
 */
	private boolean vivo;
	private String nombre;
	private static int numMarcianos;
	
	public Marciano(String nombre) { //Constructor que inicia el nombre del marciano e incrementa la cantidad de Marcianos vivo
		this.nombre=nombre;
		vivo = true;
		numMarcianos++;
		System.out.println(nace());
	}
	public String nace() {//Muestra el nombre del marciano y la cantidad de ellos
	return "Hola,he nacido y soy el marciano "+nombre+ " y hay un total de "+numMarcianos+" vivos";
	}
	
	public void muere() { //Muere el marciano y baja el numero de vivos
		if (vivo == true) {
			vivo = false;
			numMarcianos--;
			System.out.println("El marciano "+nombre+" ha muerto y ahora hay un total de "+numMarcianos+" vivos");
		}else {
			System.out.println("El marciano ya esta muerto");
		}
	}
	
	public void estaVivo() { //Analiza si esta vivo o no el marciano
		if (vivo == true) {
			System.out.println("El marciano esta vivo");
		}else {
			System.out.println("El marciano esta muerto");
		}
	}
	
	public String cuentaMarcianos() {//Muestra el total de marcianso vivos
		return "Hay un total de "+numMarcianos;
	}
}
