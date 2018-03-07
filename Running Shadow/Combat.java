import java.util.ArrayList;
public class Combat extends Event
{
    Roller otto = new Roller();
    ArrayList<Character> allies = new ArrayList<Character>();
    ArrayList<Character> opponents = new ArrayList<Character>();
    int[] initiative;
    
    public void initiative()
    {
        for(int j = 0; j < allies.size(); j++)
        {
            initiative[j] = otto.roll(1, 6, 0) + allies.get(j).getAtt(2) + allies.get(j).getAtt(3);
        }
        for(int j = 0; j < opponents.size(); j++)
        {
            initiative[j + allies.size()] = otto.roll(1,6,0) + opponents.get(j).getAtt(2) + opponents.get(j).getAtt(3);
        }
    }
    
    public void main()
    {
        
    }
}
