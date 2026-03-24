package ejercicio04Map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

import ejercicio04.Agenda;

public class CrudAgenda {
	
	
	
	private Map <Contacto, String> listado;

	public CrudAgenda(Map<Contacto, String> listado) {
		super();
		this.listado = listado;
	}

	public Map<Contacto, String> getListado() {
		return listado;
	}

	public void setListado(Map<Contacto, String> listado) {
		this.listado = listado;
	}
	
	public void agregarContacto(Contacto c) {
		
		
		listado.put(c, c.getTelefono());
	}
	
	
	public void delete(Contacto c) {
		
		
		listado.remove(c);
		
		
	}
	
	
	public void findByName(String nombre) {
		
	
	
		
		
		
		
	}
	
	public void mostrar() {
		
		
		System.out.println(listado.toString());
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
