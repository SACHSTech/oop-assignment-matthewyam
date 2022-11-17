package TheCouncil;


public class Treasure extends Members{

    //Variables
    private int smart;

   /**@param fName First Name
     * @param lName Last Name
     * @param rank Role in the Council
     * @param year Grade
     * @param pwr Authority Level
     * @param sSkill Talent
     * @param intelligence IQ
     */

    public Treasure (String fName, String lName, String rank, int year, double pwr, String sSkill, int intelligence){

        super(fName, lName, rank, year, pwr, sSkill);
        smart = intelligence;
    }

    //Returns IQ
    public int getSmart(){
        return smart;
    }

    //Prints and returns information about the Treasure
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
        System.out.println("IQ: " + getSmart());
        System.out.println("-------------------------");
        return "";
        
    }
}