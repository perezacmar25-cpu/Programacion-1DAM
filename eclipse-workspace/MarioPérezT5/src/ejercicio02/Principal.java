package ejercicio02;

import java.util.ArrayList;
import java.util.List;
public class Principal {

	public static void main(String[] args) {


		
		List<Socio>listado = new ArrayList <Socio>();
		
		
		Socio s1=new Socio(1,"Mario",true,2,100);
		
		Socio s2=new Socio(2,"Raúl",false,1,200);
		
		Club b = new Club(listado,10);
	
		
		b.agregar(s1);
		b.agregar(s2);
		b.borrar(s2);
		System.out.println(b.findById(1)); 
		
		
		
		
		

	}

}
