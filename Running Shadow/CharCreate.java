import java.util.Scanner;
public class CharCreate
{
    static Scanner scanner = new Scanner(System.in);
    static Character PC = new Player();
    public static void nameSelect()
    {
        String response = "";
        try
        {
            while(response.equals(""))
            {
                System.out.println("What is your name?");
                response = scanner.next();
            }
            if(response.length() > 12 || response.length() < 2)
            {
                System.out.println("That name is not of a sufficient length.");
                nameSelect();
            }
        }
        catch(Exception e){}
    }
}
