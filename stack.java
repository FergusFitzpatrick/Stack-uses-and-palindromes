/*
* Author Fergus Fitzpatrick
*
* Date updated 18-11-16
*
*	Updates: I separated this class into a new file to make it more modulated and decided to add a few methods.
*	This class will only work for char Stacks. To change type, change to array to new data type, alter push method &
* miscellaenous variables.
* this class was initailly designed for the purpose of checking a palindrome.
*
*/

public class stack{
	private int maxSize;
	public char[] stackArray;
	private int top;

	public stack(int slength){
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

	 public char pop(){
		char temp = ' ';
		 if (top != -1){
			 temp = stackArray[top];
			 top--;
			 System.out.println(temp);
		 }
		 return temp;
	 }

	 public boolean isEmpty(){
		 if( top == -1 ){
			 System.out.println("Stack is empty");
			 return true;
		 }
		 return false;
	 }

	 public void peak(){
		 if( top != -1){
		 		System.out.println(stackArray[top]);
				return stackArray[top];
			}
			else{
				isEmpty();
			}
	 }
}
