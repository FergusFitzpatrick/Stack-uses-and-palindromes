/*
* Author Fergus Fitzpatrick
*
* Date 14-11-16
*
* The lab was to accept in a string and using a Stack class
* return TRUE or FALSE if the string was a palindrome. (Ignoring spaces)
*/
import java.util.*;

public class StackPalindrome {
    public static void main(String args[] ) throws Exception {
        Scanner scan = new Scanner (System.in);
        String input = scan.nextLine();
        int slength = input.length();
   		Stack mystack = new Stack(slength);
   		mystack.push(input);
   		mystack.isPalindrome();
   }
}
class Stack{
	private int maxSize;
	public char[] stackArray;
	private int top;

	public Stack(int slength){
	  maxSize = slength;
	  stackArray = new char[maxSize];
      top = -1;
	}
  public void push(String input) {
       for(int i = 0;i < input.length();i++){
           char x = input.charAt(i);
       		if (x == ' '){
       		}
       		else{
           		top++;
           		stackArray[top] = x;
       		}
   		}
   }
   public boolean isPalindrome(){
      int temp=0;
      int count = 0;
      for(int i = 0; i < top;i++){
            if(stackArray[i] == stackArray[top]){
                count++;
            }
            top--;
            temp++;
      }
     if(count == temp){
         System.out.println("TRUE");
         return true;
     }
     else{
     	System.out.println("FALSE");
         return false;
     }
   }
}
