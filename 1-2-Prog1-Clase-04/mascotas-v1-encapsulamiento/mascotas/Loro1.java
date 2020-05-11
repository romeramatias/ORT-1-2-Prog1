package mascotas;

public class Loro1 {

    private String nombre;
    private int edad;
    private int peso;
    private int volumen;

    public Loro1(String nombre, int edad, int peso, int volumen) {
        this.nombre = nombre;
        this.edad = edad;
        this.peso = peso;
        this.volumen = volumen;
    }

    @Override
    public String toString() {
        return this.nombre + ", " + this.edad + " anios, " + this.peso + " kg. Con volumen " + this.volumen;
    }

    public void parlotear() {
        System.out.println(this.nombre + ": PRRIIII PRRIIII");
    }
}
