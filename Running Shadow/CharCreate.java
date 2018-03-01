import java.util.Scanner;
public class CharCreate
{
    static Scanner scanner = new Scanner(System.in);
    static Character PC = new Player();
    static String[] attNames = {"BOD", "STR", "AGI", "REA", "WIT", "GRT", "CHA"};
    public static void nameSelect()
    {
        String response = "";
        while(response.equals(""))
        {
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
            catch(Exception e)
            {
                System.out.println("That is not an acceptable response.");
                response = 0;
            }
        }
        int confirm = 0;
        while(confirm != 1 && confirm != 2)
        {
            try
            {
                System.out.println("You want to change " + attNames[response - 1] + "?\n"
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
            attributeChange(response - 1);
        }
        else
        {
            attributeSelect();
        }
    }

    public static void attributeChange(int a)
    {
        int amount = 0;
        while(amount < 1 || amount > 5)
        {
            try
            {
                System.out.println("By how much would you like to change your " + attNames[a] + "?");
                amount = scanner.nextInt();
            }
            catch(Exception e)
            {
                System.out.println("That is not an acceptable response.");
                amount = 0;
            }
        }
        int totalAtts = 0;
        for(int i : PC.getAtts())
        {
            totalAtts += i;
        }
        if(totalAtts + amount > 24)
        {
            System.out.println("The total of all of your attribute scores cannot exceed 24.");
            attributeChange(a);
        }
        else if(PC.getAtt(a) + amount < 1 || PC.getAtt(a) + amount > 6)
        {
            System.out.println("No attribute score can be less than 1 or greater than 6.");
            attributeChange(a);
        }
        else
        {
            PC.setAtt(a, PC.getAtt(a) + amount);
            System.out.println("Your " + attNames[a] + " has been increased to " + PC.getAtt(a) + ".");
            attributeFinish();
        }
    }

    public static void attributeFinish()
    {
        int confirm = 0;
        while(confirm != 1 && confirm != 2){
            try{
                System.out.println("Your attribute scores are as follow:");
                for(int i = 0; i < 8; i++)
                {
                    System.out.println(attNames[i] + ": " + PC.getAtt(i));
                }
                System.out.println("Is this okay?\n"
                    + "[1]: Yes.\n"
                    + "[2]: No.");
            }
            catch(Exception e)
            {
                System.out.println("That is not an acceptable response.");
            }
        }
    }
}
