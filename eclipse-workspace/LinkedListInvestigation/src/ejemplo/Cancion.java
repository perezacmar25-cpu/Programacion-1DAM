package ejemplo;

public class Cancion implements Comparable<Cancion> {
	
	private String nombre;
	private double duracion;
	private String autor;
	public Cancion(String nombre, double duracion, String autor) {
		super();
		this.nombre = nombre;
		this.duracion = duracion;
		this.autor = autor;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public double getDuracion() {
		return duracion;
	}
	public void setDuracion(double duracion) {
		this.duracion = duracion;
	}
	public String getAutor() {
		return autor;
	}
	public void setAutor(String autor) {
		this.autor = autor;
	}
	@Override
	public String toString() {
		return "Cancion [nombre=" + nombre + ", duracion=" + duracion + ", autor=" + autor + "]";
	}
	@Override
	public int compareTo(Cancion o) {
		
		return this.nombre.toLowerCase().compareTo(o.getNombre());
	}
	
	
	
	

}
