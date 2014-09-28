/*Strgen
 *  1.2
 * This application creates a random string base on some random
 * 
 * Hongda Zeng (hongda.code@gmail.com)
 * 
 * September 27, 2014
 * */

import java.util.*; //Getting Random, String, and Scanner

public class Strgen {
    // This method create a random string of a specified length using a pickline
    public static String randomString(int length) {
        final String pickline = "0123456789abcdefghijklmnopqrestuvwxyz";
        // The method will choose random characters from the above line
        Random randGen = new Random();
        // Create randGen
        StringBuilder builder = new StringBuilder(length);
        for ( int i = 0; i < length; i++ ) {
            builder.append ( pickline.charAt(randGen.nextInt(pickline.length())));
            // The above line will randomly pick letters from pickline to generate a string
        }
        return builder.toString();
    }
    
    // This method create a random string of a specified length using a specified pickline
    public static String pickString(int length, String pick) {
        // The method will choose random characters from a user chosen line
        Random randGen = new Random();
        // Create randGen
        StringBuilder builder = new StringBuilder(length);
        for ( int i = 0; i < length; i++ ) {
            builder.append ( pick.charAt(randGen.nextInt(pick.length())));
            // The above line will randomly pick letters from pickline to generate a string
        }
        return builder.toString();
    }
    
    public static void main (String[] args) {
        Scanner reader = new Scanner (System.in);
        System.out.println ("Please enter how long of a string you need (a~z, 0~9: ");
        int strLen = reader.nextInt();
        reader.nextLine(); // This is used since nextInt() will leave a "\n" after taking the int.
        // Without this nextLine(), the next String picklist = reader.nextLine(); will only pick up an empty string.
        //--------------------------------------------------------------------------------
        System.out.println (">>> " + randomString(strLen));
        System.out.println ("Pick String");
        System.out.println ("Please enter the list of character you need: ");
        String picklist = reader.nextLine();
        System.out.println ("Please enter how long of a string you need (a~z, 0~9: ");
        int strLen2 =reader.nextInt();
        System.out.println (">>> " + pickString(strLen2, picklist));
    }
}