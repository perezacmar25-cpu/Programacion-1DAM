package ejemplo;

import java.util.LinkedList;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		LinkedList<Cancion> lista = new LinkedList<>();	
		
		Cancion c1 = new Cancion("ASÚMELO",3.00,"Astra");
		Cancion c2 = new Cancion("Chansey",2.45,"Astra");
		Cancion c3 = new Cancion("Ángel guapo",3.15,"Mario");
		lista.add(c1);
		lista.add(c2);
		lista.add(c3);
		
		PlayList pl1 = new PlayList(lista);
		
		
		
		
		System.out.println(lista);
		
		
		// eliminamos la primera canción de la lista porque es la que está sonando, entonces ya no está en la cola.
		
		Cancion sonando = lista.removeFirst();
		
		System.out.println("Sonando: " +sonando);
		
		
		// ahora que hemos eliminado la primera canción de la lista que es la que está sonando ahora mismo, la canción que antes era la segunda en la cola, 
		// ahora es la primera, la canción que se reproducirá a continuación.
		
		//Vamos pasando la cola de canciones
		System.out.println("Siguiente canción: " +lista.getFirst());
		sonando = lista.removeFirst();
		System.out.println("Sonando: " +sonando);
		System.out.println("Siguiente canción: "+lista.getFirst());
		sonando = lista.removeFirst();
		System.out.println("Sonando: "+sonando);
		//ya no quedan más canciones en la cola, por lo que ya no sale nada más.
		System.out.println("Siguiente canción : "+lista.getFirst());
		
		
	
	}

}
