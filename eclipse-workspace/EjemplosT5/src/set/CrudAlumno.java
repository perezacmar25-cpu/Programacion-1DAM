package set;

import java.util.Iterator;
import java.util.Set;

public class CrudAlumno {
	
	private Set <Alumno> conjunto1;
	
	
	
	
	
	

	public CrudAlumno(Set<Alumno> conjunto1) {
		super();
		this.conjunto1 = conjunto1;
	}







	public void agregar(Alumno a){
		
		conjunto1.add(a);
	
		
	}
	
	
	public Alumno findByDni(String dni) {
		
		for(Alumno a : conjunto1) {
			if(a.getDni().equalsIgnoreCase(dni)) {
				return a;
			}
		}
		
		return null;
	}
	
	
																																										
	
	public double calcularMedia() {
		
		
		Iterator <Alumno> it = conjunto1.iterator();
		
		while(it.hasNext()) {

			
		
		}
	}
	
	
																																																				
	
	
	
}
