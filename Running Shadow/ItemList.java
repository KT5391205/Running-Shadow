public class ItemList
{
    public void itemList()
    {
        //Beherit
        MiscItem beherit = new MiscItem();
        beherit.setName("STRANGE EGG");
        beherit.setDesc("an egg-shaped item with human facial features");
        beherit.setId(2000);
        
        //Christian Potion
        MiscItem christianPotion = new MiscItem();
        christianPotion.setName("CHRISTIAN POTION");
        christianPotion.setDesc("a small vial of liquid made from Christian Pascacio");
        christianPotion.setId(2001);
    }
}
