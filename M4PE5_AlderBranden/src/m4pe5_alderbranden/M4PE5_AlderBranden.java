/*
 * Program to calculate BMI
 * M4PE5
 * Branden Alder
 * 10/20/2020
 */
package m4pe5_alderbranden;
import java.util.Scanner;
public class M4PE5_AlderBranden {

    
    public static void main(String[] args) 
    {
        // code to run the method
        getBMI();
        displayPsuedocode();
        
    }
    public static void getBMI() 
    {
        // This is where your code goes to solve the bmi problem
        Scanner keyboard = new Scanner(System.in);
        double weight;
        double height;
        System.out.println("Enter your weight");
        weight = keyboard.nextDouble();
        System.out.println("Enter your height in inches");
        height = keyboard.nextDouble();
        double BMI = (weight*703)/(height * height);
        System.out.println("Your BMI is: " + BMI);
        
        System.out.println("BMI Solution\n\n");
    }
    public static void displayPsuedocode()
    {
         System.out.println("Module Main");
         System.out.println("getBMI()");
         System.out.println("displayPsuedocode()");
         System.out.println("End Module\n");
        
         System.out.println("Module getBMI");
         System.out.println("Declare weight");
         System.out.println("Display \"Enter your weight:\" " );
         System.out.println("Input weight");
         System.out.println("Declare height");
         System.out.println("Display \"Enter your height in inches: \" ");
         System.out.println("Input height");
         System.out.println("Declare BMI = (weight * 703)/(height * height)");
         System.out.println("Display \"Your BMI is: \", BMI " );
         System.out.println("End Module");
           
        
    }
    
}
