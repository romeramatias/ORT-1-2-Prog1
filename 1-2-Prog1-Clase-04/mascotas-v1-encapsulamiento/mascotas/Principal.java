package mascotas;

public class Principal {

    public static void main(String[] args) {
        // Creamos un par de mascotas de prueba
        Perro1 a = new Perro1("Scooby Doo",2, 25, "Gran Danés");
        Perro1 b = new Perro1("Pluto", 4, 20);
        Gato1 c = new Gato1("Felix",3, 17, "Blanquinegro");
        Gato1 d = new Gato1("Garfield", 6, 32, "Naranja");
        Perro1 e = new Perro1("Ayudante de Santa", 2, 14, "Galgo");
        Gato1 f = new Gato1("Bola de nieve II", 4, 20, "Negro");
        Loro1 g = new Loro1("Alex", 2, 1, 80);
        
        System.out.println(a); // Equivalente a esto: System.out.println( a.toString() );
        System.out.println(b); // Equivalente a esto: System.out.println( b.toString() );
        System.out.println(c); // Equivalente a esto: System.out.println( c.toString() );
        System.out.println(d); // Equivalente a esto: System.out.println( d.toString() );
        System.out.println(e); // Equivalente a esto: System.out.println( e.toString() );
        System.out.println(f); // Equivalente a esto: System.out.println( f.toString() );
        System.out.println(g); // Equivalente a esto: System.out.println( g.toString() );
    }
}
