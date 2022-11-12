package TheCouncil;


public class President extends Members{

    //Variables
    private int charisma;

    /**
     * @param fName First Name
     * @param lName Last Name
     * @param rank Role in the Council
     * @param year Grade
     * @param pwr Authority Level
     * @param love Charisma Level
     */
    public President (String fName, String lName, String rank, int year, double pwr, int love){

        //Pulls info from parent
        super(fName, lName, rank, year, pwr);
        charisma = love;
    }

    //Returns Charisma Level
    public int getCharisma(){
        return charisma;
    }

    //Prints and returns information about the President
    public String toString(){
        
        System.out.println("");
        System.out.println("The " + getPosition());
        System.out.println("-------------------------");
        System.out.println("First Name: " + getFirstName());
        System.out.println("Last Name: " + getLastName());
        System.out.println("Grade: " + getGrade());
        System.out.println("Influence level: " + getImportance() + "/" + getTotalImportance());
        System.out.println("");
        System.out.println("Talent: Charisma");
        System.out.println("Charisma Level: " + getCharisma());
        System.out.println("-------------------------");
        return "";

    }
}