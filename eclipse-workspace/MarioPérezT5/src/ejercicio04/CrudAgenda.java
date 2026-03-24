package ejercicio04;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class CrudAgenda {
	
	Set <Agenda> contactos;

	public CrudAgenda(Set<Agenda> contactos2) {
		super();
		this.contactos = contactos2;
	}

	public Set<Agenda> getContactos() {
		return contactos;
	}

	public void setContactos(HashSet<Agenda> contactos) {
		this.contactos = contactos;
	}
	
	public void agregarContacto(Agenda c) {
		
		contactos.add(c);
		
		
		
		
	}
	
	
	public void delete(String contacto) {
		
		Iterator <Agenda> it = contactos.iterator();
		while(it.hasNext()) {
			
			Agenda a = it.next();
			if(a.getContacto().equalsIgnoreCase(contacto)){
				
				contactos.remove(a);
				
				
			}
		
		
		
	}

}
	
	public void mostrar() {
		
		System.out.println(contactos.toString()); 
	}
	
	public Agenda findByNombre(String nombre) {
		
		
		for(Agenda a : contactos) {
			
			if(a.getNombre().equalsIgnoreCase(nombre)) {
				
				
				return a;
			}
			
			
			
			
			
		}
		
		return null;
	}
	
	
	
	
	
	
	
	
	
}
