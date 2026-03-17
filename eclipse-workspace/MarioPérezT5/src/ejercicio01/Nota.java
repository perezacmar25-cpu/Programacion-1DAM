package ejercicio01;

public class Nota {
	
	private String texto;
	
	private String fecha;
	
	private int id;

	public Nota(String texto, String fecha, int id) {
		super();
		this.texto = texto;
		this.fecha = fecha;
		this.id = id;
	}

	public String getTexto() {
		return texto;
	}

	public void setTexto(String texto) {
		this.texto = texto;
	}

	public String getFecha() {
		return fecha;
	}

	public void setFecha(String fecha) {
		this.fecha = fecha;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	@Override
	public String toString() {
		return "Nota [texto=" + texto + ", fecha=" + fecha + ", id=" + id + "]";
	}
	
	
	
	
	
	
	
	
	
	

}
