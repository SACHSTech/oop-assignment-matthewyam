package TheCouncil;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.BufferedReader;


public class Main{
    
    public static void main(String[] args) throws IOException{

        BufferedReader keyboard = new BufferedReader (new InputStreamReader( System.in));
        
        President memberOne = new President ("Miyuki", "Shirogane", "President", 12, 4, 10);
        VicePresident memberTwo = new VicePresident ("Kaguya", "Shinomiya", "Vice President", 12, 3.5, 1900749.00);
        Treasure memberThree = new Treasure("Yuu", "Ishigami","Treasure", 10,2,190);
        Secretary memberFour = new Secretary("Chika", "Fujiwara","Secretary", 12, 1, "Decently Fast");
        
        

        System.out.println("Welcome to the Student Council's Student Tracker");
        System.out.println("");
        System.out.print("Enter Student Council Role: ");
        

        String userInput = keyboard.readLine();
        //userInput = keyboard.readLine();
        

        //System.out.println("The profile of the " + userInput + " is");
        //userInput = keyboard.readLine();

        while (userInput != "exit"){
        if(userInput.equals("President") || userInput.equals("president") || userInput.equals("PRESIDENT")){
            System.out.println(memberOne);
            
        }
        else if(userInput.equals("Vice President") || userInput.equals("vice president") || userInput.equals("VICE PRESIDENT")){
            System.out.println(memberTwo);
            
        }
        else if(userInput.equals("Treasure") || userInput.equals("treasure") || userInput.equals("TREASURE")){
            System.out.println(memberThree);
            
        }
        else if(userInput.equals("Secretary") || userInput.equals("secretary") || userInput.equals("SECRETARY")){
            System.out.println(memberFour);
            
        }
        
        else if(userInput.equals("exit") || userInput.equals("EXIT") || userInput.equals("Exit")){
            break;
        }

        else{
            System.out.println("Invalid Option");
        }
        System.out.println("");
        System.out.print("Enter Student Council Role: ");
        userInput = keyboard.readLine();
    }

    }    
}
