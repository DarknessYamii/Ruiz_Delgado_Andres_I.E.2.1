package Direccion;
/**
 * Objeto direccion el cual contendra la calle ciudad numero y piso del empleado
 * @author andre
 *
 */
public class Direccion {

	/**
	 * Objeto Direccion 
	 * @param calle
	 * @param ciudad
	 * @param numero
	 * @param piso
	 */
	private String calle,ciudad;
	private int numero,piso;


	public Direccion() {
		this.calle = "";
		this.ciudad = "";
		this.numero = 0;
		this.piso = 0;
	}

	public String getCalle() {
		return calle;
	}

	public void setCalle(String calle) {
		this.calle = calle;
	}

	public String getCiudad() {
		return ciudad;
	}

	public void setCiudad(String ciudad) {
		this.ciudad = ciudad;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public int getPiso() {
		return piso;
	}

	public void setPiso(int piso) {
		this.piso = piso;
	}
	
	public String toString() {
		return " Calle: "+calle+", Ciudad: "+ciudad+", Numero: "+numero+", Piso: "+piso;
	}
}
