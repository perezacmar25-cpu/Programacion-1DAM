package ejemplo;

public class Cancion {
	
	private int id;
	private double duracion;
	private String titulo;
	public Cancion(int id, double duracion, String titulo) {
		super();
		this.id = id;
		this.duracion = duracion;
		this.titulo = titulo;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public double getDuracion() {
		return duracion;
	}
	public void setDuracion(double duracion) {
		this.duracion = duracion;
	}
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	@Override
	public String toString() {
		return "Cancion [id=" + id + ", duracion=" + duracion + ", titulo=" + titulo + "]";
	}
	
	

}
