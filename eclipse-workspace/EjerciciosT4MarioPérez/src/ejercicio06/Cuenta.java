package ejercicio06;

public abstract class Cuenta {
	
	private double saldo;
	private int numCuenta;
	public Cuenta(double saldo, int numCuenta) {
		super();
		this.saldo = saldo;
		this.numCuenta = numCuenta;
	}
	public double getSaldo() {
		return saldo;
	}
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	public int getNumCuenta() {
		return numCuenta;
	}
	public void setNumCuenta(int numCuenta) {
		this.numCuenta = numCuenta;
	}
	@Override
	public String toString() {
		return "Cuenta [saldo=" + saldo + ", numCuenta=" + numCuenta + "]";
	}
	
	public abstract double ingresarDinero(double ingreso,double bonificacion,double comision);
	
	
	
	
	

}
