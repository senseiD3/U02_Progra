/*Si una persona es mayor de edad puede beber alcohol. Si ademas tiene 1000€ o más en el banco podrá pagarse el carnet de conducir.
Si es menor no puede ninguna.*/
package ejemplo2;

import java.util.Scanner;

public class Segundo {
    static public void main (String[]args){
        Scanner sc = new Scanner (System.in);
        System.out.println("Edad?");
        int edad = sc.nextInt();
        boolean edadValida = edad > 17;
        
        System.out.println("Cuanto dinero tienes?");
        double dinero = sc.nextDouble();
        boolean dineroValido = dinero > 999.99;
        System.out.println("Puedes beber alcohol?: " + edadValida + " Conducir?: " + (edadValida && dineroValido));
        System.out.println("Puedes beber? " + edadValida);
        System.out.println("Conducir? " + (edadValida && dineroValido));
    }
}
