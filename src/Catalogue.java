import java.util.ArrayList;

/**
 * Created by yassirhessane on 17/08/16.
 */
public class Catalogue {

    protected ArrayList<Element> contenu;

    public Catalogue() {
        this.contenu = new ArrayList<>();
    }

    public void ajoute(Element e)
    {
        this.contenu.add(e);
    }

    public Iterateur recherche(String motCleRequete)
    {
        Iterateur resultat = new Iterateur();
        resultat.setMotCleRequete(motCleRequete,this.contenu);
        return resultat;
    }
}
