package mascotas;

public class Principal2 {

    public static void main(String[] args) {
        // Creo algunos objetos con distintas combinaciones

        // VALIDO
        Perro2 p = new Perro2("Boby", 2, 3, "Pekines");
        System.out.println(p);
        p.ladrar(); // Los perros pueden ladrar

        System.out.println("");

        // VALIDO
        Mascota2 m = new Mascota2 ("Pepe", 4, 2); // Mascota generica
        System.out.println(m);
        // Las mascotas genericas no ladran, ni maullan, ni parlotean

        System.out.println("");

        // VALIDO
        Mascota2 g = new Gato2 ("Michi", 1, 3, "Negro"); // Un Gato es una Mascota.
        // A pesar de guardar una referencia a un Gato, se comportara como una mascota genérica.
        System.out.println(g);
        // g.maullar(); No se puede

        System.out.println("");

        // NO VALIDO
        // Loro l = new Mascota("Luis",5,2); // No se puede. Una Mascota no es un Loro.
    }
}
