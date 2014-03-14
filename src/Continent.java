/* TODO Package. */
/* TODO JavaDoc. */

/**
 * Modélisation d'un continent.
 *
 * @author TODO
 * @version TODO
 */
public class Continent {
    public final String   nom;
    /* TODO Est-ce que cela change en cours de route ? */
    private      Region[] appartient;

    public Continent(String nom, Region[] appartient) {
        this.nom = nom;
        this.appartient = appartient;
    }

    public void ajouterRegion(Region r) {
        /* TODO Vide ? */
        //this.nom=nom;
    }
}
