package ejemploexcepcion;
import utilidades.Leer;
public class Principal {

	public static void main(String[] args) {

		int num, indice,op=0;
		int den;
		double res;
		int[] lista;
		
		lista = new int[5];
		
		do {
			try {
				
				System.out.println("Diga num");
				num=Leer.datoInt();
				System.out.println("Diga den");
				den=Leer.datoInt();
				res=num/den;
				System.out.println(res);
				//Ahora el error de arrays
				System.out.println("Qué pos quieres ver");
				indice = Leer.datoInt();
				System.out.println(lista[indice - 1]);
			}
			catch(NumberFormatException n) {
				System.out.println("Error de lectura");
			}
			catch(ArithmeticException a) {
				System.out.println("No se puede dividir por cero");		
			}
			catch(ArrayIndexOutOfBoundsException a) {
				System.out.println("No existe esa posición");
			}
			catch(Exception e) {	
				System.out.println("Error");
			}
			}while(op==0);
			
		
		

	}

}
