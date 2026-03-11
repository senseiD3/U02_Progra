package a10;

import java.util.Scanner;

public class U02_A10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("¿Llueve?");
        boolean llueve = sc.nextBoolean();
        
        System.out.println("¿Has hecho las teareas?");
        boolean tareas = sc.nextBoolean();
        
        System.out.println("¿Tienes que ir a la biblioteca?");
        boolean biblioteca = sc.nextBoolean();
        
        System.out.println("¿Puedes salir a la calle?: "+ ((!llueve  && tareas) || biblioteca));
    }
}
