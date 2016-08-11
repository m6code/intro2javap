
package intro2javap;
import java.util.Scanner;
public class TenMatrix {
    
    public static void main(String[]args){
        //Declearing and entering an array
        int[][] matrix = new int[10][10];
        Scanner input = new Scanner(System.in);
        System.out.println("Enter "+matrix.length +" rows and "+
                matrix[0].length + " columns: ");
        
        for (int row = 0; row < matrix.length; row++){
            for (int column = 0; column < matrix[row].length; column++){
                matrix[row][column] = input.nextInt();
            }
        }
        //Printing out an array
        for (int row = 0; row < matrix.length; row++) {
            for (int column = 0; column < matrix[row].length; column++) {
            System.out.print(matrix[row][column] + " ");
            }
            System.out.println();
        }
    }
    
}
