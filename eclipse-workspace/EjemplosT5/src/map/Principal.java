package map;

import java.util.HashMap;
import java.util.Map;

public class Principal {

	public static void main(String[] args) {
		
		Map <Integer,String> lista = new HashMap <Integer,String> ();
		
		lista.put(1, "Mario");
		lista.put(2, "Ángel");
		
		System.out.println(lista);
		
		lista.put(1, "Ángel");
		
		System.out.println(lista);
		
		lista.remove(2);
		
		System.out.println(lista);
		lista.put(4, "Mariooo");
		
		System.out.println(lista.values()); 
	
		
		System.out.println(lista.keySet());
		
		System.out.println();

	}

}
