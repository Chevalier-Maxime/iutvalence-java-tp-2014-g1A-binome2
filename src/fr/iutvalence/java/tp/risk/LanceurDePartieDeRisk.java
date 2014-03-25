package fr.iutvalence.java.tp.risk;

public class LanceurDePartieDeRisk
{

	public static void main(String[] args)
	{
		System.out.println("Creation de la partie");
		PartieDeRisk partieDeRisk = new PartieDeRisk();
		System.out.println("Démarrage de la partie");
		partieDeRisk.jouer();
		System.out.println("Fin de la partie");

	}

}
