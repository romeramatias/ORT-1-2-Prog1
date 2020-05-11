package mascotas;

public class Gato3 extends Mascota3 {

    private String color;

    public Gato3(String nombre, int edad, int peso, String color) {
        super(nombre, edad, peso); // Se crea primero una mascota
        this.color = color; // Solo los gatos tienen color (segun el ejempli)
    }

    @Override
    public String toString() {
        // Obtengo la representacion en String de la superclase Mascota y agrego los atributos de Gato
        return super.toString() + " De color " + this.color;
    }

    @Override
    public void expresarse() {
        // El método abstracto expresarse en la superclase obliga a sobreescribir
        System.out.println(super.getNombre() + ": MIAU MIAU");
    }
}
