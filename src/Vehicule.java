/**
 * Created by yassirhessane on 17/08/16.
 */
public class Vehicule extends Element {


    public Vehicule(String descirption) {
        super(descirption);
    }

    public void affiche()
    {
        System.out.println("Description du véhicule: "+this.descirption);
    }
}
