/*
* Author Fergus Fitzpatrick
*
* Date 14-11-16
*
* The lab was to accept in a string and using a Stack class
* return TRUE or FALSE if the string was a palindrome. (Ignoring spaces)
*
* e.g "ten animals in i slam in a net" - will return TRUE
* e.g "java is fun" - will return FALSE
*/
import java.util.*;

public class StackPalindrome {
    public static void main(String args[] ) throws Exception {
        Scanner scan = new Scanner (System.in);
        String input = scan.nextLine();
        int slength = input.length();

   		  stack mystack = new stack(slength);
   		  mystack.push(input);
   		  mystack.isPalindrome();
   }
}
