package TheCouncil;
import java.io.IOException;


public class Main{
    
    public static void main(String[] args) throws IOException{

    President one = new President ("Miyuki", "Shirogane", "President", 12, 4, 190);
    VicePresident two = new VicePresident ("Kaguya", "Shinomiya", "Vice President", 12, 35, 1900749.00);

    System.out.println(one);
    System.out.println(two);
    }
    
    
}
