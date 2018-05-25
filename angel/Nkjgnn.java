import java.util.Scanner;
import java.util.ArrayList;
public class Nkjgnn
{
    Scanner scanner = new Scanner(System.in);
    public void fancy()
    {
        System.out.println("Enter your text: ");
        String str = scanner.next();
        ArrayList<String> list = new ArrayList<String>();
        
        for(int i = 0; i < str.length(); i++)
        {
            if(!str.substring(i, i + 1).equals(" "))
            {
                list.add(str.substring(i, i + 1));
            }
        }

        for(int i = 0; i < list.size(); i++)
        {
            System.out.print("  _  ");
        }
        System.out.println("");
        for(int i = 0; i < list.size(); i++)
        {
            System.out.print(" / \\ ");
        }
        System.out.println("");
        for(int i = 0; i < list.size(); i++)
        {
            System.out.print("| " + list.get(i) + " |");
        }
        System.out.println("");
        for(int i = 0; i < list.size(); i++)
        {
            System.out.print(" \\_/ ");
        }
    }
}
