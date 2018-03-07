import java.lang.Math;
public class Roller
{
    public int roll(int n, int x, int type)
    {
        int successes = 0;
        int total = 0;
        for(int j = 0; j < n; j++)
        {
            int rand = (int)Math.random() * 6 + 1;
            if(rand >= 4)
            {
                successes++;
            }
            total += rand;
        }
        if(type == 0)
        {
            return total;
        }
        else
        {
            return successes;
        }
    }
}
