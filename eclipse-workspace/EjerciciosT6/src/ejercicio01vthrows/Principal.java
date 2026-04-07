package ejercicio01vthrows;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Operaciones o = new Operaciones();
			
			try {
				o.dividir(2, 0);
			}catch(ArithmeticException e) {
				System.out.println(e.getMessage());
			}catch(NumberFormatException e) {
				System.out.println("Error");
			}
			catch(RuntimeException e) {
				System.out.println(e.getMessage());
			}
		
	}

}
