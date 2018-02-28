public class Weapon extends Item
{
    protected char type;
    protected int damage;
    protected char damType;
    protected int attribute;
    protected int range;
    protected boolean ammo;
    protected Ammunition ammoType;
    
    public Weapon()
    {
    }
    
    //Getters and Setters
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
     * Damage
     */
    public int getDamage()
    {
        return damage;
    }
    public void setDamage(int d)
    {
        damage = d;
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
    public void setAtt(int a)
    {
        attribute = a;
    }
    
    /**
     * Range
     */
    public int getRange()
    {
        return range;
    }
    public void setRange(int r)
    {
        range = r;
    }
    
    /**
     * Ammunition
     */
    public boolean getAmmo()
    {
        return ammo;
    }
    public void setAmmo(boolean a)
    {
        ammo = a;
    }
    
    /**
     * Ammunition Type
     */
    public Ammunition getAmmoType()
    {
        return ammoType;
    }
    public void setAmmoType(Ammunition a)
    {
        ammoType = a;
    }
}
