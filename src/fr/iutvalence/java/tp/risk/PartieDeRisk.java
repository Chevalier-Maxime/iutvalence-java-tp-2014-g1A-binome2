package fr.iutvalence.java.tp.risk;

public class PartieDeRisk
{
	private final Plateau plateau;
	private int nombreDeJoueurs;
	private final Joueur[] joueursDeLaPartie;
	
	
	
	public PartieDeRisk(int nombreDeJoueurs)
	{
		this.plateau = new Plateau();
		this.nombreDeJoueurs = nombreDeJoueurs;
		this.joueursDeLaPartie = new Joueur[nombreDeJoueurs];
		//Demander le nombre de joueur
		
		for(int numeroDuJoueur = 0; numeroDuJoueur<this.nombreDeJoueurs; numeroDuJoueur++)
		{
			joueursDeLaPartie[numeroDuJoueur] = new Joueur(Couleur.values()[numeroDuJoueur], numeroDuJoueur,plateau.obtenirRegion(2));
		}
		
		
	}
	
	public void jouer()
	{
		System.out.println("...");
	}
	
}
