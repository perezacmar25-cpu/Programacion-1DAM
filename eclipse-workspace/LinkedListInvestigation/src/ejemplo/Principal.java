package ejemplo;
import utilidades.Leer;

import java.util.LinkedList;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int op, addSong;
		String borrarSong, findSong;

		
		LinkedList<Cancion> lista = new LinkedList<>();	
		
		Cancion c1 = new Cancion("ASÚMELO",3.00,"Astra");
		Cancion c2 = new Cancion("Chansey",2.45,"Astra");
		Cancion c3 = new Cancion("Ángel guapo",3.15,"Mario");
		
		
		PlayList pl1 = new PlayList(lista);
		do {
		
		System.out.println("Elige una opción");
		System.out.println("\n╔══════════════════════════════════════╗");
        System.out.println("║     SISTEMA DE GESTIÓN DE CANCIONES  ║");
        System.out.println("╠══════════════════════════════════════╣");
        System.out.println("║  1. Agregar una canción               ║");
        System.out.println("║  2. Borrar una canción                ║");
        System.out.println("║  3. Buscar canción por nombre         ║");
        System.out.println("║  4. Mostrar la cola                   ║");
        System.out.println("║  5. Borrar la primera canción         ║");
        System.out.println("║  6. Ver la siguiente canción          ║");
        System.out.println("║  0. Salir                             ║");
        System.out.println("╚══════════════════════════════════════╝");
		op=Leer.datoInt();
		switch(op) {
		
		case 1:
				System.out.println("Pulsa 1 si quieres agregar ASÚMELO");
				System.out.println("Pulsa 2 si quieres agregar Chansey");
				System.out.println("Pulsa 3 si quieres agregar Ángel guapo");
				addSong=Leer.datoInt();
				switch(addSong) {
				
				case 1:
						pl1.agregarCancion(c1);
						break;
					
				case 2:
						pl1.agregarCancion(c2);
						break;
						
				case 3:
						pl1.agregarCancion(c3);
						break;
				}
				break;
		case 2 :
				System.out.println("Di el nombre de la canción que quieras borrar");
				borrarSong = Leer.dato();
				pl1.borrarCancion(borrarSong);
				break;
				
				
		case 3:
				System.out.println("¿Qué canción quieres?");
				findSong = Leer.dato();
				pl1.findByNombre(findSong);
				break;
				
		case 4:
				pl1.mostrarCola();
				break;
				
		case 5:
			pl1.borrarPrimera();
			break;
				
			
		case 6:
				pl1.obtenerSiguiente();
				break;
		
		
		
		
		}
		
		}while(op!=0);
		
		

}
	
}
