public abstract class Item
{
    protected String name;
    protected String desc;
    protected int value;
    protected int id;
    
    //Methods
    public void inspect()
    {
        System.out.println(getName() + " is " + getDesc() + ".");
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
     * Description
     */
    public String getDesc()
    {
        return desc;
    }
    public void setDesc(String d)
    {
        desc = d;
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
     * ID
     */
    public int getId()
    {
        return id;
    }
    public void setId(int i)
    {
        id = i;
    }
}
