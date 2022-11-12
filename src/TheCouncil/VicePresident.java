package TheCouncil;

public class VicePresident extends Members{

    //Variables
    private double netWorth;

    /**
     * @param fName First Name
     * @param lName Last Name
     * @param rank Role in the Council
     * @param year Grade
     * @param pwr Authority Level
     * @param worth Worth of Vice President
     */

    public VicePresident(String fName, String lName, String rank, int year, double pwr, double worth){

        super(fName, lName, rank, year, pwr);
        netWorth = worth;
    }

    public double getNetWorth(){
        return netWorth;
    }

    //Prints and returns information about the Vice President
    public String toString(){
        
        System.out.println("");
        System.out.println("The " + getPosition());
        System.out.println("-------------------------");
        System.out.println("First Name: " + getFirstName());
        System.out.println("Last Name: " + getLastName());
        System.out.println("Grade: " + getGrade());
        System.out.println("Influence level: " + getImportance() + "/" + getTotalImportance());
        System.out.println("");
        System.out.println("Talent: Bribery");
        System.out.println("Net Worth: $" + getNetWorth());
        System.out.println("-------------------------");
        
        return "";
        
    }
}
