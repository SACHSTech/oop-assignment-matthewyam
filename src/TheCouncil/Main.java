package TheCouncil;
import java.io.IOException;


public class Main{
    
    public static void main(String[] args) throws IOException{

    President one = new President ("Miyuki", "Shirogane", "President", 12, 4, 10);
    VicePresident two = new VicePresident ("Kaguya", "Shinomiya", "Vice President", 12, 3, 1900749.00);
    Treasure three = new Treasure("Yuu", "Ishigami","Treasure", 10,2,190);
    Secretary four = new Secretary("Chika", "Fujiwara","Secretary", 12, 1, "Poor");
    

    System.out.println(one);
    System.out.println(two);
    System.out.println(three);
    System.out.println(four);
    }
    
    
}
