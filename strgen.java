/*strgen
 * 
 * This application creates a random string
 * 
 * Hongda Zeng (hongda.code@gmail.com)
 * September 27, 2014
 * */

import java.util.*;
public class strgen {
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
    
    public static void main (String[] args){
        Scanner reader = new Scanner (System.in);
        System.out.println ("Please enter how long of a string you need: ");
        int strLen = reader.nextInt();
        System.out.println ( randomString(strLen));
        
    }
}