package a11;

import java.util.Scanner;

public class U02_A11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        final double manzanasPrecio = 2.35;
        final double perasPrecio = 1.95;
        
        System.out.println("¿Cuánto has vendido de manzanas en el primer trimestre?");
        double manzanasPrimer = sc.nextDouble();
        System.out.println("¿Y el segundo?");
        double manzanasSegundo = sc.nextDouble();
        double manzanasBeneficio = (manzanasPrimer + manzanasSegundo);
        //manzanasBeneficio *= manzanasPrecio;
        
        System.out.println("¿Cuánto has vendido de peras en el primer trimestre?");
        double perasPrimer = sc.nextDouble();
        System.out.println("¿Y el segundo?");
        double perasSegundo = sc.nextDouble();
        double perasBeneficio = (perasPrimer + perasSegundo);
        //perasBeneficio *= perasPrecio;
        
        //System.out.println("Has ganado en total = "+ (manzanasBeneficio + perasBeneficio));
        System.out.println("Has ganado en total = "+ ((manzanasBeneficio *= manzanasPrecio) + (perasBeneficio *= perasPrecio)));
    }
}
