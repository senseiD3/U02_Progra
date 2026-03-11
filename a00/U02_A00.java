package a00;

public class U02_A00 {
    public static void main(String[] args) {
        {
            Integer a = 1, b = 3;
            int c = a + b;
            
            System.out.println("La suma de a y b es: "+c);
            System.out.println("Le sumo 1 a c: " + ++c);
            
            int d = c - b;
            
            if(!a.equals(d)) {      //Si a no es igual a d
                System.out.print("d y a no son iguales, asi que la variable c cambio");
                
            }
            
            //byte t = 300;
            //System.out.println(t +127);
            //NO COMPILA
        } 
    }
}
