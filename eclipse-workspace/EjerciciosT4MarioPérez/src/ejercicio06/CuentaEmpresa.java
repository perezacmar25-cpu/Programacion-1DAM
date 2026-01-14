package ejercicio06;

public class CuentaEmpresa extends Cuenta {
	
	
	private double cobroInteres;

	

	public CuentaEmpresa(double saldo, int numCuenta, double cobroInteres) {
		super(saldo, numCuenta);
		this.cobroInteres = cobroInteres;
	}

	public double getCobroInteres() {
		return cobroInteres;
	}

	public void setCobroInteres(double cobroInteres) {
		this.cobroInteres = cobroInteres;
	}

	@Override
	public String toString() {
		return "CuentaEmpresa [cobroInteres=" + cobroInteres + "]";
	}
	
	public double ingresarDinero(double ingreso, double bonificacion,double comision) {
		
		double saldoRestante;
		saldoRestante= super.getSaldo()+ingreso+bonificacion;
		super.setSaldo(saldoRestante);
		return saldoRestante;
		
		
	}
	

}
