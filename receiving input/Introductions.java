import java.io.Console;
 
public class Introductions {
  
    public static void main(String[] args) {
        Console console = System.console();
        // Welcome to the Introductions program!  Your code goes below here
      
        String firstName = console.readLine("What is your name?  ");
        console.printf("Your name is %s\n", firstName); 
  }
}