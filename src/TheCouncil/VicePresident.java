package TheCouncil;

public class VicePresident extends Members{

    //Variables
    private double netWorth;

    /**
     *@param fName First Name
     * @param lName Last Name
     * @param rank Role in the Council
     * @param year Grade
     * @param pwr Authority Level
     * @param sSkill Talent
     * @param worth Worth of Vice President
     */

    public VicePresident(String fName, String lName, String rank, int year, double pwr, String sSkill, double worth){

        super(fName, lName, rank, year, pwr, sSkill);
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
        System.out.println("Talent: " + getTalent());
        System.out.println("Net Worth: $" + getNetWorth());
        System.out.println("-------------------------");
        
        return "";
        
    }
}
