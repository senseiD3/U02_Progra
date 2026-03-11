package a02;

import java.util.Scanner;

public class U02_A02 {
    
    public static void main(String[] args) {
        
        System.out.println("introduzca su usuario:");
        
        Scanner sc = new Scanner(System.in);
        String usuario = sc.nextLine();
        
        System.out.println("usuario: " + usuario);
        System.out.println("introduzca su contraseña:");
        
        int contrasena = sc.nextInt();
        Integer valida = 1234;
        
        System.out.println("Ha introducido: " + contrasena);

        if(valida.equals(contrasena)) {
            System.out.println("Contraseña correcta");
        }
        
        if(!valida.equals(contrasena)) {
            System.out.println("Contraseña incorrecta");
        }
    }
}
