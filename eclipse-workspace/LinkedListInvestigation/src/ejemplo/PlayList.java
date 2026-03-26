package ejemplo;

import java.util.Iterator;
import java.util.LinkedList;

public class PlayList {
	
	
	private LinkedList<Cancion> lista;

	public PlayList(LinkedList<Cancion> lista) {
		super();
		this.lista = lista;
	}

	public LinkedList<Cancion> getLista() {
		return lista;
	}

	public void setLista(LinkedList<Cancion> lista) {
		this.lista = lista;
	}

	@Override
	public String toString() {
		return "PlayList [lista=" + lista + "]";
	}
	
	
	public Cancion findByNombre(String nombre) {
		
		for(Cancion c : lista) {
			
			if(c.getNombre().equalsIgnoreCase(nombre)) {
				return c;
			}
		}
		
		return null;
		
	}
	
	
	
	public void agregarCancion(Cancion c) {
		
		
		lista.add(c);
		
		
		
		
	}
	
	public void borrarCancion(String nombre) {
		
		Cancion c = findByNombre(nombre);
		
		if(c.getNombre().equalsIgnoreCase(nombre)) {
			
			lista.remove(c);
		}
		
	}
	
	
	public void mostrarCola() {
		
		Iterator <Cancion> it = lista.iterator();
		
		while(it.hasNext() && !lista.isEmpty()) {
			
			Cancion c = it.next();
			System.out.println("Cola: "+c);
			
		}
		
		
	}
	
	public void borrarPrimera() {
		
		lista.removeFirst();
		
		
	}
	
	public void obtenerSiguiente() {
		
		System.out.println(lista.getFirst()); 
	}
	
	
	
	
	
	
	
	
	
	

}
