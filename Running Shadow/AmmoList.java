import java.util.HashMap;
public class AmmoList
{
    HashMap<Integer, Ammunition> ammoMap = new HashMap<Integer, Ammunition>();
    public void aList()
    {
        //Bullet
        Ammunition bullet = new Ammunition();
        bullet.setName("BULLET");
        bullet.setId(1501);
        
        //Arrow
        Ammunition arrow = new Ammunition();
        arrow.setName("ARROW");
        arrow.setId(1502);
        
        //Bolt
        Ammunition bolt = new Ammunition();
        bolt.setName("BOLT");
        bolt.setId(1503);
        
        //Dart
        Ammunition dart = new Ammunition();
        dart.setName("DART");
        dart.setId(1504);
    }
}
