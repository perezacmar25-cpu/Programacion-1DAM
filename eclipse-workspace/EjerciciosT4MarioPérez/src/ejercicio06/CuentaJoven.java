package ejercicio06;

public class CuentaJoven extends Cuenta{
	
	private double regalo;

	
	public CuentaJoven(double saldo, int numCuenta, double regalo) {
		super(saldo, numCuenta);
		this.regalo = regalo;
	}

	public double getRegalo() {
		return regalo;
	}

	public void setRegalo(double regalo) {
		this.regalo = regalo;
	}

	@Override
	public String toString() {
		return "CuentaJoven [regalo=" + regalo + "]";
	}
	
	public double ingresarDinero(double ingreso,double bonificacion, double comision) {
		
		double saldoRestante;
		
		saldoRestante= super.getSaldo()-comision;
		
		super.setSaldo(saldoRestante);
		
		return saldoRestante;
		
		
	}
	
	

}
