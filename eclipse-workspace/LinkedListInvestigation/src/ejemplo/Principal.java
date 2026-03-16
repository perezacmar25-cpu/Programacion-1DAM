package ejemplo;

import java.util.LinkedList;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		LinkedList<String> lista = new LinkedList<>();		
		
		lista.add("Astra");
		lista.add("ASÚMELO");
		lista.add("Chansey");
		
		System.out.println(lista);
		
		
		//eliminamos la primera canción de la lista porque es la que está sonando, entonces ya no está en la cola.
		
		String sonando = lista.removeFirst();
		
		System.out.println("Sonando: " +sonando);
		
		
		//ahora que hemos eliminado la primera canción de la lista que es la que está sonando ahora mismo, la canción que antes era la segunda en la cola, 
		//ahora es la primera, la canción que se reproducirá a continuación.
		
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
