/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package inpututilities;

import java.util.Scanner;

/**
 * HDIP Comp Sept 2024 cohort
 * An example of using methods that you have written yourself
 * 
 * To use these in another program, you need to:
 * 1) COPY the entire package 'inpututilities'
 * 2) Go to the project where you want to use the methods
 * 3) Select 'Source Packages' and paste. This will create a copy of the 'inpututilities' package in the project
 * 4) At the top of your code, you will need to import InputUtilities
 * 
 * @author kheal
 */
public class InputUtilities {

    
    
    /**
     * Ask user to enter some  text - if they enter non-text (like numbers)
     * then ask them again
     * @param prompt - the question or prompt to ask the user
     * @return a String containing whatever text the user entered
     */
    public String askUserForText(String prompt){
        
        Scanner myKB = new Scanner(System.in);
        String userInput ;
        
        do{
            System.out.println(prompt);
            System.out.println("You must enter text only.");
            
            userInput = myKB.nextLine();            
            
        }while (!userInput.matches("[a-zA-Z .!@?\"]+"));
        //userinput must be valid text
        
        return (userInput);
    }
    
    /**
     * Ask the user to enter any integer value (negatives are allowed)
     * if they do not enter an integer ask them again
     * @param prompt the question or prompt to ask the user
     * @return a valid int entered by the user
     */
    public int askUserForInt(String prompt){
        
        Scanner myKB = new Scanner(System.in);
        String userInput ;
        
        do{
            System.out.println(prompt);
            System.out.println("You must enter integers only.");
            
            userInput = myKB.nextLine();            
            
        }while (!userInput.matches("[0-9]+"));
       
        //userinput is a string but it is numeric - convert to int
        return (Integer.parseInt(userInput));
    }
    
    /**
     * Ask user for an integer value bigger than a given minimum
     * if they do not enter a valid integer ask them again
     * @param prompt the question or prompt to ask user
     * @param minValue the lowest value allowed
     * @return a valid int bigger than minValue
     */
    public int askUserForInt(String prompt, int minValue){
        
        Scanner myKB = new Scanner(System.in);
        int userInput= minValue -1;
        
        do{
            System.out.println(prompt);
            System.out.println("You must enter integers greater than " + minValue + " only.");
            try{
                userInput = myKB.nextInt();            
            
            }
            catch(Exception e){
                //this means user did not enter an int
                // so userInput is not changed
                System.out.println("That was not an integer value");
            }
            //keep going while userInput is less than min allowed
        }while ( (userInput < minValue));
       
        return (userInput);
        
    }
    
    /**
     * Ask user for an integer value in a given range
     * if they do not enter a valid integer ask them again
     * @param prompt the question or prompt to ask user
     * @param minValue the lowest value allowed
     * @param maxValue the highest value allowed
     * @return a valid int within the given range
     */
    public int askUserForInt(String prompt, int minValue, int maxValue){
        
        Scanner myKB = new Scanner(System.in);
        int userInput=0;
        
        return 0;
    }


/**
     * Ask user for their initials
     * If they enter numbers, or more than two letters ask them again
     * If they enter valid data, output their initials with the word “super” in between them
     * @param prompt the question or prompt to ask user
     * @param numAttempts is the number of attempts made by the user
     * @param maxAttempts is the máximum number of attempts that user has
     * @return a valid int within the given range
     */

 public static String askUserForInitials(String prompt) 
    {
        //Defining variables to store initials, max and min attempts, and Scanner 
        Scanner kb = new Scanner(System.in);
        String initials;
        int numAttempts = 0;
        int maxAttempts = 5;
        
        //Do While loop asking the user for their initials, 
        //Setting the maximum initials and storing them into the variable "initials", and casting it into Uppercase for use it into the results
        //Setting maximum attempts who will increment by 1 each time that the user enters an invalid input
         
        do
        {
            System.out.println("Please enter your initials separated by a period between each letter (e.g., A.B)."); 
            System.out.println("Máximum initials alowed: 2");
            System.out.println("Attempts remaining " + (maxAttempts - numAttempts));
            initials = kb.nextLine().toUpperCase();
            numAttempts++;
            
        //If conditon to check that the initials were inputed properly using matches function and 
        //Utilizing Regex to check if the initials are in capitals, and separated by a period between each letter 
        //Storing the initials inputedby the user into the array letters, and using split function to split every letter by the period
        //Printing to the user the initials from letters array with the word super between them 
            if ((initials.matches("^[A-Z]\\.[A-Z]$")))
            {
                String[] letters = initials.split("\\.");
                System.out.println("Your initials are: " + letters[0] + " super " + letters[1]); 
                
            }
        //Exit condition for the loop    
        }while ((numAttempts < maxAttempts) && (!initials.matches("^[A-Z]\\.[A-Z]")));
        return null;
        
    }
}
