package fr.iutvalence.java.tp.risk;
/* TODO Package. */

import java.security.SecureRandom;
import java.util.Arrays;
import java.util.Collections;
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
    public void ajouterArmee(int i) {
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
        
        if (!(r.nom == voisins[i].nom))
        	return false;
        return true;

    }

    /** TODO. */
    public boolean attaquePossible(Region regionDefensive) {
        /* TODO Peut être simplifié !!! */
        if ((this.estVoisin(regionDefensive))&&(this.nbArmee > 1))
            return true;
        return false;
    }  

    /** TODO. 
     * @return */
    public boolean attaquer(Region regionDefensive, int nbforceAttaque, int nbforceDefense) {
        if (attaquePossible(regionDefensive)) {


            
            Integer[] resultatDeAttaque = null;
            resultatDeAttaque= new Integer[3];
            
            Integer[] resultatDeDefense = null;
            resultatDeDefense = new Integer[2];
            


            /* TODO Pourquoi ne pas rajouter une méthode dédiée dans la classe "De" ? */
            /* TODO Ca pourrait être une méthode comme int[] lancer(int nombreDe) */
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
            Arrays.sort(resultatDeAttaque, 0, resultatDeAttaque.length, Collections.reverseOrder());
            Arrays.sort(resultatDeDefense, 0, resultatDeDefense.length, Collections.reverseOrder());

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
        	
        	return true;
        	
        	// TODO Il manque le déplacement en fin de tour si attaquant gagne
        }
        else {
            return false;
        }

    }
    
    public void attribuerRegion(Joueur joueur, int nombreDeJoueur, Plateau plateau )
    {
    	Region[] toutesLesRegions = plateau.obtenirToutesLesRegions();
    	int nbRegionAAtribuer = toutesLesRegions.length/nombreDeJoueur;
    	
    	for(int nbRegionAtribuer = 0; nbRegionAtribuer<=nbRegionAAtribuer; nbRegionAtribuer++)
    	{
    		int indiceRegion = new SecureRandom().nextInt(toutesLesRegions.length) + 1;
    		
    		while (toutesLesRegions[indiceRegion]==null)
    		{
    			indiceRegion = new SecureRandom().nextInt(toutesLesRegions.length) + 1;
    		}
    		
    		toutesLesRegions[indiceRegion].proprietaire = joueur;
    		joueur.obtenirRegionDuJoueur()
    		toutesLesRegions[indiceRegion]=null;
    		
    		
    	}
    	
    	
    	
    }
}


