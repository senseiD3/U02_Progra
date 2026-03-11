package a12;

import java.util.Scanner;

public class U02_A12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Escriba un número: ");
        int valorAbsoluto = Math.abs(sc.nextInt());
        System.out.print(valorAbsoluto);
    }
}
