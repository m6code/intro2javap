/**This  code helps to loop input entering until it is correct
 * *Use it for question a user 
 *
 */
package intro2javap;
import java.util.*;
public class InptMisMatch {
    public static void main(String[]args){
        Scanner input = new Scanner(System.in);
        boolean continueInput = true;
        
        do {
            try{
                System.out.println("Enter an integer");
                int n = input.nextInt();
                
                System.out.println("You entered "+n);
                
                continueInput = false;
            }
            catch (InputMismatchException ex){
                System.out.println("Try again: please enter a number this time");
                input.nextLine();//Discard previous input
            }
        }
        while (continueInput);
    }
   
}
