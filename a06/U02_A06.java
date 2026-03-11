package a06;

import java.util.Scanner;

public class U02_A06 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Introduce la primera nota");
        int primera = sc.nextInt();
        
        System.out.println("Introduce la segunda nota");
        int segunda = sc.nextInt();
        
        double media = (primera+segunda)/2.0;
        System.out.print("Su media es de: "+ media);
        
    }
}
