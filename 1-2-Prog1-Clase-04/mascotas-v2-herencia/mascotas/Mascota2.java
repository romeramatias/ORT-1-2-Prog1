package mascotas;

public class Mascota2 {

    private String nombre;
    private int edad;
    private int peso;

    public Mascota2(String nombre, int edad, int peso) {
        this.nombre = nombre;
        this.edad = edad;
        this.peso = peso;
    }

    public String getNombre() {
        return nombre;
    }

    @Override
    public String toString() {
        return nombre + ", " + edad + " anios, " + peso + " kg.";
    }
}
