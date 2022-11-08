package TheCouncil;

public class vicePresident extends Members{

    private double netWorth;

    public vicePresident(String fName, String lName, String rank, int year, double pwr, double worth){

        super(fName, lName, rank, year, pwr);
        netWorth = worth;
    }

    public double getNetWorth(){
        return netWorth;
    }

    public String toString(){
        return "The Vice President is " + getFirstName() + " " + getLastName() + "." + " She is in grade " + getGrade() + ", has a power level of " + getImportance() + " and has an Net Worth of $" + getNetWorth();
    }
}