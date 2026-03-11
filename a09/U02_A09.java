package a09;

import java.util.Scanner;

public class U02_A09 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Diga un numero");
        
        int numero = sc.nextInt();
        int resto = numero%2;
        boolean par = resto == 0;
        System.out.print("¿Su numero es par? "+ par);
        
        
        //System.out.println("Es par: " + ((numero % 2) == 0));
    }
}
