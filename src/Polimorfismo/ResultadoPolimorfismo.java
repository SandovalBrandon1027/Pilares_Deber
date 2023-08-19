package Polimorfismo;

public class ResultadoPolimorfismo {
    public static void main(String[] args) {
        Forma forma1 = new Circulo(5);
        Forma forma2 = new Cuadrado(4);

        System.out.println("Área del círculo: " + forma1.calcularArea());
        System.out.println("Área del cuadrado: " + forma2.calcularArea());
    }
}
