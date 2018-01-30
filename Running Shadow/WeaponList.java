public class WeaponList
{
    public void wList()
    {
        //Unarmed
        Weapon unarmed = new Weapon();
        unarmed.setName("UNARMED");
        unarmed.setType('u');
        unarmed.setDamage(0);
        unarmed.setDamType('b');
        unarmed.setAtt(1);
        
        //Six Shooter
        Weapon sixer = new Weapon();
        sixer.setName("SIX SHOOTER");
        sixer.setType('p');
        sixer.setDamage(4);
        sixer.setDamType('p');
        sixer.setAtt(2);
        
        //Hunting Rifle
        Weapon rifle = new Weapon();
        rifle.setName("HUNTING RIFLE");
        rifle.setType('l');
        rifle.setDamage(8);
        rifle.setDamType('p');
        rifle.setAtt(2);
        
        //Saber
        Weapon saber = new Weapon();
        saber.setName("SABER");
        saber.setType('m');
        saber.setDamage(6);
        saber.setDamType('s');
        saber.setAtt(1);
    }
}
