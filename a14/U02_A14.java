package a14;

import java.util.Scanner;
import java.util.Locale;    

public class U02_A14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in).useLocale(Locale.US);
        
        System.out.println("Escriba un  numero decimal con punto: ");
        double numero = sc.nextDouble();
        
        
        //int redondeo = (int) (numero + 0.5);
        int entero = numero > ((int)numero+0.49) ? (int)numero + 1 : (int)numero;
        System.out.println(entero);
    }
}
