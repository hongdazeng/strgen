/*strgen
 * 
 * This application creates a random string base on some random
 * 
 * Hongda Zeng (hongda.code@gmail.com)
 * September 27, 2014
 * */

import java.util.*; //Getting Random, String, and Scanner

public class Strgen {
    /* This method create a random string of a specified length using a 
     * 
     * */
    public static String randomString(int length) {
        final String pickline = "0123456789abcdefghijklmnopqrestuvwxyz";
        // The method will choose random characters from the above line
        Random randGen = new Random();
        // Create randomnese
        StringBuilder builder = new StringBuilder(length);
        for ( int i = 0; i < length; i++ ) {
            builder.append ( pickline.charAt(randGen.nextInt(pickline.length())));
        }
        return builder.toString();
    }
    
    public static String pickString(int length, String pick) {
        // The method will choose random characters from a user chosen line
        Random randGen = new Random();
        // Create randomnese
        StringBuilder builder = new StringBuilder(length);
        for ( int i = 0; i < length; i++ ) {
            builder.append ( pick.charAt(randGen.nextInt(pick.length())));
        }
        return builder.toString();
    }
    
    public static void main (String[] args) {
        Scanner reader = new Scanner (System.in);
        System.out.println ("Please enter how long of a string you need (a~z, 0~9: ");
        int strLen = reader.nextInt();
        reader.nextLine();
        System.out.println (">>> " + randomString(strLen));
        System.out.println ("Pick String");
        System.out.println ("Please enter the list of character you need: ");
        String picklist = reader.nextLine();
        System.out.println ("Please enter how long of a string you need (a~z, 0~9: ");
        int strLen2 =reader.nextInt();
        System.out.println (">>> " + pickString(strLen2, picklist));
    }
}