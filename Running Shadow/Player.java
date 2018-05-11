import java.util.Scanner;
public class Player extends Character
{
    private Scanner scanner = new Scanner(System.in);
    private String[] atts = {"BOD", "STR", "AGI", "REA", "WIT", "GRT", "CHA"};
    
    Player pc = new Player();
    
    public void nameSelect()
    {
        String name = "";
        while(name == "")
        {
            try
            {
                System.out.println("What is your name?");
                name = scanner.next();
                System.out.println("Your name is " + name + "?");
            }
            catch(Exception e)
            {
                System.out.println("That is not an acceptable response.");
                nameSelect();
            }
        }
        if(name.length() < 3 || name.length() > 12)
        {
            System.out.println("Your name must be longer than 3 characters, but less than 12.");
        }
    }
    public void attributeSelect()
    {
        int response = 0;
        while(response != 1 && response != 2)
        {
            try
            {
                System.out.println("Your attributes scores are as follow.\n"
                    + "BOD: " + getAtt(0) + "\n"
                    + "STR: " + getAtt(1) + "\n"
                    + "AGI: " + getAtt(2) + "\n"
                    + "REA: " + getAtt(3) + "\n"
                    + "WIT: " + getAtt(4) + "\n"
                    + "GRT: " + getAtt(5) + "\n"
                    + "CHA: " + getAtt(6) + "\n");
                System.out.println("Would you like to change one of your attributes?\n"
                    + "[1]: Yes.\n"
                    + "[2]: No.");
                response = scanner.nextInt();
            }
            catch(Exception e)
            {
                System.out.println("That is not an acceptable response.");
                attributeSelect();
            }
        }
        if(response == 2)
        {
            int confirm = 0;
            while(confirm != 1 && confirm != 2)
            {
                try
                {
                    System.out.println("Are you sure you're finished?");
                }
                catch(Exception e)
                {
                    System.out.println("That is not an acceptable response.");
                    attributeSelect();
                }
            }
            if(confirm == 2)
            {
                attributeSelect();
            }
        }
        else
        {
            int attribute = 0;
            while(attribute < 1 || attribute > 7)
            {
                try
                {
                    System.out.println("Which attribute would you like to cahnge?\n"
                        + "[1]: BOD\n"
                        + "[2]: STR\n"
                        + "[3]: AGI\n"
                        + "[4]: REA\n"
                        + "[5]: WIT\n"
                        + "[6]: GRT\n"
                        + "[7]: CHA\n");
                    attribute = scanner.nextInt();
                }
                catch(Exception e)
                {
                    System.out.println("That is not an acceptable response.");
                    attributeSelect();
                }
            }
            attributeChange(attribute - 1);
        }
    }
    public void attributeChange(int a)
    {
        int value = -1;
        while(value < 0)
        {
            try
            {
                if(pc.getAtt(a) + value > 6 || pc.getAtt(a) + value < 1)
                {
                    System.out.println("Your attribute values cannot exceed six or be lower than one.");
                    attributeChange(a);
                }
                int totalAtts = 0;
                for(int i : pc.getAtts())
                {
                    totalAtts += i;
                }
                if(totalAtts > 28)
                {
                    System.out.println("The sum of your attribute values cannot exceed twenty four.");
                }
                pc.setAtt
            }
            catch(Exception e)
            {
            }
        }
    }
}
