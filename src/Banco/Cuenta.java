package Banco;

public class Cuenta {

    private static long numcuenta;
    private long dni;
    private double saldo;
    private double interes;

    //Constructor por defecto
    public Cuenta() {
        numcuenta=100001;
        dni=0;
        saldo=0;
        interes=0;
    }

    //Constructor con DNI, saldo e interes
    public Cuenta(long dni, double saldo, double interes) {
        this.dni=dni;
        this.saldo=saldo;
        this.interes=interes;
    }

    //Accedentes (get) y mutadores (set)
    public static long getNumcuenta() {
        return numcuenta++;
    }

    public long getDni() {
        return dni;
    }

    public void setDni(long dni) {
        this.dni = dni;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public double getInteres() {
        return interes;
    }

    public void setInteres(double interes) {
        this.interes = interes;
    }

    //actualizarSaldo(): actualizará el saldo de la cuenta aplicándole el interés diario 
    //    (interés anual dividido entre 365 aplicado al saldo actual)
    public void actualizarSaldo() {
        saldo+=saldo*interes/365;
    }

    //ingresar(double): permitirá ingresar una cantidad en la cuenta

     public void ingresar(double ingreso) {
         saldo+=ingreso;
     }

     //retirar(double): permitirá sacar una cantidad de la cuenta (si hay saldo)

     public void retirar(double retiro) {
         if(retiro>saldo) {
             throw new ExceptionInInitializerError("No dispone de saldo suficiente");
         }
         saldo-=retiro;
     }

    //Método que nos permita mostrar todos los datos de la cuenta
     public String toString() {
         return " Nº Cuenta: "+getNumcuenta()+
                 ";\n DNI del titular: "+dni+
                 ";\n Saldo: "+saldo+
                 ";\n Interés anual: "+interes;
     }
}