package fr.iutvalence.java.tp.risk;


/**
 * @package fr.iutvalence.java.tp.risk
 */

import java.security.SecureRandom;


/**
 * Permet d'obtenir une simulation de lancé de dé.
 * 
 * @author strategeek et Chevalier-Maxime
 */

public class De
{
	/**
	 * Permet de renvoyer un entier entre 1 et 6
	 * @return un entier entre 1 et 6
	 */
	public static int lancer()
	{
		return new SecureRandom().nextInt(6) + 1;
	}
}
