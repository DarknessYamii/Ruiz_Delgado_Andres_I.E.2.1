package DVDCine;
/**
 * Objeto DVDcine el cual contiene todos los metodos y constructores de la clase pruebaDVDCine
 * @author andre
 *
 */
public class DVDCine {
	/**
	 * 
	 * @param nombre
	 * @param autor
	 * @param resumen
	 * @param genero
	 * @param duracion
	 */
	private String nombre,autor,resumen,genero;
	private int duracion;

	public DVDCine(String nombre, String autor, String resumen, String genero, int duracion) {
		
		this.nombre = nombre;
		this.autor = autor;
		this.resumen = resumen;
		this.genero = genero;
		this.duracion = duracion;
	}

	/**
	 * Retorna True si escribes Thriller en el genero
	 * @return
	 */
	public boolean esThriller() {
		if(this.genero.equals("Thriller")) {
			return true;
		}else {
		return false;
		}
	}
	/**
	 * Si escribes algo en el resumen te retornara true
	 * @return
	 */
	public boolean tieneResumen() {
		return !this.resumen.isEmpty();
	}
			 
	
	
	/**
	 * Mostrara la duracion de la pelicula
	 * @return
	 */
	public int muestraDuracion() {
		return this.duracion;
	}
	/**
	 * Retorna toda la informacion sobre la pelicula
	 * @return
	 */
	public String muestraDVDCine() {
		return nombre+" cuyo actor es "+autor+ " del genero "+genero+" que trata sobre "+resumen+" y tiene un duracion de "+duracion;
	}
	

}
	
