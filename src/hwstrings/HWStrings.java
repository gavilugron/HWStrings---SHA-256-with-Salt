/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package hwstrings;

import inpututilities.InputUtilities;
import hashwhitsalt.HashWithSalt;
/**
 *
 * @author gvilu
 */
public class HWStrings {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Defining variable rname to store a Reverse Name and 
        //Initializing InputUtilities object to get a name from the user
        InputUtilities myInput = new InputUtilities();
        String rname = "";
        
        //Using InputUtilities method to get a name from the user, and 
        //applying methods to uppercase and trim the string inputted
        String name = myInput.askUserForText("Please enter a name ");
        System.out.println("Your name is " + name.toUpperCase());
        name = name.toUpperCase().trim();
        //Conditions to replace the following letters of the string:
        // A to 4; E to 3; I to 1: O to 0; S to 5; T to 7
            if (name.contains("A")){
             name = name.replace('A', '4');
            }
             if(name.contains("E")){
             name = name.replace('E', '3');     
             }
             if(name.contains("I")){
             name = name.replace('I', '1');     
             }
             if(name.contains("O")){
             name = name.replace('O', '0');     
             }
             if(name.contains("S")){
             name = name.replace('S', '5');     
             }
             if(name.contains("T")){
             name = name.replace('T', '7');     
             }
        //Loop to create a reverse the name inputted      
        for (int i = 0; i < name.length(); i++){
         rname = name.charAt(i) + rname;
        }
        //Output of the name with letter replaced by the IF conditions
        System.out.println("Your Code Name is " + name);
        //Output of the reverse name created with the loop
        System.out.println("Your reverse code name is: " + rname);
        //Output of the name and it hash using hashCode() method
        System.out.println("The Encripted code whit java method of the name " + name + " is: " + name.hashCode());
        //Output of the reverse name and it hash using hashCode() method
        System.out.println("The Encripted code whit java method of the name " + rname + " is: " + rname.hashCode());
       
        //For this section I searched the way to encrypt in SHA-256 with salt, code that is not of my property,
        //but I used to practice how to import a package and use theirfunctions
        
        
        //Using generateSalt method from HashWithSalt package to generate salt
        String salt = HashWithSalt.generateSalt();
        //Using hashWithSHA256 method from HashWithSalt package to hash the name in SHA-256 using 
        String hashedName = HashWithSalt.hashWithSHA256(name, salt);
        //Output of the name with its SHA-256 Salted Hash
        System.out.println("The Encrypted code of " + name + " with salted SHA-256 is: " + hashedName);
        //Using hashWithSHA256 method from HashWithSalt package to hash the reversed name with salt
        String hashedRname = HashWithSalt.hashWithSHA256(rname, salt);
        //Output of the reversed name with its SHA-256 Salted Hash
        System.out.println("The Encrypted code of " + rname + " with salted SHA-256 is: " + hashedRname);
    }
}

