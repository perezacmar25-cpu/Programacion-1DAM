package ejercicio04;

import java.util.HashSet;
import java.util.Set;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Set <Agenda> contactos = new HashSet <>();
		
		Agenda a1 = new Agenda("611199175", "Mario");

		contactos.add(a1);
		
		
		CrudAgenda ca = new CrudAgenda(contactos);
		CrudAgenda ca2 = new CrudAgenda(contactos);
		
		ca.mostrar();
		
		
	}

}
