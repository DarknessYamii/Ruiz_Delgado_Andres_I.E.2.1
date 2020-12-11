package Parking;
/**
 * Objeto coche
 * @author andre
 *
 */
public class Coche {
	/**
	 * 
	 * @param matricula
	 * @param marca
	 * @param modelo
	 */
	private String matricula,marca,modelo;

	//Constructor predeterminado
	public Coche() {
		
	}
	//Constructor al cual se le asigna matricula marca y modelo para identificar el coche
	public Coche(String matricula, String marca, String modelo) {
		this.matricula = matricula;
		this.marca = marca;
		this.modelo = modelo;
	}

	public String getMatricula() {
		return matricula;
	}

	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	public String toString() {//Informacion del coche a pantalla
		return "La matricula del coche es "+matricula+", cuya marca es un "+marca+" y modelo "+modelo;
	}
}
