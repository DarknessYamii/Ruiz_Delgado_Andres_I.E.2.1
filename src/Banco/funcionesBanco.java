package Banco;
/**
 * Clase main del objeto Cuenta
 * @author andre
 *
 */
public class funcionesBanco {

	public static void main(String[] args) {
		Cuenta c = new Cuenta();
		c.setDni(15456782);//Insertar DNI
		c.ingresar(100);//Insertar ingresos
		c.setInteres(30);//Insertar interes a obtener
		c.setSaldo(10010);//Insertar salgo inicial
		System.out.println(c.toString());//Mostrara toda la informacion de la cuenta
		c.retirar(10);//Retirara dinero
		c.actualizarSaldo();//Aplicara el interes
		System.out.println(c.toString());
	}

}
