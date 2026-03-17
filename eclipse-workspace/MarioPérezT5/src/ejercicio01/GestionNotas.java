package ejercicio01;

import java.util.ArrayList;
import java.util.List;

public class GestionNotas {
	
	List <Nota> listaNotas = new ArrayList<Nota>();

	public GestionNotas(List<Nota> listaNotas) {
		super();
		this.listaNotas = listaNotas;
	}

	public List<Nota> getListaNotas() {
		return listaNotas;
	}

	public void setListaNotas(List<Nota> listaNotas) {
		this.listaNotas = listaNotas;
	}
	
	
	
	@Override
	public String toString() {
		return "GestionNotas [listaNotas=" + listaNotas + "]";
	}

	public int findById(int id) {
		
		for(Nota nota : listaNotas) {
			
			if(nota.getId()==id) {
				return 1;
			}
		}
		
		return -1;
		
		
	}
	
	public void agregar(Nota n) {
		
		listaNotas.add(n);
		
		
	}
	
	public void delete(int index) {
		
		listaNotas.remove(index-1);
	   
		
	  
	    
	   
	     
	}
	
	public int numeroNotasGuardadas() {
		
		return listaNotas.size();
		
	}
	
	
	public void modificar(String texto, int id) {
		
		for(Nota nota : listaNotas) {
			
			if(nota.getId()==id) {
				
				nota.setTexto(texto);
			}
		}
		
		
	}
	
	
	public void mostrarNotas() {
		
		System.out.println(listaNotas);
		}
	
	
	
	
	
	
	
	
	
	
	
	

}
