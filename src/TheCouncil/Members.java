package TheCouncil;


public class Members {

    //Variables
    private String firstName;
    private String lastName;
    private String position;
    private int grade;
    private Double importance;
    private int totalImportance = 4;
    private String talent;
    

    /**
     * @param fName First Name
     * @param lName Last Name
     * @param rank Role in the Council
     * @param year Grade
     * @param pwr Authority Level
     * @param sSkill Talent
     */
    public Members(String fName, String lName, String rank, int year, double pwr, String sSkill){

        firstName = fName;
        lastName = lName;
        position = rank;
        grade = year;
        importance = pwr;
        talent = sSkill;
    }

    //Returns First Name
    public String getFirstName(){
        return firstName;
    }

    //Returns Last Name
    public String getLastName(){
        return lastName;
    }

    //Returns Role in Council
    public String getPosition(){
        return position;
    }

    //Return Grade
    public int getGrade(){
        return grade;
    }

    //Return Authority Level
    public Double getImportance(){
        return importance;
    }

    //Return Total Importance
    public int getTotalImportance(){
        return totalImportance;
    }

    //Returns Talent
    public String getTalent(){
        return talent;
    }
    
    
}

