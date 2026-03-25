 package ejercicio03;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class GestionAlumnos {
	
	
	private Set <Alumno> lista;

	public GestionAlumnos(Set<Alumno> lista) {
		super();
		this.lista = lista;
	}

	public Set<Alumno> getLista() {
		return lista;
	}

	public void setLista(Set<Alumno> lista) {
		this.lista = lista;
	}

	@Override
	public String toString() {
		return "GestionAlumnos [lista=" + lista + "]";
	}
	
	
	public void agregar(Alumno a) {
		
		lista.add(a);
		
	}
	
	public void borrar(int id) {
		
		Iterator<Alumno> it = lista.iterator();
		
		while(it.hasNext()) {
			
			Alumno a = it.next();
			
			if(a.getId()==id) {
				it.remove();
			}
			
		}
		
	}
	
	
	public double notaMedia() {
		
		double total = 0;
		
		for( Alumno a : lista) {
			
			total+=a.getNotaMedia();
			
		}
		
		return total/lista.size();
		
		
		
	}
	
	
	public int numSuspensos(double suspenso) {
		
		int cont =0;
		
		for( Alumno a : lista) {
			
			if(a.getNotaMedia() < suspenso ) {
				cont++;
			}
			
		}
		
		return cont;
	}
	
	
	
	
	
	
	
	
	
	
	

}