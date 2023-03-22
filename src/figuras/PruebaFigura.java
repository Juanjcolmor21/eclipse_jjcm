package figuras;

import java.util.Scanner;
import java.awt.Color;

public class PruebaFigura {

private static final String area = "El área es ";

public static void main(String[] args) {
int opción;
Scanner teclado = new Scanner (System.in);
do { 
   opción = mostrarMenú();
   if (opción != 4){
      System.out.print ("Introduzca la coordenada x del centro: ");
      double x = teclado.nextDouble();
      System.out.print ("Introduzca la coordenada y del centro: ");
      double y = teclado.nextDouble();
   switch (opción)
	   {  case 1:
	primeraOpcion(teclado, x, y);
        	 break;
         case 2:
	rectangulo(teclado, x, y);
        	 break;
         case 3:
	cuadrado(teclado, x, y);
	         break;
        }
   }
}while (opción != 4); 
teclado.close();
}

private static void cuadrado(Scanner teclado, double x, double y) {
	System.out.print ("Introduzca el lado del cuadrado: ");
	 double lado = teclado.nextDouble();
	 Cuadrado c = new Cuadrado(x, y, Color.red, lado);
	 System.out.println ("El per�metro es " + c.perímetro());
	 System.out.println ("El �rea es " + c.área());
}

private static void rectangulo(Scanner teclado, double x, double y) {
	System.out.print ("Introduzca la base del rectángulo: ");
	 double base = teclado.nextDouble();
	 System.out.print ("Introduzca la altura del rectángulo: ");
	 double altura = teclado.nextDouble();
	 Rectangulo r = new Rectangulo(x, y, Color.red, base, altura);
	 System.out.println ("El per�metro es " + r.perímetro());
	 System.out.println ("El �rea es " + r.área());
}

private static void primeraOpcion(Scanner teclado, double x, double y) {
	System.out.print ("Introduzca el lado 1 del triángulo: ");
	 double lado1 = teclado.nextDouble();
	 System.out.print ("Introduzca el lado 2 del triángulo: ");
	 double lado2 = teclado.nextDouble();
	 System.out.print ("Introduzca el lado 3 del triángulo: ");
	 double lado3 = teclado.nextDouble();
	 Triángulo t = new Triángulo(x, y, Color.red, lado1, lado2, lado3);
String perímetro = "El perímetro es ";
System.out.println ("El perímetro es " + t.perímetro());
	 System.out.println (area + t.área());
}

public static int mostrarMenú(){
int opción;
System.out.println ("1) Tri�ngulo");
System.out.println ("2) Rect�ngulo");
System.out.println ("3) Cuadrado");
System.out.println ("4) Salir");
Scanner teclado = new Scanner (System.in);
do {
    System.out.print ("Introduzca una opci�n (1-4): ");
    opción = teclado.nextInt();
    if (opción < 1 || opción > 4)
	   System.out.println ("Debe introducir un n�mero entre 1 y 4");
   } while (opción < 1 || opción > 4);
return opción;
}
}
