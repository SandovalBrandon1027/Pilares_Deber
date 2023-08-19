package Encapsulacion;

public class Micuenta {
    private String titular;
    private double saldo;

    public Micuenta(String titular) {
        this.titular = titular;
        this.saldo = 0.0;
    }

    public void depositar(double cantidad) {
        if (cantidad > 0) {
            saldo += cantidad;
        }
    }

    public void retirar(double cantidad) {
        if (cantidad > 0 && cantidad <= saldo) {
            saldo -= cantidad;
        }
    }

    public double obtenerSaldo() {
        return saldo;
    }
}

