public class Weapon
{
    protected String name;
    protected char type;
    protected int value;
    protected int[] damage = new int[2];
    protected char damType;
    protected int attribute;
    
    public Weapon()
    {
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
     * Type
     */
    public char getType()
    {
        return type;
    }
    public void setType(char t)
    {
        type = t;
    }
    
    /**
     * Value
     */
    public int getValue()
    {
        return value;
    }
    public void setValue(int v)
    {
        value = v;
    }
    
    /**
     * Damage
     */
    public int getDamage(int i)
    {
        return damage[i];
    }
    public void setDamage(int i, int d)
    {
        damage[i] = d;
    }
    
    /**
     * Damage Type
     */
    public char getDamType()
    {
        return damType;
    }
    public void setDamType(char d)
    {
        damType = d;
    }
    
    /**
     * Attribute
     */
    public int getAtt()
    {
        return attribute;
    }
    public void setType(int a)
    {
        attribute = a;
    }
}
