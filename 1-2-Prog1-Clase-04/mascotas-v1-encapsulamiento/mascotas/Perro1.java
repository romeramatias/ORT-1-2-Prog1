package mascotas;

public class Perro1 {

    private String nombre;
    private int edad;
    private int peso;
    private String raza;

    public Perro1(String nombre, int edad, int peso, String raza) {
        this.nombre = nombre;
        this.edad = edad;
        this.peso = peso;
        this.raza = raza;
    }

    // Doy la posibilidad de crear instancias de Perro sin requerir la raza.
    // Por defecto, sera "Callejero"
    public Perro1(String nombre, int edad, int peso) {
        this.nombre = nombre;
        this.edad = edad;
        this.peso = peso;
        this.raza = "Callejero";
    }

    @Override
    public String toString() {
        return this.nombre + ", " + this.edad + " anios, " + this.peso + " kg. De raza " + this.raza;
    }

    public void ladrar() {
        System.out.println(this.nombre + ": GUAU GUAU");
    }
}
