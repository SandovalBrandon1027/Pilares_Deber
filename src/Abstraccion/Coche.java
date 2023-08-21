package Abstraccion;

class Coche extends Vehiculo {
    private int año;

    public Coche(String marca, int año) {
        super(marca);
        this.año = año;
    }

    @Override
    public String obtenerDescripcion() {
        return "Coche de marca " + marca + ", año " + año;
    }



    public static void main(String[] args) {
        Vehiculo vehiculo = new Coche("Toyota", 2023);
        System.out.println(vehiculo.obtenerDescripcion());
    }
}
