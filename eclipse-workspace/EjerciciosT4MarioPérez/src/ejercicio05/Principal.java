package ejercicio05;

import utilidades.Leer;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Empleado[] lista;

		int tam = 5;

		int op;

		int ventas;
		
		int id;

		String nuevoNombre;
		
		int idNombre;
		
		Empleado e1 = new Vendedor("Mario", 1, 2000.0, 20, 10);

		Empleado e2 = new Gerente("Er cali", 2, 2500.0, 15);

		lista = new Empleado[tam];

		lista[0] = e1;

		lista[1] = e2;

		Oficina o1 = new Oficina(lista);

		System.out.println("Pulsa 1 si eres vendedor");
		System.out.println("Pulsa 0 si no lo eres");
		op = Leer.datoInt();

		switch (op) {

		case 1:
				System.out.println("¿Cuál es el tope de ventas?");
				ventas = Leer.datoInt();
				Vendedor v1 = (Vendedor) e1;
				v1.felicitarVendedor(ventas);
				break;

		case 0:
				System.out.println("Vale");
				break;

		default:
				System.out.println("Opción no válida");
				break;

		}
		
		System.out.println("Di id");
		id=Leer.datoInt();
		System.out.println("Empleado: "+o1.findById(id));

		
		System.out.println("Di nuevo nombre");
		nuevoNombre= Leer.dato();
		System.out.println("Di id");
		idNombre=Leer.datoInt();
		o1.cambiarNombre(idNombre, nuevoNombre);
		

	}

}
