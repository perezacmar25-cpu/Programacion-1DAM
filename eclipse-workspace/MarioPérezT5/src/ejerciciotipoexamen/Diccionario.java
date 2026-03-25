package ejerciciotipoexamen;

import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class Diccionario {

	private List<Palabra> listado;

	public Diccionario(List<Palabra> listado) {
		super();
		this.listado = listado;
	}

	public List<Palabra> getListado() {
		return listado;
	}

	public void setListado(List<Palabra> listado) {
		this.listado = listado;
	}

	@Override
	public String toString() {
		return "Diccionario [listado=" + listado + "]";
	}

	public void mostrarPalabras() {

		Iterator<Palabra> it = listado.iterator();
		while (it.hasNext()) {

			Palabra p = it.next();

			System.out.println(p);

		}

	}
	
	public boolean findByName(String nombre) {
		
		for(Palabra p : listado) {
			
			if(p.getNombre().equalsIgnoreCase(nombre)) {
				
				return true;
			}
			
		}
		
		return false;
		
	}
	
	public void agregar(Palabra p) {
		
		listado.add(p);
	}
	
	public void modificarSignificado(String nombre,String significado) {
		
		if(findByName(nombre)) {
			
			for(Palabra p : listado) {
				
				if(p.getNombre().equalsIgnoreCase(nombre)) {
					p.setSignificado(significado);
				}
			}
		}
		
		
		
		
	}
	
	public void comparar(List<Palabra> lista) {
		
		Collections.sort(lista);
		
	}

	



}
