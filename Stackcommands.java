import java.util.*;

public class Stackcommands{
  public static void main (String args[]) {
    //method variables
    Scanner scan = new Scanner (System.in);
    String input;

    //Prompt user for how many commands they wish to input.
    System.out.println("How many commands do you wish to make?");
    int N = scan.nextInt();

    //create object of type stack
    stack mystack = new stack(100);

    //recognise input commands & carry out the function.
    for(int i = 0; i<N; i++){
      input = scan.next();
      if(input.equalsIgnoreCase("push")){
        String x = scan.next();
        mystack.push(x);
      }
      else if ( input.equalsIgnoreCase("pop")){
        mystack.pop();
      }
      else if ( input.equalsIgnoreCase("peak")){
        mystack.peak();
      }
      else if ( input.equalsIgnoreCase("isEmpty")){
        mystack.isEmpty();
      }
    }
  }
}
