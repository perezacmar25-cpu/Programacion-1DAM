package ejercicio04Map;

import java.util.HashMap;
import java.util.Map;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Map <Contacto, String> listado = new HashMap<>();

		
		Contacto c1 = new Contacto("611199175","Mario");
		
		listado.put(c1, c1.getTelefono());
		
		CrudAgenda ca1 = new CrudAgenda(listado);
		
		ca1.mostrar();
		
		System.out.println(listado.keySet()); 
		System.out.println(listado.values());
	}

}
