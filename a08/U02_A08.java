package a08;

import java.util.Scanner;

public class U02_A08 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("¿Cual es su edad?");
        
        int edad = sc.nextInt();
        boolean mayor = edad >=18;
        System.out.print("¿Mayor de edad?: "+ mayor);
        
        //System.out.print("¿Mayor de edad?: " + (edad>=18) );    //Esto es mmas sencillito y me quito una linea
        
        
        
        /* if (edad >= 18) {
            System.out.print("Eres mayor de edad.");
        }
        
        if (edad < 18) {
            System.out.print("Eres menor de edad");
        }
        */
    }
}
