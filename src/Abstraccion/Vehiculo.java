abstract class Vehiculo {
    protected String marca;

    public Vehiculo(String marca) {
        this.marca = marca;
    }

    // Método abstracto para obtener la descripción del vehículo
    public abstract String obtenerDescripcion();
    }