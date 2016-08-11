
package intro2javap;
import java.net.*;
import java.util.Scanner;
import java.io.*;
public class ReadFileFromURL {
    public static void main(String[]args){
        System.out.println("Enter a valid URL");
        String URLString = new Scanner(System.in).next();
        
        try {
            URL url = new URL(URLString);
            int count = 0;
            Scanner input = new Scanner(url.openStream());
            while (input.hasNext()) {
                String line = input.nextLine();
                count += line.length();
            }
            
            System.out.println("The file size is "+ count + "characters");
            
        }
         catch (MalformedURLException ex){
             System.out.println("Invalid URL");
         }
        
        catch (IOException ex){
            System.out.println("I/O Errors: no such file");
        }
    }
    
}
