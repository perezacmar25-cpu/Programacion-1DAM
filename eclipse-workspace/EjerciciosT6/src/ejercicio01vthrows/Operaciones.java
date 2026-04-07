package ejercicio01vthrows;

public class Operaciones {

	
	public int dividir (int num1, int num2) throws ArithmeticException{
		
		if(num2 == 0) {
			
			throw new ArithmeticException(
					"No se puede dividir por cero");
		}
		
		return num1 / num2;
		
	}
}
