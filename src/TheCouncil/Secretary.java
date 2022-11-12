package TheCouncil;


public class Secretary extends Members{

    private String filing;

    public Secretary (String fName, String lName, String rank, int year, double pwr, String files){

        super(fName, lName, rank, year, pwr);
        filing = files;
    }

    public String getFiling(){
        return filing;
    }

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