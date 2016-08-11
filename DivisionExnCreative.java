
package intro2javap;

import java.util.Scanner;

public class DivisionExnCreative {
    public static int exceptionHandler(int n1, int n2, int n3){
       if (n3 == 0){
           System.out.println("Error Divisor is zero");
           System.exit(n3);
       } 
       return (n1 + n2) / n3;
    }
    public static void main(String[]args){
        Scanner input = new Scanner(System.in);
        
        //Prompt
        System.out.println("Enter 3 numbers");
        int n1 = input.nextInt();
        int n2 = input.nextInt();
        int n3 = input.nextInt();
        
        int result = exceptionHandler(n1, n2, n3);
        System.out.println("("+n1 +" + " +n2+") "+" / "+n3+
                " = "+result);
    }
    
}
