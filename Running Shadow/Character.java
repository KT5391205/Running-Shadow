public abstract class Character
{
    protected String name;
    protected int[] attributes = new int[7]; //BOD, STR, AGI, REA, WIT, GRT, CHA
    protected int[] weaponSkills = new int[4]; //Pistols, longarms, melee, unarmed
    protected int[] skills = new int[10];
    //Endurance (BOD), Athletics (STR), Sleight of Hand (AGI), Stealth (AGI), Perception (WIT), Willpower (GRT), Convince (CHA), Intimidate (CHA)
    protected int hp;
    protected int xp;
    protected int level;
    
    
    //Constructors
    public Character()
    {
    }
    public Character(String n, int b, int s, int a, int r, int i, int g, int c)
    {
        name = n;
        attributes[0] = b;
        attributes[1] = s;
        attributes[2] = a;
        attributes[3] = r;
        attributes[4] = i;
        attributes[5] = g;
        attributes[6] = c;
        hpInit();
    }
    
    //Methods
    public void hpInit()
    {
        hp = level * ((int)(getAtt(5) / 2)) + getAtt(0);
    }
    
    public boolean check(int thr, int att, int adv, int bonus)
    {
        boolean succeed = false;
        int attribute = attributes[att];
        int value = 0;
        int glitch = 0;
        for(int i = 0; i < (attribute + adv); i++)
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
    
    public int dealDamage(int att, int adv, int bonus)
    {
        int damage = 0;
        for(int i = 0; i < (att + adv); i++)
        {
            int rand = (int)Math.random() * 6 + 1;
            if(rand >= 4)
            {
                damage += 1;
            }
        }
        damage += bonus;
        return damage;
    }
    
    public void attack(Character a, Character d, Weapon w)
    {
        int damage = 0;
        int defense = d.getAtt(2) + d.getAtt(5);
        boolean hit = a.check(defense, w.getAtt(), 0, 0);
        if(hit)
        {
            damage = a.dealDamage(w.getAtt(), 0, 0);
        }
        damage -= d.getAtt(0);
        if(damage < 1)
        {
            damage = 1;
        }
        d.hp -= damage;
    }
    
    public void levelUp()
    {
        level++;
        hpInit();
    }
    
    public void countXp()
    {
        if(xp > 300 * level)
        {
            levelUp();
        }
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
    
    /**
     * Skills
     */
    public int getWeaponSkill(int w)
    {
        return weaponSkills[w];
    }
    public void setWeaponSkill(int w, int i)
    {
        weaponSkills[w] = i;
    }
    public int getSkill(int s)
    {
        return skills[s];
    }
    public void setSkill(int s, int i)
    {
        skills[s] = i;
    }
    
    /**
     * HP
     */
    public int getHp()
    {
        return hp;
    }
    public void setHp(int h)
    {
        hp = h;
    }
    
    /**
     * XP
     */
    public int getXp()
    {
        return xp;
    }
    public void setXp(int x)
    {
        xp = x;
    }
    
    /**
     * Level
     */
    public int getLevel()
    {
        return level;
    }
    public void setLevel(int l)
    {
        level = l;
    }
}
