package ejercicio01;

import java.util.ArrayList;
import java.util.List;

public class GestionNotas {
	
	/*private List<Nota> listaNotas; Así no está instanciada la lista*/
	private  List <Nota> listaNotas;

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
	
	
	

	public Nota findById(int id) {
		
		for(Nota nota : listaNotas) {
			
			if(nota.getId()==id) {
				return nota;
			}
		}
		
		return null;
		
		
	}
	
	public void agregar(Nota n) {
		
		listaNotas.add(n);
		
		
	}
	
	public void delete(int id) {
		
		Nota n = findById(id);
			if(n!=null) {
				listaNotas.remove(n);
			}
		
	   
	     
	}
	
	public int numeroNotasGuardadas() {
		
		return listaNotas.size();
		
	}
	
	
	public void modificar(String texto, int id) {
		
		Nota n = findById(id);
			
			if(n!=null) {
				
				n.setTexto(texto);
			}
		
		
		
	}
	
	
	public void mostrarNotas() {
		
		System.out.println(listaNotas);
		
		}
	
	public boolean comprobarIgualTitulo() {
		
		for(int i = 0; i<listaNotas.size() && listaNotas !=null ; i++) {
			
			if(listaNotas.get(i).getTexto().equals(listaNotas.get(i-1).getTexto())) {
				
				return true;
			}
			
			
		}
		
		
		return false;
		
	}
	
	
	
	
	
	
	
	
	
	
	
	

}
