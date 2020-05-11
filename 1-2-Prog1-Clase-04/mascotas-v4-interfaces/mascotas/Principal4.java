package mascotas;

public class Principal4 {

    public static void main(String[] args) {
        // Creamos un par de mascotas y humanos de prueba
        Perro4 a = new Perro4("Scooby Doo", 2, 25, "Gran Danes");
        Perro4 b = new Perro4("Pluto", 4, 20);
        Gato4 c = new Gato4("Felix", 3, 17, "Blanquinegro");
        Gato4 d = new Gato4("Garfield", 6, 32, "Naranja");
        Perro4 e = new Perro4("Ayudante de Santa", 2, 14, "Galgo");
        Gato4 f = new Gato4("Bola de nieve II", 4, 20, "Negro");
        Loro4 g = new Loro4("Alex", 2, 1, 80);
        Humano4 h = new Humano4("Homero", 96, "Rosquillas");
        Humano4 y = new Humano4("Chavo", 59, "Torta de jamón");
        Humano4 j = new Humano4("Carlos", 84, "Tortilla de papas");

        // Las guardo en un arreglo en cualquier orden
        CapazDeComer[] portalDeHambrientos = {b, a, j, f, h, g, c, y, e, d};

        // Aqui se ve al polimorfismo por interfaces en accion
        for (int i = 0; i < portalDeHambrientos.length; i++) {
            portalDeHambrientos[i].comer(); // Todos responden al mismo mensaje, de diferentes formas
        }
    }
}
