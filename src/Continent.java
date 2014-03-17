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
    private final Region[] appartient;

    public Continent(String nom, Region[] appartient) {
        this.nom = nom;
        this.appartient = appartient;
    }
}
