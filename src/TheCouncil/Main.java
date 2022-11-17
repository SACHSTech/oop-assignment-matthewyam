package TheCouncil;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.BufferedReader;

/**
 * A program that displays info on the student council depending on the user input.
 * This program displays the hiearchy and the information of members of the student council
 * @author M. Yam
 */


public class Main{
    
    public static void main(String[] args) throws IOException{

        //Reads Keyboard Inputs
        BufferedReader keyboard = new BufferedReader (new InputStreamReader( System.in));
        
        //Uses Extend class to create members
        President memberOne = new President ("Miyuki", "Shirogane", "President", 12, 4, "Charisma", 10);
        VicePresident memberTwo = new VicePresident ("Kaguya", "Shinomiya", "Vice President", 12, 3.5, "Bribery", 1900749.42);
        Treasure memberThree = new Treasure("Yuu", "Ishigami","Treasure", 10,2, "Intelligence",190);
        Secretary memberFour = new Secretary("Chika", "Fujiwara","Secretary", 12, 1, "Filing Paperwork", "Decently Fast");
        
        //Prints out the begining message and prompts user for input
        System.out.println("");
        System.out.println("Welcome to the Student Council's Member Database");
        System.out.println("");

        System.out.println("1. President");
        System.out.println("2. Vice President");
        System.out.println("3. Treasure");
        System.out.println("4. Secretary");
        System.out.println("5. Exit ");
        System.out.println("");
        System.out.print("Enter Your Role: ");
        

        //Reads user input and outs put the code depending on if statement condition
        String userInput = keyboard.readLine();

        //loops promps until user exits
        while (userInput != "exit"){
            
            //Outputs President's info if input is President
            if(userInput.equals("President") || userInput.equals("president") || userInput.equals("PRESIDENT")){
                System.out.println(memberOne);
                
            }
            
            //Outputs Vice President's info if input is Vice President
            else if(userInput.equals("Vice President") || userInput.equals("vice president") || userInput.equals("VICE PRESIDENT")){
                System.out.println(memberTwo);
                
            }
            
            //Outputs Treasure's info if input is Treasure
            else if(userInput.equals("Treasure") || userInput.equals("treasure") || userInput.equals("TREASURE")){
                System.out.println(memberThree);
                
            }

            //Outputs Secretary's info if inout is Secretary
            else if(userInput.equals("Secretary") || userInput.equals("secretary") || userInput.equals("SECRETARY")){
                System.out.println(memberFour);
                
            }
            
            //Breaks loops and end program if input is Exit
            else if(userInput.equals("exit") || userInput.equals("EXIT") || userInput.equals("Exit")){
                System.out.println("");
                System.out.println("Goodbye");
                System.out.println("");
                break;
            }

            //Prints Invalid option if input is not a role
            else{
                System.out.println("Invalid Option");
            }

            System.out.println("");
            System.out.print("Enter Student Council Role: ");
            userInput = keyboard.readLine();
    }

    }    
}
