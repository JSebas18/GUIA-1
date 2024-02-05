
package guia1;

import java.util.Scanner;


public class Consola {

    public static void main(String[] args) {
     Scanner ingreso = new Scanner(System.in);
    Calculadora cal1= new Calculadora();

     float a,b;
     
    int opcion;
    do {
      System.out.println("Bienvenido a la calculadora");
      System.out.println("Seleccione una opcion:");
      System.out.println("1. Suma");
      System.out.println("2. Resta");
      System.out.println("3. Multiplicacion");
      System.out.println("4. Division");
      System.out.println("5.Seno");
      System.out.println("6.Coseno");
      System.out.println("7.Tangente");
      System.out.println("8. Raiz enesima");
      System.out.println("9. Potencia enesima");
      System.out.println("10. Calcular el porcentaje de IVA");
      System.out.println("11. Salir");
     opcion = ingreso.nextInt();
      if (opcion < 1 || opcion > 11) {
        System.out.println("Opcion invalida. Intente de nuevo.");
      } else { switch (opcion) {
          case 1: 
            System.out.print("Ingrese el primer numero: ");
             a= ingreso.nextFloat();
            cal1.num1=a;
            System.out.print("Ingrese el segundo numero: ");
             b= ingreso.nextFloat();
            cal1.num2=b;
            cal1.suma();
            System.out.println("La suma es: " + cal1.result);
            break;
            case 2: 
            System.out.print("Ingrese el primer numero: ");
             a= ingreso.nextFloat();
            cal1.num1=a;
            System.out.print("Ingrese el segundo numero: ");
             b= ingreso.nextFloat();
            cal1.num2=b;
            cal1.resta();
            System.out.println("La resta es: " + cal1.result);
            break;
          case 3: 
            System.out.print("Ingrese el primer numero: ");
             a= ingreso.nextFloat();
            cal1.num1=a;
            System.out.print("Ingrese el segundo numero: ");
             b= ingreso.nextFloat();
            cal1.num2=b;
            cal1.multi();
            System.out.println("La multiplicacion es: " + cal1.result);
            break;
            case 4: 
            System.out.print("Ingrese el primer numero: ");
             a= ingreso.nextFloat();
            cal1.num1=a;
            System.out.print("Ingrese el segundo numero: ");
             b= ingreso.nextFloat();
            cal1.num2=b;
            cal1.division();
            System.out.println("La division es: " + cal1.result);
              if(cal1.num2==0){
               System.out.println("No se pueden realizar divisiones por cero");
            }
            break;
            case 5: 
            System.out.print("Ingrese el primer numero: ");
             a= ingreso.nextFloat();
            cal1.num1=a;
            cal1.sen(a);
            System.out.println("El seno es: " + cal1.result);
            break;
            case 6: 
            System.out.print("Ingrese el primer numero: ");
             a= ingreso.nextFloat();
            cal1.num1=a;
            cal1.cos(a);
            System.out.println("El Coseno es: " + cal1.result);
            break;
            case 7: 
            System.out.print("Ingrese el primer numero: ");
             a= ingreso.nextFloat();
            cal1.num1=a;
            cal1.tan(a);
            System.out.println("la Tangente es: " + cal1.result);
            break;
            case 8: 
            System.out.print("Ingrese la base de la raiz: ");
             a= ingreso.nextFloat();
            cal1.num1=a;
            System.out.print("Ingrese el radical: ");
             b= ingreso.nextFloat();
            cal1.num2=b;
            cal1.raiz();
            if(cal1.num1<0){
                System.out.println("Es un numero imaginario");
            }
            System.out.println("La raiz es: " + cal1.result);
            break;
            case 9: 
            System.out.print("Ingrese la base: ");
             a= ingreso.nextFloat();
            cal1.num1=a;
            System.out.print("Ingrese el exponente: ");
             b= ingreso.nextFloat();
            cal1.num2=b;
            cal1.pow();
            System.out.println("La raiz es: " + cal1.result);
            break;
            case 10: 
            System.out.print("Ingrese el precio: ");
             a= ingreso.nextFloat();
            cal1.num1=a;
            System.out.print("Ingrese el porcentaje del iva: ");
             b= ingreso.nextFloat();
            cal1.num2=b;
            cal1.iva();
            System.out.println("El iva a pagar es: " + cal1.result);
            break;
        }
      }
    } while (opcion != 11);
  }
}
