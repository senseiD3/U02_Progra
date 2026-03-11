/*Un tio muy sexy estudia japonés e informática, queremos saber sus dos notas de japonés y las ultimas 2 de informática. Si la nota media de ambas
es superior a 8, estará happyflower. Sino tendrá que estudiar más y no estará happyflower. 
Pregunta sus notas y di si está happyflower o no y si tiene que estudiar más*/
package ejemplo3;

import java.util.Scanner;

public class Tercero {
    static public void main (String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Primera nota de japones: ");
        double primeraJapones = sc.nextDouble();
        System.out.println("Segunda nota de japones: ");
        double segundaJapones = sc.nextDouble();
        boolean mediaJapones = (primeraJapones + segundaJapones) / 2 > 7.9;
        
        System.out.println("Primera nota de informatica: ");
        double primeraInfor = sc.nextDouble();
        System.out.println("Segunda nota de informatica ");
        double segundaInfor = sc.nextDouble();
        boolean mediaInfor= (primeraInfor + segundaInfor) / 2 > 7.9;
        
        System.out.println("Ese estudiante muy sexy esta happyflower? " + (mediaInfor && mediaJapones == true));
        System.out.println("Tiene que estudiar mas? " + (mediaInfor || mediaJapones == false));
    }
}
