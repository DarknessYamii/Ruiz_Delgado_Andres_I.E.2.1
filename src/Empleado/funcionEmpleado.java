package Empleado;

public class funcionEmpleado {

	public static void main(String[] args) {
		Empleado e= new Empleado(342243, 123, 34523, 2, 6, true, 1);
		e.calculoHorasExtra();
		e.sueldoBruto();
		e.calculoIRPF();
		e.println();
		e.printAll();
	}

}
