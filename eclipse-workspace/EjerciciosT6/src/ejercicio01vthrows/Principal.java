package ejercicio01vthrows;

import utilidades.Leer;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int op, num1, num2, op2;
		Operaciones o = new Operaciones();
		
		do {
		System.out.println("Pulsa 1 si quiere sumar");
		System.out.println("Pulsa 2 si quiere dividir");
		System.out.println("Pulsa 3 si quiere restar");
		System.out.println("Pulsa 4 si quiere multiplicar");
		op = Leer.datoInt();
		try {
			switch (op) {
			case 1:
					System.out.println("Diga un número");
	                num1 = Leer.datoInt();
	                System.out.println("Di otro número");
	                num2 = Leer.datoInt();
					System.out.println(o.sumar(num1, num2)); 
					break;
			case 2:
					System.out.println("Diga un número");
	                num1 = Leer.datoInt();
	                System.out.println("Di otro número");
	                num2 = Leer.datoInt();
					System.out.println(o.dividir(num1, num2)); 
					break;
				
			case 3:
					System.out.println("Diga un número");
	                num1 = Leer.datoInt();
	                System.out.println("Di otro número");
	                num2 = Leer.datoInt();
					System.out.println(o.restar(num1, num2));
					break;
				
			case 4:
					System.out.println("Diga un número");
	                num1 = Leer.datoInt();
	                System.out.println("Di otro número");
	                num2 = Leer.datoInt();
					System.out.println(o.multiplicar(num1, num2));
					break;
			}
			
			
		} catch (ArithmeticException e) {
			System.out.println(e.getMessage());
		} catch (NumberFormatException e) {
			System.out.println("Error");
		} catch (RuntimeException e) {
			System.out.println(e.getMessage());
		}
		System.out.println("Pulsa cualquier número si quiere continuar");
		System.out.println("Pulsa 0 si quiere acabar");
		op2=Leer.datoInt();

	}while(op2!=0);

}
}
