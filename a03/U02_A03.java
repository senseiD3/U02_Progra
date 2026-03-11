package a03;

import java.util.Scanner;

public class U02_A03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("¿Que edad tienes?");
        int edad = sc.nextInt();
                
        System.out.print("Tendras "+ ++edad +" el año que viene");
    }
}
