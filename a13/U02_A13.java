package a13;

import java.util.Scanner;

public class U02_A13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Nota primer trimestre: ");
        int primer = sc.nextInt();
        System.out.println("Nota primer trimestre: ");
        int segundo = sc.nextInt();
        System.out.println("Nota primer trimestre: ");
        int tercer = sc.nextInt();
        
        double expediente = (primer+segundo+tercer)/3.0;
        int boletin = (int)expediente;
        System.out.println("Sus nota en el expediente es: "+ expediente);
        System.out.println("su nota en el boletin es: "+ boletin);
    }
}
