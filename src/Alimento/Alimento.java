package Alimento;
/**
 * Objeto Alimento de la funcionAlimento
 * @author andre
 *
 */
public class Alimento {
	/**
	 * @param nombre
	 * @param lipidos
	 * @param hidratos
	 * @param proteinas
	 * @param vitaminas
	 * @param minerales
	 * @param animal
	 */
	private String nombre;
	private int lipidos,hidratos,proteinas;
	private String vitaminas,minerales;
	private boolean animal;
	
	public Alimento(String nombre) {
		this.nombre = nombre;
	}

	public Alimento(int lipidos, int hidratos, int proteinas, String vitaminas, String minerales, boolean animal) {
		nombre= this.nombre;
		this.lipidos = lipidos;
		this.hidratos = hidratos;
		this.proteinas = proteinas;
		this.vitaminas = vitaminas;
		this.minerales = minerales;
		this.animal = animal;
		if(animal = true) { 
			System.out.println("Es dietetico");
			}else {
			System.out.println("No es dietetico");
		}
		
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public boolean esDietitico() { //Analisis sobre si es o no es dietetico
		if((vitaminas.equals("B")) && (lipidos<20)) {
			return animal=true;
		}else {
			return animal=false;
		}
		
	}
	//Imprime toda la informacion del alimento
	public String toString() {
		return "El alimento: "+this.nombre+" tiene un total de lipidos del "+this.lipidos+"% , un total de hidratos de "+this.hidratos+"% un total de proteinas de "+this.proteinas+"%"
				+ " el cual su codigo de vitaminas es "+this.vitaminas+" y su codigo de minerales es "+this.minerales;
				
	}
}

