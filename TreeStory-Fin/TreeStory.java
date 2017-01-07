import java.io.Console;
 
public class TreeStory {
    
    public static void main(String[] args) {
        Console console = System.console();
        /*  Some terms:
            noun - Person, place or thing
            verb - An action
            adjective - A description used to modify or describe a noun
            Enter your amazing code here!
        */
      
        // __name__ is a __adjective__ __noun__. They are always __adverb__ __verb__.
      String name = console.readLine("Enter a name:  ");
      String adjective = console.readLine("Enter an adjective:  ");
      String adverb = console.readLine("Enter an adverb:  ");
      String verb = console.readLine("Enter a verb:  ");
      
      console.printf("Your TreeStory:\n ------------------------- \n");
      console.printf("%s is a %s. They are always %s %s.\n", name, adjective, adverb, verb);
    }
    
}