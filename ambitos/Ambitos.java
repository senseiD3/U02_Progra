package ambitos;

public class Ambitos {
    
    public static void main(String[] args) 
    {
        { 
            {
                int a = 2;
                System.out.println("a = " + a);
            }
        
            int a = 1;
            int b = 1000;
            System.out.println("a = " + a);
        }
    
        int a = 1;
        System.out.println("a = " + ++a);
        {
            System.out.println("a = " + ++a);
            {
                System.out.println("a = " + ++a);
            }
        }
    
    }
    
}