package TheCouncil;


public class Treasure extends Members{

    private int smart;

    public Treasure (String fName, String lName, String rank, int year, double pwr, int intelligence){

        super(fName, lName, rank, year, pwr);
        smart = intelligence;
    }

    public int getSmart(){
        return smart;
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
        System.out.println("Talent: Intelligence");
        System.out.println("IQ: " + getSmart());
        return "";
        
    }
}