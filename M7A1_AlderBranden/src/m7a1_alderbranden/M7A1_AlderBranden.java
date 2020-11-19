/*
 * Branden Alder
 * M7A1 
 * 10/18/2020
 * Program to take test scores, give letter grade and average.
 */
package m7a1_alderbranden;

import java.util.Scanner;

public class M7A1_AlderBranden {

    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        
        final int SIZE = 5;
        double[] scores = new double[SIZE];
        for(int i = 0; i < SIZE; i++){
            System.out.println("Enter the score for test #" + (i + 1) + ": ");
            scores[i] = keyboard.nextDouble();
            if(scores[i]  < 0 | scores[i] > 100){
                System.out.println("Invalid score. Please enter again.");
                i--;
                
            }
            
            
        }
        double average = calcAverage(scores[0],scores[1],scores[2],scores[3],scores[4]);
        
        System.out.println("\nScores\t\tGrade");
        
        for(int i = 0; i < SIZE; i++){
        System.out.println(scores[i] + "\t\t" + determineGrade(scores[i]));
        }
        
        System.out.println("\nAverage\t\tGrade");
        System.out.println(average + "\t\t" + determineGrade(average)+"\n");
        
        
    }
    
     public static double calcAverage(double num1, double num2, double num3, double num4, double num5)
    {
        double average = (num1 + num2 + num3 + num4 + num5)/5;
        return average;
    }
    
    public static String determineGrade(double num1)
    {
        if(num1 >= 90)
        {
           return "A";
        }
        else if(num1 >= 80)
        {
           return "B"; 
        }
        else if(num1 >= 70)
        {
           return "C";
        }
        else if (num1 >= 60) {
           return "D";
        }
        else{
           return "F";   
        }
    }
}
/* Pseudocode
Declare/set final SIZE = 5
Declare double array scores[SIZE]
For loop(i = 0; i < size; i++)
Display "Enter the score for test #" + (i + 1) + ": "
Input scores[i]
If(scores[i] < 0 or scores[i] > 100
Display "Invalid score. Please enter again."
Set i--


*/