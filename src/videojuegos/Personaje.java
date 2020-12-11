
package videojuegos;

/**
 * Objeto Personaje la cual contiene las class Personaje,Guerrero y Magos
 * @author andre
 *
 */
public class Personaje {

/**
 * Parametros del objeto Personaje
 * @param nombre
 * @param nivel energia
 */
	private String nombre;
	protected int nivel_energia;
	
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String n) {
		this.nombre = n;
	}

	public int getNivel_energia() {
		return nivel_energia;
	}

	public void setNivel_energia(int n_e) {
		this.nivel_energia = n_e;
	}
	
	public Personaje(String n, int n_e) { //Inicializa el Personaje principal con su nombre y nivel de energia
		this.nombre = n;
		this.nivel_energia = n_e;
	}
	
	public int Alimentarse() { //Le aumenta el nivel de energia en 10 cada vez que lo usa
		int cantidad_energia = 10;
		this.nivel_energia = cantidad_energia + nivel_energia;
		return nivel_energia;
		}

}
/**
 * Clase Guerreros que pertenece a Personaje
 * @author andre
 *
 */
	class Guerreros extends Personaje{	
		/**
		 * @param arma
		 */
		private String arma;
		public String getArma() {
			return arma;
		}
		public void setArma(String arma) {
			this.arma = arma;
		}
		public Guerreros(String n, int n_e,String arma) { //Metodo que inicializa Guerrero el cual hereda el nombre y el nivel de energia y este solo implementa el nombre del arma
			super(n, n_e);
			this.arma = arma;
		}
		public void Combatir() { //Metodo para combatir el cual usara una cantidad de energia y despues muestra en pantalla su arma, su gasto de energia y su energia total
			int cantidad_energia = 5;
			if(nivel_energia>=cantidad_energia) {
			this.nivel_energia = nivel_energia - cantidad_energia;
		    System.out.println("El arma usada fue "+arma+ " y la cantidad de energia usada en el ataque fue "+cantidad_energia+" te queda "+nivel_energia+" puntos de energia");
			}else{
				System.out.println("No tienes energia");
			}
		}
		
	}
	/**
	 * Clase Magos que hereda de Personaje 
	 * @author andre
	 *
	 */
	class Magos extends Personaje{
		/**
		 * @param poder
		 */
		private String poder;
		public String getPoder() {
			return poder;
		}

		public void setPoder(String poder) {
			this.poder = poder;
		}

		public Magos(String n, String poder, int n_e) {/**
		Metodo que inicializa Magos el cual hereda el nombre y el nivel de energia y este solo implementa el nombre del poder
		Ademas el nivel de energia en vez de ser elegible por el jugador, sera por defecto 100
		*/
			super(n,n_e);
			this.poder = poder;
			nivel_energia = 100;
		}
		
		public void Encantar() { //Usa el poder y muestra en pantalla el nombre y el consumo de energia de este
			int cantidad_energia = 13;
			if(nivel_energia>=cantidad_energia) {
			nivel_energia = nivel_energia - cantidad_energia;
			System.out.println("Tras lanzar el Encantamiento "+poder+" la energia a disminuido a "+nivel_energia);
			}else {
				System.out.println("No tienes energia");
			}
		}
	}
	


