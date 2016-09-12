/**
 * Created by yassirhessane on 17/08/16.
 */
abstract class Element {

    protected String descirption;

    public Element(String descirption) {
        this.descirption = descirption;
    }

    public boolean motCleValide(String motCle)
    {
        return this.descirption.contains(motCle);
    }
}
