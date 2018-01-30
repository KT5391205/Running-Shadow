public abstract class Item
{
    protected String name;
    protected int value;
        
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
}
