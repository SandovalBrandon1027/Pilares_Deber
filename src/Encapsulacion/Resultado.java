package Encapsulacion;

public class Resultado {
    public static void main(String[] args) {
        Micuenta cuenta = new Micuenta("Juan Perez");
        cuenta.depositar(1000);
        cuenta.retirar(300);
        System.out.println("Saldo actual: " + cuenta.obtenerSaldo());
    }
}
