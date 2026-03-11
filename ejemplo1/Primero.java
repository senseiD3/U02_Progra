/*Preguntar por un numero con decimales (con punto) y te diga si su número entero es par o impar*/
package ejemplo1;

import java.util.Scanner;
import java.util.Locale;

public class Primero {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in).useLocale(Locale.US);
        System.out.println("Escribe un numero decimal con punto: ");
        double decimal = sc.nextDouble();
        int entero = (int) decimal;
        boolean par = entero%2 == 0;
        System.out.println("Su numero es par? " + par);
    } 
}
