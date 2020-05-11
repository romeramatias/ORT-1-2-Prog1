package mascotas;

// Un Perro es una Mascota
public class Perro2 extends Mascota2 {

    private String raza;

    public Perro2(String nombre, int edad, int peso, String raza) {
        super(nombre, edad, peso); // Se crea primero una mascota
        this.raza = raza; // Solo los perros tienen raza (según mi modelo)
    }

    // Doy la posibilidad de crear instancias de Perro sin requerir la raza.
    // Por defecto, sera "Callejero"
    public Perro2(String nombre, int edad, int peso) {
        super(nombre, edad, peso); // Se crea primero una mascota
        this.raza = "Callejero"; // Solo los perros tienen raza
    }

    @Override
    public String toString() {
        // Obtengo la representacion en String de la superclase Mascota y agrego los atributos de Perro
        return super.toString() + " De raza " + this.raza;
    }

    public void ladrar() {
        // Obtengo su nombre (lo tiene la superclase Mascota) y lo hago ladrar
        System.out.println(super.getNombre() + ": GUAU GUAU");
    }
}
