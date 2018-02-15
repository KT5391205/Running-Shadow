import java.util.Scanner;
public class CharCreate
{
    static Scanner scanner = new Scanner(System.in);
    static Character PC = new Player();
    public static void nameSelect()
    {
        String response = "";
        while(response.equals("")){
            try
            {
                System.out.println("What is your name?");
                response = scanner.next();
            }
            catch(Exception e)
            {
                System.out.println("That is not an acceptable name.");
                response = "";
            }
        }
        if(response.length() > 12 || response.length() < 2)
        {
            System.out.println("That name is not of a sufficient length.");
            nameSelect();
        }
    }
    
    public static void attributeSelect()
    {
        
    }
}
