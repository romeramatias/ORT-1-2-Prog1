package programa;
@SuppressWarnings("unused")
public class IntroStatic {
	
	// Ejemplo de static con flota de camiones de una concesionaria
	// de los cuales TODOS son de la misma marca
	
	// Static refiere a variable de la clase, va a ser el mismo valor
	// en todos los objetos creados a partir de esa clase
	private static String marca; // Ejemplo marca = Scania
	// Se utiliza para no usar espacio al pedo en memoria
	// Ej tengo una flota de 10.000 camiones y si 'marca' seria
	// una variable de instancia, tendria 10.000 variables con el mismo valor
	// En diagrama UML se grafica subrayando
	
	// En cambio los atributos que cambian con cada objeto son
	// variables de instancias
	private String modelo;
	private String patente;
	private int kms;
	
	//--------------------------------------------------------------------------
	
}
