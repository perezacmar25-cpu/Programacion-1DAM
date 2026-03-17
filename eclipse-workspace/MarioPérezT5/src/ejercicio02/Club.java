package ejercicio02;

import java.util.List;

public class Club {
	
	
	private List <Socio> listado;
	private int aforo;


	public Club(List<Socio> listado, int aforo) {
		super();
		this.listado = listado;
		this.aforo = aforo;
	}

	public List<Socio> getListado() {
		return listado;
	}

	public void setListado(List<Socio> listado) {
		this.listado = listado;
	}

	public int getAforo() {
		return aforo;
	}

	public void setAforo(int aforo) {
		this.aforo = aforo;
	}

	@Override
	public String toString() {
		return "Club [listado=" + listado + ", aforo=" + aforo + "]";
	}
	
	
	
	//No se pasan atributos
	public void agregar(Socio s) {
		
		listado.add(s);
		
		
		
	}
	
	public void imprimir() {
		for(Socio socio : listado) {
			
			System.out.println(socio);
			
		}
	}
	
	
	/*También se puede devolver un booleano porque el método add devuelve un booleano*/
	
	public Socio findById(int id) {
		
		for(int i = 0;i<listado.size();i++) {
			if(id == listado.get(i).getId() && listado.get(i)!=null) {
				
				return listado.get(i);
				
				
			}
			
			
			
		}
		
		
	
		
		return null;
		
	}
	
	public void borrar(Socio s) {
		listado.remove(s);
	
}

	public void modificar(Socio s) {
	
	
	//con el set
	
	
}
	
	public double calcularMedia(double cant) {
		double media = 0;
		
		for(Socio socio : listado ) {
			
			media = socio.calcularPrecio(cant);
			
			
			
		}
		
		return media/listado.size();
		
		
		
	}
	
	
	
	public double calcularDescuentoAntiguedad(int tope, int id, double descuento,int cant) {
		
		double descontado = 0 ;
		double total = 0;
		
	for(Socio socio : listado) {
		
		if(findById(id)!=null && socio.getAnyoAntiguedad()>tope) {
			
			descontado = socio.calcularPrecio(cant) *descuento/100;
			
			total=socio.calcularPrecio(cant)-descontado;
			
			
		}
		
		
	}
		
		return total;
		
		
		
		
	}
	
	
	
	
	
	
	

}
