
package intro2javap;
import java.util.Scanner;
public class DivisionException {
    public static void main(String[]args){
        Scanner input = new Scanner(System.in);
        
        //Prompt
        System.out.println("Enter two intergers");
        int n1 = input.nextInt();
        int n2 = input.nextInt();
        
        //if (n2 != 0){
            System.out.println(n1 + " / "+ n2 +" = " + n1/n2);
        //}
        //else{
           // System.out.println("Divisor by zero error");
        //}   
    
    }
    
}
