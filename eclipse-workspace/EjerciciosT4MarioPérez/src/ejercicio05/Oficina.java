package ejercicio05;

import java.util.Arrays;

public class Oficina {
	
	private Empleado [] lista;

	public Oficina(Empleado[] lista) {
		super();
		this.lista = lista;
	}

	public Empleado[] getLista() {
		return lista;
	}

	public void setLista(Empleado[] lista) {
		this.lista = lista;
	}

	@Override
	public String toString() {
		return "Oficina [lista=" + Arrays.toString(lista) + "]";
	}
	
	
	public double calcularSueldo(Empleado e) {
		
		return e.calcularSueldo();
		
		
	}
	
	public double calcularGastado() {
		
		
		double total=0;
		for(int i = 0; i<lista.length; i++) {
			
			total=total+lista[i].calcularSueldo();
			
			
		}
		
		return total;
	}
	
	
	
	public void imprimirFelicitacion() {
		
		
		System.out.println("Me alegro tela");
	}
	
	public Empleado findById(int id) {
		
		for (int i = 0; i < lista.length; i++) {
			
			if(id==lista[i].getId()) {
				
				return lista[i];
				
			}
				
			
		}
		return null;
		
		
		
	}
	
	public Empleado cambiarNombre(int id,String nuevoNombre) {
		
		for(int i = 0; i<lista.length; i++) {
			
			
			if(id==lista[i].getId()) {
				lista[i].setNombre(nuevoNombre);
				return lista[i];
				
			}
			
			
			
		}
		return null;
		
		
		
	}
	
	
	
		

}
