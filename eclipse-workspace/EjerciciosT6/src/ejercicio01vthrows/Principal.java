package ejercicio01vthrows;

import utilidades.Leer;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int op;
		Operaciones o = new Operaciones();
		op = Leer.datoInt();
		try {
			switch (op) {
			case 1:
					System.out.println("Diga un número");
	                num1 = Leer.datoInt();
	                System.out.println("Di otro número");
	                num2 = Leer.datoInt();
					o.sumar(2, 5);
					break;
			case 2:
					o.dividir(2, 0);
					break;
				
			case 3:
					o.restar(op, op);
					break;
				
			case 4:
					o.multiplicar(op, op);
					break;
			}
		} catch (ArithmeticException e) {
			System.out.println(e.getMessage());
		} catch (NumberFormatException e) {
			System.out.println("Error");
		} catch (RuntimeException e) {
			System.out.println(e.getMessage());
		}

	}

}
