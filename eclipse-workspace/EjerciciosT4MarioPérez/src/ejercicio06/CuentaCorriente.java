package ejercicio06;

public class CuentaCorriente extends Cuenta{

	
	private double mantenimiento;
	private int puntos;
	
	public CuentaCorriente(double saldo, int numCuenta, double mantenimiento, int puntos) {
		super(saldo, numCuenta);
		this.mantenimiento = mantenimiento;
		this.puntos = puntos;
	}
	public double getMantenimiento() {
		return mantenimiento;
	}
	public void setMantenimiento(double mantenimiento) {
		this.mantenimiento = mantenimiento;
	}
	public int getPuntos() {
		return puntos;
	}
	public void setPuntos(int puntos) {
		this.puntos = puntos;
	}
	@Override
	public String toString() {
		return "CuentaCorriente [mantenimiento=" + mantenimiento + ", puntos=" + puntos + "]";
	}
	
	public double ingresarDinero(double ingreso,double bonificacion,double comision) {
		double saldoRestante;
		saldoRestante=ingreso+super.getSaldo();
		puntos++;
		super.setSaldo(saldoRestante);
		return saldoRestante;
		
		
		
	}
	
	
	
	
	
	
	
	
}
 	 		 	