package ejercicio04Map;

public class Contacto {
	
	
	private String telefono;
	
	private String nombre;

	public Contacto(String telefono, String nombre) {
		super();
		this.telefono = telefono;
		this.nombre = nombre;
	}

	public String getTelefono() {
		return telefono;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	@Override
	public String toString() {
		return "Contacto [telefono=" + telefono + ", nombre=" + nombre + "]";
	}
	
	

}
