package ejerciciotipoexamen;

import java.util.ArrayList;
import java.util.List;

import utilidades.Leer;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int op;
		String palabra;

		Palabra p = new Palabra(1, "Coche", "Vehículo de cuatro ruedas");
		List<Palabra> listado = new ArrayList<>();

		Diccionario d1 = new Diccionario(listado);

		System.out.println("Elige una opción: ");
		op = Leer.datoInt();
		switch (op) {

		case 1:
			d1.mostrarPalabras();
			break;

		case 2:
			System.out.println("¿Qué palabra quieres?");
			palabra = Leer.dato();
			d1.findByName(palabra);
			if (d1.findByName(palabra)) {
				System.out.println(p.getSignificado());
			} else {
				System.out.println("No se ha encontrado la palabra");
			}

			break;
			
			
		case 3 :
			
			d1.agregar(p);
			break;
			
		case 4:
			
				
		}

	}

}
