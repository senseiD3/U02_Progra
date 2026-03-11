package a07;

import java.util.Scanner;

public class U02_A07 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Introduzca el radio del circulo:");
        double radio = sc.nextDouble();
        double longitud = (2*Math.PI) * radio;
        System.out.println("La longitud del circulo es: "+ longitud);
        
        double area = Math.PI * (radio * radio);
        System.out.print("El area del circulo es: "+ area);
        
    }
}