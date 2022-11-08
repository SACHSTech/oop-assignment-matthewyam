package TheCouncil;


public class Members {

    private String firstName;
    private String lastName;
    private String position;
    private int grade;
    private Double importance;
    


    public Members(String fName, String lName, String rank, int year, double pwr){

        firstName = fName;
        lastName = lName;
        position = rank;
        grade = year;
        importance = pwr;
    }

    public String getFirstName(){
        return firstName;
    }

    public String getLastName(){
        return lastName;
    }

    public String getPosition(){
        return position;
    }

    public int getGrade(){
        return grade;
    }

    public Double getImportance(){
        return importance;
    }

    public String toString(){
        return firstName + " " + lastName  + " is the Student Council " + position + "." + " They are in Grade " + grade + " and have an importance level of " + importance + ".";
    }
    
}

