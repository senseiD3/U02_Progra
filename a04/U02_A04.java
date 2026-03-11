package a04;

import java.util.Scanner;

public class U02_A04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("¿Que año es?");
        int actual = sc.nextInt();
        
        System.out.println("¿En que año naciste?");
        int nacimiento = sc.nextInt();
        
        int edad = actual - nacimiento;
        System.out.print("Tu edad es: "+ edad);
        
        
    }
}
