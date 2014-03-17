import java.security.SecureRandom;

/* TODO Package. */
/* TODO JavaDoc. */
/* TODO J'ai corrigé l'indentation, pensez à le faire. */
public class De {
    /* TODO Pourquoi mettre le mot "De" dans votre nom de méthode ? Nous sommes dans la classe "De"... */
    public static int lanceDe() {
    	return new SecureRandom().nextInt(6) + 1;
    }
}
