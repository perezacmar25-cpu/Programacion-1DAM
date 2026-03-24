
package ejercicio03;

public class Alumno implements Comparable {

	private String nombre;
	
	private String apellido;
	
	private int id;
	
	private double notaMedia;

	public Alumno(String nombre, String apellido, int id, double notaMedia) {
		super();
		this.nombre = nombre;
		this.apellido = apellido;
		this.id = id;
		this.notaMedia = notaMedia;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public double getNotaMedia() {
		return notaMedia;
	}

	public void setNotaMedia(double notaMedia) {
		this.notaMedia = notaMedia;
	}

	@Override
	public String toString() {
		return "Alumno [nombre=" + nombre + ", apellido=" + apellido + ", id=" + id + ", notaMedia=" + notaMedia + "]";
	}

	
	
	public int compareTo(Alumno a) {
		return this.nombre.compareTo(a.getNombre());
	}

	@Override
	public int compareTo(Object o) {
		// TODO Auto-generated method stub
		return 0;
	}

	
	
	
	
	
	
}
