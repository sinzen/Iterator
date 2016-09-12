public class Main {

    public static void main(String[] args) {
        //System.out.println("Hello World!");

        Catalogue catalogue = new Catalogue();
        catalogue.ajoute(new Vehicule("véhicule bon marché"));
        catalogue.ajoute(new Vehicule("petit véhicule bon marché"));
        catalogue.ajoute(new Vehicule("véhicule grande qualité"));
        Iterateur iterateur = catalogue.recherche("bon marché");

        iterateur.debut();
        Vehicule vehicule = (Vehicule) iterateur.item();

        while(vehicule != null)
        {
            vehicule.affiche();
            iterateur.suivant();
            vehicule = (Vehicule) iterateur.item();
        }

    }
}
