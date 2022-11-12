package TheCouncil;


public class Members {

    //Variables
    private String firstName;
    private String lastName;
    private String position;
    private int grade;
    private Double importance;
    private int totalImportance = 4;
    

    /**
     * @param fName Generic First Name
     * @param lName Generic Last Name
     * @param rank Generic Role in the Council
     * @param year Generic Grade
     * @param pwr Generic Authority Level
     */
    public Members(String fName, String lName, String rank, int year, double pwr){

        firstName = fName;
        lastName = lName;
        position = rank;
        grade = year;
        importance = pwr;
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
    
    
}

