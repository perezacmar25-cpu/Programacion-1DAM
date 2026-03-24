package ejercicio03;

import java.util.HashSet;
import java.util.Set;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
		
		
		Set <Alumno> lista = new HashSet<>();
		
		
		Alumno a1 = new Alumno ("Mario","Pérez",1,9.5);
		
		Alumno a2 = new Alumno ("Ángel","Naranjo",2,10.0);

		
		GestionAlumnos ga = new GestionAlumnos(lista);
		
		ga.agregar(a1);
		ga.agregar(a2);
		
		System.out.println(lista);
		
		ga.borrar(1);
		
		System.out.println(lista);
		
		
		
		System.out.println(ga.notaMedia()); 
		
		System.out.println(ga.numSuspensos(5)); 
		
		
		

	}

}