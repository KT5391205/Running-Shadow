public class Character
{
    protected String name;
    protected int[] attributes = new int[7]; //STR, AGI, REA, GRT, WIT, WIL, CHA
    
    //Constructors
    public Character()
    {
    }
    
    public Character(String n, int s, int a, int r, int g, int i, int w, int c)
    {
        name = n;
        attributes[0] = s;
        attributes[1] = a;
        attributes[2] = r;
        attributes[3] = g;
        attributes[4] = i;
        attributes[5] = w;
        attributes[6] = c;
    }
    
    public boolean check(int thr, int att, int adv, int bonus)
    {
        boolean succeed = false;
        int attribute = attributes[att];
        int value = 0;
        int glitch = 0;
        for(int i = 0; i < (att + adv); i++)
        {
            int rand = (int)Math.random() * 6 + 1;
            if(rand >= 4)
            {
                value += 1;
            }
            else if(rand == 1)
            {
                glitch ++;
            }
        }
        value += bonus;
        if(value >= thr && glitch < (int)(value / 2))
        {
            succeed = true;
        }
        return succeed;
    }
    
    //Getters and Setters
    /**
     * Name
     */
    public String getName()
    {
        return name;
    }
    public void setName(String n)
    {
        name = n;
    }
    
    /**
     * Attributes
     */
    public int getAtt(int a)
    {
        return attributes[a];
    }
    public void setAtt(int a, int i)
    {
        attributes[a] = i;
    }
}
