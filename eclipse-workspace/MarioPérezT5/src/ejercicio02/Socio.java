package ejercicio02;

public class Socio {

	private int id;

	private String nombre;

	private boolean activo;

	private int anyoAntiguedad;

	private double cuota;

	public Socio(int id, String nombre, boolean activo, int anyoAntiguedad, double cuota) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.activo = activo;
		this.anyoAntiguedad = anyoAntiguedad;
		this.cuota = cuota;
	}

	@Override
	public String toString() {
		return "Socio [id=" + id + ", nombre=" + nombre + ", activo=" + activo + ", anyoAntiguedad=" + anyoAntiguedad
				+ "]";
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public boolean isActivo() {
		return activo;
	}

	public void setActivo(boolean activo) {
		this.activo = activo;
	}

	public int getAnyoAntiguedad() {
		return anyoAntiguedad;
	}

	public void setAnyoAntiguedad(int anyoAntiguedad) {
		this.anyoAntiguedad = anyoAntiguedad;
	}

	public double getCuota() {
		return cuota;
	}

	public void setCuota(double cuota) {
		this.cuota = cuota;
	}

	public double calcularPrecio(double cant) {

		return cuota - cant * anyoAntiguedad;
		

	}
	


}
