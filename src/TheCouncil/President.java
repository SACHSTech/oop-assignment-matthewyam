package TheCouncil;


public class President extends Members{

    private int smart;

    public President (String fName, String lName, String rank, int year, double pwr, int intelligence){

        super(fName, lName, rank, year, pwr);
        smart = intelligence;
    }

    public int getSmart(){
        return smart;
    }

    public String toString(){
        return "The President is " + getFirstName() + " " + getLastName() + "." + " He is in grade " + getGrade() + ", has a power level of " + getImportance() + " and has an IQ of " + getSmart();
    }
}