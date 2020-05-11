package mascotas;

public class Principal3 {

    public static void main(String[] args) {
        // Creamos un par de mascotas de prueba
        Perro3 a = new Perro3("Scooby Doo", 2, 25, "Gran Danés");
        Perro3 b = new Perro3("Pluto", 4, 20);
        Gato3 c = new Gato3("Felix", 3, 17, "Blanquinegro");
        Gato3 d = new Gato3("Garfield", 6, 32, "Naranja");
        Perro3 e = new Perro3("Ayudante de Santa", 2, 14, "Galgo");
        Gato3 f = new Gato3("Bola de nieve II", 4, 20, "Negro");
        Loro3 g = new Loro3("Alex", 2, 1, 80);

        // Las guardo en un arreglo en cualquier orden
        Mascota3[] portalDeLasMascotas = {b, a, f, g, c, e, d};

        // Aqui se ve al polimorfismo en accion
        for (int i = 0; i < portalDeLasMascotas.length; i++) {
            portalDeLasMascotas[i].expresarse(); // Todas responden al mensaje, de diferentes formas
        }
    }
}
