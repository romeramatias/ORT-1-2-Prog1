package mascotas;

public class Gato1 {

    private String nombre;
    private int edad;
    private int peso;
    private String color;

    public Gato1(String nombre, int edad, int peso, String color) {
        this.nombre = nombre;
        this.edad = edad;
        this.peso = peso;
        this.color = color;
    }

    @Override
    public String toString() {
        return this.nombre + ", " + this.edad + " anios, " + this.peso + " kg. De color " + this.color;
    }

    public void maullar() {
        System.out.println(this.nombre + ": MIAU MIAU");
    }
}
