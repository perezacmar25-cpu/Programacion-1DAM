package ejerciciotipoexamen;

import java.util.ArrayList;
import java.util.List;

import utilidades.Leer;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int op, idBorrar;
		String palabra, significado, palabra2;

		Palabra p = new Palabra(1, "Coche", "Vehículo de cuatro ruedas");
		List<Palabra> listado = new ArrayList<>();

		Diccionario d1 = new Diccionario(listado);
		
		do {

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
			System.out.println("Agregado correctamente");
			break;
			
		case 4:
			
			System.out.println("¿De qué palabra quiere cambiar el significado?");
			palabra2 = Leer.dato();
			System.out.println("Di el nuevo significado");
			significado=Leer.dato();
			d1.modificarSignificado(palabra2, significado);
			
			
			
		case 5:
				d1.ordenar(listado);
				System.out.println("Lista ordenada correctamente");
				break;
				
				
		case 6:
				System.out.println("Di el id de la palabra que quieras borrar");
				idBorrar = Leer.datoInt();
				d1.delete(idBorrar);
				System.out.println("Borrado correctamente");
				break;
			
		}
		}while(op!=0);

	}

}
