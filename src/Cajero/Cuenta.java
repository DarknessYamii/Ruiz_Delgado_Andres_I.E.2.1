package Cajero;
/**
 *  Objeto Cuenta del main principal funcionCajero
 * @author andre
 *
 */
public class Cuenta {
/**
 *
 * @param retirar
 * @param saldo_inic
 * @param saldo
 * @param cuenta
 * 
 */
	private float saldo,saldo_inic,retirar;
	private Cuenta cuenta;
	
	public Cuenta() { //Constructor Cuenta nueva
		saldo = 0;
		
	}


	public Cuenta(float saldo_inic) { //Constructor Cuenta nueva con saldo inicial
		this.saldo = saldo_inic;
		
	}
	
	
	public void ingresar(float saldo) { //Metodo ingresar 

		this.saldo+= saldo;
	}
	public void extraer(float retirar) { //Metodo retiraar
		if (retirar>saldo) {
			System.out.println("No hay dinero suficiente");
		}else {
			this.saldo-= retirar;
		}
	}
	public float getSaldo() { //Muestra el saldo total
		return saldo;
	}


	
}
