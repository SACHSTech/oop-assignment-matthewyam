package TheCouncil;


public class Secretary extends Members{

    private String publicRelations;

    public Secretary (String fName, String lName, String rank, int year, double pwr, String pRelations){

        super(fName, lName, rank, year, pwr);
        publicRelations = pRelations;
    }

    public String getPublicRelations(){
        return publicRelations;
    }

    public String toString(){
        return "The Secretary is " + getFirstName() + " " + getLastName() + "." + " He is in grade " + getGrade() + ", has a power level of " + getImportance() + " and has an IQ of " + getPublicRelations();
    }
}