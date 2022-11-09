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
        return "The President is " + getFirstName() + " " + getLastName() + "." + " He is in grade " + getGrade() + ", has a power level of " + getImportance() + " and has an IQ of " + getCharisma();
    }
}