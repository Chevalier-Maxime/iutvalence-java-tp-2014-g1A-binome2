/* TODO Package. */

import java.util.Arrays;
import java.util.Comparator;

/**
 * TODO.
 *
 * @author TODO
 * @version TODO
 */
public class Region {
    /** Nom de la région. */
    public final String   nom;
    /** Taille de l'armée présente. */
    public       int      nbArmee;
    /* TODO Remplacez par des Collections pour simplifier. */
    /** Voisins. */
    public       Region[] voisins;
    /* TODO Où est la classe Joueur ? */
    /** Propriétaire. */
    public Joueur proprietaire;

    /** TODO. */
    public Region(String nom) {
        this.nom = nom;
        this.nbArmee = 0;
    }

    /** TODO. */
    public void ajouterVoisins(Region[] voisins) {
        this.voisins = voisins;
    }

    /* TODO Vous pouvez faire mieux pour le nom de la méthode. */
    /** TODO. */
    public void poserArmee(int i) {
        // TODO Peut être simplifié en "nbArmee += i;"
        this.nbArmee = nbArmee + i;
    }

    /* TODO Vous pouvez faire mieux pour le nom de la méthode. */
    /** TODO. */
    public void enleverArmee(int i) {
        // TODO Peut être simplifié en "nbArmee -= i;"
        this.nbArmee = nbArmee - i;

    }

    /** TODO. */
    public boolean estVoisin(Region r) {
        /* TODO Peut être simplifié en :
        for (Region region : voisins) {
            if (region.equals(r)) {
                return true;
            }
        }
        return false;
         */
        /* TODO Peut être encore plus simplifié avec des collections. */
        int i = 0;

        /* TODO Pour comparer des objets utilisez la méthode equals ! */
        while ((r.nom != voisins[i].nom) && (i != voisins.length)) {
            i++;
        }
        /* TODO À simplifier ! */
        if (r.nom == voisins[i].nom) { return true; }
        else { return false; }

    }

    /** TODO. */
    public boolean attaquePossible(Region regionDefensive) {
        /* TODO Peut être simplifié !!! */
        if ((this.estVoisin(regionDefensive))&&(this.nbArmee > 1))
            return true;
        return false;
    }  

    /** TODO. */
    public void attaquer(Region regionDefensive, int nbforceAttaque, int nbforceDefense) {
        if (attaquePossible(regionDefensive)) {

            /* TODO Variables inutilisées. */
            int deAttaque1, deAttaque2, deAttaque3;
            int deDefense1, deDefense2;
            /* TODO Votre code ne peut pas fonctionner si vous n'initialisez pas ces variables ! */
            int[] resultatDeAttaque = null;
            int[] resultatDeDefense = null;


            //Lance de dé d'attaques
            resultatDeAttaque[0]=De.lancer();
            if (nbforceAttaque > 1) {
            	resultatDeAttaque[1] = De.lancer();
            }
            if (nbforceAttaque > 2) {
            	resultatDeAttaque[2] = De.lancer();
            }
            

            //Lancé de dé de defenses
            resultatDeDefense[0] = De.lancer();
            if (nbforceDefense>1){
            	resultatDeDefense[1] = De.lancer();
            }

            //Trions les deux tableaux pour pouvoir les comparer
            triBulleDecroissant(resultatDeAttaque);
            triBulleDecroissant(resultatDeDefense);
            
            //Traitement du resultat des dés et mise a jour du nbr d'armées sur chaques régions.
        	int indiceTableau=0;
        	while (( indiceTableau != resultatDeAttaque.length) && (indiceTableau !=resultatDeDefense.length))
        	{
        		if (resultatDeAttaque[indiceTableau]>resultatDeDefense[indiceTableau] ) {
                    regionDefensive.enleverArmee(1);
                }
                else {
                    this.enleverArmee(1);
                }
        		indiceTableau++;
        	}
        	
        	// TODO Il manque le déplacement en fin de tour si attaquant gagne
        }
        else {
            /* TODO Ce genre de méthode ne doit pas faire de println ! C'est contre-productif ! */
            System.out.println("Vous ne pouvez pas attaquer cette région");
        }

    }
    
    public static void triBulleDecroissant(int tableau[]) {
		int longueur = tableau.length;
		int tampon = 0;
		boolean permut;
 
		do {
			// hypothèse : le tableau est trié
			permut = false;
			for (int i = 0; i < longueur - 1; i++) {
				// Teste si 2 éléments successifs sont dans le bon ordre ou non
				if (tableau[i] < tableau[i + 1]) {
					// s'ils ne le sont pas, on échange leurs positions
					tampon = tableau[i];
					tableau[i] = tableau[i + 1];
					tableau[i + 1] = tampon;
					permut = true;
				}
			}
		} while (permut);
	}
}


