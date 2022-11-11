package TheCouncil;

public class VicePresident extends Members{

    private double netWorth;

    public VicePresident(String fName, String lName, String rank, int year, double pwr, double worth){

        super(fName, lName, rank, year, pwr);
        netWorth = worth;
    }

    public double getNetWorth(){
        return netWorth;
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
        System.out.println("Talent: Bribery");
        System.out.println("Net Worth: $" + getNetWorth());
        
        return "";
        
    }
}
