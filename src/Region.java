/* TODO Package. */
/* TODO JavaDoc. */
public class Region {
    public final String   nom;
    public       int      nbArmee;
    /* TODO Change en cours de partie ? */
    public       Region[] voisins;

    public Region(String nom) {
        this.nom = nom;
        this.nbArmee = 0;
    }

    public void ajouterVoisins(Region[] voisins) {
        this.voisins = voisins;
    }

    /* TODO À quoi sert le parametre "nomRegion" ? */
    public void poserArmee(Region nomRegion, int i) {
        // TODO Peut être simplifié en "nbArmee -= i;"
        this.nbArmee = nbArmee + i;

    }

    /* TODO À quoi sert le parametre "nomRegion" ? */
    public void enleverArmee(Region nomRegion, int i) {
        // TODO Peut être simplifié en "nbArmee -= i;"
        this.nbArmee = nbArmee - i;

    }

    public boolean estVoisin(Region r) {
        /* TODO Peut être simplifié en :
        for (Region region : voisins) {
            if (region.equals(r)) {
                return true;
            }
        }
        return false;
         */
        int i = 0;

        while ((r.nom != voisins[i].nom) && (i != voisins.length)) {
            i++;
        }
        if (r.nom == voisins[i].nom) { return true; }
        else { return false; }

    }

    public boolean attaquePossible(Region regionDefensive) {
        /* TODO Peut être simplifié !!! */
        if (this.estVoisin(regionDefensive)) {
            if (this.nbArmee > 1) { return true; }
            else { return false; }
        }
        else { return false; }
    }

    public void attaquer(Region regionDefensive, int nbforceAttaque, int nbforceDefense) {
        if (attaquePossible(regionDefensive)) {

            int deAttaque1, deAttaque2, deAttaque3;
            int deDefense1, deDefense2;


            //Lance de dé d'attaques

            if (nbforceAttaque == 1) { deAttaque1 = De.lanceDe(); }
            else {
                if (nbforceAttaque == 2) {
                    deAttaque1 = De.lanceDe();
                    deAttaque2 = De.lanceDe();
                }
                else {
                    deAttaque1 = De.lanceDe();
                    deAttaque2 = De.lanceDe();
                    deAttaque3 = De.lanceDe();
                }
            }

            //Lancé de dé de defenses

            if (nbforceDefense == 1) { deDefense1 = De.lanceDe(); }
            else {
                deDefense1 = De.lanceDe();
                deDefense2 = De.lanceDe();
            }


        }

    }
}


