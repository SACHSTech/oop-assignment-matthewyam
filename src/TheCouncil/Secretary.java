package TheCouncil;


public class Secretary extends Members{

    //Variables
    private String filing;

    /**
     * @param fName First Name
     * @param lName Last Name
     * @param rank Role in the Council
     * @param year Grade
     * @param pwr Authority Level
     * @param files Filing Skills
     */
    
    public Secretary (String fName, String lName, String rank, int year, double pwr, String files){

        super(fName, lName, rank, year, pwr);
        filing = files;
    }

    //Returns Filing skills
    public String getFiling(){
        return filing;
    }

    //Prints and returns information about the Secretary
    public String toString(){
        
        System.out.println("");
        System.out.println("The " + getPosition());
        System.out.println("-------------------------");
        System.out.println("First Name: " + getFirstName());
        System.out.println("Last Name: " + getLastName());
        System.out.println("Grade: " + getGrade());
        System.out.println("Influence level: " + getImportance() + "/" + getTotalImportance());
        System.out.println("");
        System.out.println("Talent: Filing Paperwork");
        System.out.println("Filing skills: " + getFiling());
        System.out.println("-------------------------");
        return "";
        
    }
}