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
		
		int[] total = new int[6];
		
		switch (nombreDeJoueurs)
		{
			case 2 :
				total[0] =21;
				total[1]= 21;
			case 3 :
				total[0] =14;
				total[1]= 14;
				total[2] =14;
			case 4 :
				total[0] =10;
				total[1]= 10;
				total[2] =11;
				total[3]= 11;
				
			
				
		}
		
		for(int numeroDuJoueur = 0; numeroDuJoueur<this.nombreDeJoueurs; numeroDuJoueur++)
		{
			joueursDeLaPartie[numeroDuJoueur] = new Joueur(Couleur.values()[numeroDuJoueur], numeroDuJoueur,plateau.obtenirRegion(total[numeroDuJoueur]));
			for(int i=0; joueursDeLaPartie[numeroDuJoueur].obtenirRegionDuJoueur().length >i; i++)
			{
				System.out.println("la region "+joueursDeLaPartie[numeroDuJoueur].obtenirRegionDuJoueur()[i].nom+" est attribuer");
			}
		}
		
		
	}
	
	public void jouer()
	{
		System.out.println("...");
	}
	
}
