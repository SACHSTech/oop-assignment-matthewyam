package TheCouncil;


public class President extends Members{

    private int charisma;

    public President (String fName, String lName, String rank, int year, double pwr, int love){

        super(fName, lName, rank, year, pwr);
        charisma = love;
    }

    public int getCharisma(){
        return charisma;
    }

    public String toString(){
        
        System.out.println("");
        System.out.println("The " + getPosition());
        System.out.println("-------------------------");
        System.out.println("");
        System.out.println("First Name: " + getFirstName());
        System.out.println("Last Name: " + getLastName());
        System.out.println("Grade: " + getGrade());
        System.out.println("Influence level: " + getImportance() + "/" + getTotalImportance());
        System.out.println("");
        System.out.println("Talent: Charisma");
        System.out.println("Charisma Level: " + getCharisma());
        return "";

    }
}