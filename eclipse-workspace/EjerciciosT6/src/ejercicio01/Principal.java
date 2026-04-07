package ejercicio01;

import utilidades.Leer;

public class Principal {

    public static void main(String[] args) {

        int op, op2, res, num1, num2;

        do {
            System.out.println("\n╔══════════════════════════════╗");
            System.out.println("║       CALCULADORA ENTERA     ║");
            System.out.println("╠══════════════════════════════╣");
            System.out.println("║  Pulsa 1 si quieres SUMAR    ║");
            System.out.println("║  Pulsa 2 si quieres RESTAR   ║");
            System.out.println("║  Pulsa 3 si quieres MULT.    ║");
            System.out.println("║  Pulsa 4 si quieres DIVIDIR  ║");
            System.out.println("║  Pulsa 5 si quieres RAÍZ     ║");
            System.out.println("╚══════════════════════════════╝");

            try {
            	op = Leer.datoInt();

                switch (op) {

                    case 1:
	                        System.out.println("Diga un número");
	                        num1 = Leer.datoInt();
	                        System.out.println("Di otro número");
	                        num2 = Leer.datoInt();
	                        res = num1 + num2;
	                        System.out.println("El resultado es : " + res);
	                        break;

                    case 2:
	                        System.out.println("Diga un número");
	                        num1 = Leer.datoInt();
	                        System.out.println("Di otro número");
	                        num2 = Leer.datoInt();
	                        res = num1 - num2;
	                        System.out.println("El resultado es : " + res);
	                        break;

                    case 3:
	                        System.out.println("Diga un número");
	                        num1 = Leer.datoInt();
	                        System.out.println("Di otro número");
	                        num2 = Leer.datoInt();
	                        res = num1 * num2;
	                        System.out.println("El resultado es : " + res);
	                        break;

                    case 4:
	                        System.out.println("Diga un número");
	                        num1 = Leer.datoInt();
	                        System.out.println("Di otro número");
	                        num2 = Leer.datoInt();
	                        res = num1 / num2;
	                        System.out.println("El resultado es : " + res);
	                        break;

                    case 5:
	                        System.out.println("Di un número");
	                        num1 = Leer.datoInt();
	                        res = (int) Math.sqrt(num1);
	                        System.out.println("El resultado es : " + res);
	                        break;
                }

            } catch (NumberFormatException e) {
                System.out.println("Número inválido");
            } catch (ArithmeticException e) {
                System.out.println("Error aritmético");
            } catch (Exception e) {
                System.out.println("ERROR: entrada no válida");
            }

            System.out.println("Pulsa 0 si quiere acabar");
            System.out.println("Pulsa 1 si quiere seguir");
            op2 = Leer.datoInt();

        } while (op2 != 0);
        
        	System.out.println("Gracias por usar el programa");
    }
}