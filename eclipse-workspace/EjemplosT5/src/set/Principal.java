package set;

import java.util.HashSet;
import java.util.Set;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
	Set <String> conjunto1 = new HashSet<>();
	
	conjunto1.add("hola");

	conjunto1.add("hola");
	
	System.out.println(conjunto1);
	
	
	Set <Alumno> listado = new HashSet<>();
	
	listado.add(new Alumno("101001010","hschdshsdsdh",10.0));
	
	System.out.println(listado);

	
	
	
	
	
	}

}
