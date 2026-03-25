 package ejercicio04;

public class Agenda {

	private String contacto;
	private String nombre;
	public Agenda(String contacto, String nombre) {
		super();
		this.contacto = contacto;
		this.nombre = nombre;
	}
	public String getContacto() {
		return contacto;
	}
	public void setContacto(String contacto) {
		this.contacto = contacto;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	@Override
	public String toString() {
		return "Agenda [contacto=" + contacto + ", nombre=" + nombre + "]";
	}
	
	
	
	
	
	
	
}
