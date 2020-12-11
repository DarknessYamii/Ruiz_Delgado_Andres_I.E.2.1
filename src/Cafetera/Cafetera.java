package Cafetera;
/**
 * Objeto Cafetera
 * @author andre
 * @version V1.0
 *
 */
public class Cafetera {

	/**
	 * @param _cantidadActual
	 * @param _cantidadMaxima
	 * @param servir
	 * @param cantidadServida
	 * @param resto
	 */
	private int _cantidadActual,_capacidadMaxima,servir,cantidadServida,resto;
	
	/**
	 * Iniciando la capacidad Maxima y la cantidad incial que seria 0
	 */
	public Cafetera() {
		_capacidadMaxima = 1000;
		_cantidadActual = 0;
		
		
	}
	
	public void llenarCafetera() { //Llenara la cafetera al maximo
		this._cantidadActual = this._capacidadMaxima;
	}
	 public void servirTaza(int servir) { //Aumentara la cantidad de cafe o la igualara a la cantidad maxima
		cantidadServida=_cantidadActual+servir;
		 if (cantidadServida>_capacidadMaxima) {
			 resto=cantidadServida-_capacidadMaxima;
			 cantidadServida=cantidadServida-resto;
			 _cantidadActual=+cantidadServida;
			 System.out.println("Se ha quitado un total de "+resto+"c.c de cafe ya que sobrepasaba" );
		 }else if(servir<0) { 
			 System.out.println("No le puedes quitar cafe a la Cafetera");
		 }
		 else {
			 _cantidadActual =+ cantidadServida;
		 }
	 }
	 public void vaciarCafetera() { //Vaciara la cafetera poniendo la cantidad a 0
		 _cantidadActual= 0;
	 }
	 public void agregarCafe(int servir) { //Agregara una cierta cantidad de cafe
		 if(_cantidadActual>_capacidadMaxima) {
			 System.out.println("No puedes agregar tanto cafe ya que tienes "+_cantidadActual+" y el maximo son "+_capacidadMaxima);
		 }else if (servir<0) {
			 System.out.println("No le puedes quitar cafe a la cafetera");
		 }else {
		 _cantidadActual=+servir;
		 }
		 
	 }

	public int get_cantidadActual() { //Muesra la cantidad actual del cafe
		return _cantidadActual;
	}
	
	

}

