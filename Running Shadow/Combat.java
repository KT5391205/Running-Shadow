import java.util.ArrayList;
public class Combat extends Event
{
    ArrayList<Character> allies = new ArrayList<Character>();
    ArrayList<Character> opponents = new ArrayList<Character>();
    int[] initiative;
    
    public void initiative()
    {
        for(int i = 0; i < allies.size(); i++)
        {
            initiative[i] = allies.get(i).getAtt(2) + allies.get(i).getAtt(3);
        }
        for(int i = 0; i < opponents.size(); i++)
        {
            initiative[i + allies.size()] = opponents.get(i).getAtt(2) + opponents.get(i).getAtt(3);
        }
    }
    
    public void main()
    {
        
    }
}
