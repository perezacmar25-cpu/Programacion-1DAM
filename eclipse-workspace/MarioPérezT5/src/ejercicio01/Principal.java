package ejercicio01;

import java.util.ArrayList;
import java.util.List;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		/*
		 * Realizar un programa que permita gestionar notas de texto (como las de un móvil, no son calificaciones
			de clase). Usaremos la clase ArrayList y el listado debe guardar objetos tipo Nota (tú decides los
			atributos que debe tener una nota). Se podrán mostrar de manera individual (sin necesidad de buscar,
			solo diciendo cuál de la lista mostrada), dar información del número de notas guardadas, agregar una
			nueva nota, un método que borre una de las notas guardadas comprobando antes que la lista no está
			vacía. Se borrará por número (la nota 1, la 2...), por lo que habrá que mostrarle al usuario la lista con
			todas las notas (en un método) y su número correspondiente, el usuario introducirá el número de la
			que quiera borrar (esto no es lo ideal puesto que así habría que mostrar todas las notas ¿y si hay miles
			de ellas?). */

		
		
		 	List<Nota> notas = new ArrayList<>();
		
		
			GestionNotas g1 = new GestionNotas(notas);
			
			Nota n1 = new Nota ("Hola", "Mario",1);
			Nota n2 = new Nota("Ángel","No sé",2);
			
			g1.agregar(n1);
			g1.agregar(n2);
			
			System.out.println("Las mostramos:");
			g1.mostrarNotas();
			
			System.out.println("Borramos la nota que está en la posición 1:");
			g1.delete(1);
			
			
			
			g1.mostrarNotas();
			
			System.out.println("Notas guardadas ahora mismo: ");
			System.out.println(g1.numeroNotasGuardadas()); 
			
			System.out.println("Modificamos una nota:");
			g1.modificar("Miguel", 2);
			System.out.println("Y la volvemos a mostrar modificada:");
			g1.mostrarNotas();
		

	
		
		
	}

}
