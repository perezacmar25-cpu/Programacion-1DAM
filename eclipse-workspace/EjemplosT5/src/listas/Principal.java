package listas;

import java.util.ArrayList;
import java.util.List;

public class Principal {

	public static void main(String[] args) {
		
		
		List <String> listaNombres = new ArrayList<String>();
		
		//Agregar un elemento
		
		
		listaNombres.add("Ángel");
		listaNombres.add("Angelillo");
		listaNombres.add(1,"Miguelillo");
		listaNombres.remove(0);
		
		System.out.println(listaNombres);
		
		List<Producto> listaProductos = new ArrayList<Producto>();
		
		Producto p1 = new Producto ("anco cuiao en",20.0,true);
		
		listaProductos.add(p1);
		
		System.out.println(listaProductos.size()); 	
		
		System.out.println(listaNombres.get(1)); 
		System.out.println(listaProductos.contains(p1));
		
		
		
		

	}

}
