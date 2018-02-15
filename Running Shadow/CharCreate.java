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
                nameSelect();
            }
        }
        if(response.length() > 12 || response.length() < 2)
        {
            System.out.println("That name is not of a sufficient length.");
            nameSelect();
        }
        int confirm = 0;
        while(confirm != 1 && confirm != 2)
        {
            try
            {
                System.out.println("Your name is " + response + "?\n"
                    + "[1]: Yes.\n"
                    + "[2]: No.");
                confirm = scanner.nextInt();
            }
            catch(Exception e)
            {
                System.out.println("That is not an acceptable response.");
                confirm = 0;
            }
        }
        if(confirm == 1)
        {
            System.out.println("Your name will be " + response + ".");
            PC.setName(response);
        }
        else
        {
            nameSelect();
        }
    }

    public static void attributeSelect()
    {
        int response = 0;
        while(response < 1 || response > 7)
        {
            try
            {
                System.out.println("Which attribute would you like to change?\n"
                    + "[1]: BOD\n"
                    + "[2]: STR\n"
                    + "[3]: AGI\n"
                    + "[4]: REA\n"
                    + "[5]: WIT\n"
                    + "[6]: GRT\n"
                    + "[7]: CHA");
                response = scanner.nextInt();
            }
            catch(Exception e){}
        }
    }
}
