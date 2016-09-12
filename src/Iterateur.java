import java.util.ArrayList;

/**
 * Created by yassirhessane on 17/08/16.
 */
public class Iterateur {

    protected String motCleRequete;
    protected int index;
    protected ArrayList<Element> contenu;

    public void setMotCleRequete(String motCleRequete,ArrayList<Element> contenu)
    {
        this.motCleRequete = motCleRequete;
        this.contenu = contenu;
    }

    public void debut()
    {
        this.index = -1;
        this.suivant();
    }

    public void suivant()
    {
        int taille = this.contenu.size();
        this.index++;
        while((this.index < taille) && (!this.contenu.get(this.index).motCleValide(this.motCleRequete)))
        {
            this.index++;
        }
    }

    public Element item()
    {
        if (this.index < this.contenu.size())
        {
            return this.contenu.get(this.index);
        }
        else
        {
            return null;
        }
    }
}
