
package intro2javap;

import java.util.InputMismatchException;
import java.util.Scanner;

public class DivisionExpWithTryCatch {
    public static int exceptionHandler(int n1, int n3){
       if (n3 == 0){
           throw new ArithmeticException("Division by zero");
        
       } 
       return n1 / n3;
       
    }
    
    public static void main(String[]args){
        Scanner input = new Scanner(System.in);
        
        //Prompt
        System.out.println("Enter 2 numbers");
        int n1 = input.nextInt();
        int n3 = input.nextInt();
        
        try {
            int result = exceptionHandler(n1, n3);
            System.out.println("("+n1 + " / "+n3+
                    " = "+result);
        }
        catch (ArithmeticException ex){
            System.out.println(ex);
        }
        
        //System.out.println("Continues");
            
    }
    
}
 
