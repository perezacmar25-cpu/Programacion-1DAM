package ejemplo;

import java.util.Iterator;
import java.util.List;

public class GestionCanciones {
	
	
	private List<Cancion>lista;

	public GestionCanciones(List<Cancion> lista) {
		super();
		this.lista = lista;
	}

	public List<Cancion> getLista() {
		return lista;
	}

	public void setLista(List<Cancion> lista) {
		this.lista = lista;
	}

	@Override
	public String toString() {
		return "GestionCanciones [lista=" + lista + "]";
	}
	
	
	public Cancion findById(int id) {
		
		Iterator<Cancion> it = lista.iterator();
		
		while(it.hasNext()) {
			Cancion c = it.next();
			if(c.getId()==id) {
				return c;
			}
		}
		
		return null;
		
	}
	
	public void agregarCancion(Cancion c) {
		
		lista.add(c);
		
	}
	
	
	public void borrarCancion(int id) {
		
		Cancion c = findById(id);
		
		if(c!=null) {
			lista.remove(c);
		}
		
	}
	
	
	
	
	
	
	

}
