package ejemplo;
import utilidades.Leer;

import java.util.LinkedList;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int op;

		
		LinkedList<Cancion> lista = new LinkedList<>();	
		
		Cancion c1 = new Cancion("ASÚMELO",3.00,"Astra");
		Cancion c2 = new Cancion("Chansey",2.45,"Astra");
		Cancion c3 = new Cancion("Ángel guapo",3.15,"Mario");
		
		
		PlayList pl1 = new PlayList(lista);
		
		System.out.println("Elige una opción");
		op=Leer.datoInt();
		switch(op) {
		
		//Case 1: método que añada a la cola
		//Case 2: mñetodo que borre de la cola
		//Case 3: método que te devuelva la canción que quieras por el nombre
		//Case 4: método que muestre todas las canciones que hay en la cola
		//Case 5: método que avance la cola, que borre la primera canción que está en la cola para que suene.
		
		
		
		
		}
		
		

}
	
}
