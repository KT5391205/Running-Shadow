public class WeaponList
{
    public void wList()
    {
        //Six Shooter
        Weapon sixer = new Weapon();
        sixer.setName("SIX SHOOTER");
        sixer.setDesc("a single-fire pistol with a revolving, six-round cylinder");
        sixer.setValue(100);
        sixer.setId(1001);
        sixer.setType('p');
        sixer.setDamage(4);
        sixer.setDamType('p');
        sixer.setAtt(2);
        
        //Hunting Rifle
        Weapon rifle = new Weapon();
        rifle.setName("HUNTING RIFLE");
        rifle.setDesc("a bolt action rifle with a wooden stock used for killing babies");
        sixer.setId(1002);
        rifle.setValue(300);
        rifle.setType('l');
        rifle.setDamage(8);
        rifle.setDamType('p');
        rifle.setAtt(2);
        
        //Saber
        Weapon saber = new Weapon();
        saber.setName("SABER");
        saber.setDesc("a long, thin blade used by Union soldiers in close-quarters combat");
        saber.setId(1003);
        saber.setValue(130);
        saber.setType('m');
        saber.setDamage(6);
        saber.setDamType('s');
        saber.setAtt(1);
        
        //Stick
        Weapon stick = new Weapon();
        stick.setName("STICK");
        stick.setDesc("a wooden twig");
        stick.setId(1000);
        stick.setValue(-1);
        stick.setType('m');
        stick.setDamage(1);
        stick.setDamType('b');
        stick.setAtt(1);
        
        //Dragon Slayer
        Weapon dragonSlayer = new Weapon();
        dragonSlayer.setName("DRAGON SLAYER");
        dragonSlayer.setDesc("a colossal greatsword used by Guts");
        sixer.setId(1999);
        dragonSlayer.setValue(1000);
        dragonSlayer.setType('m');
        dragonSlayer.setDamage(18);
        dragonSlayer.setDamType('s');
        dragonSlayer.setAtt(1);
    }
}
