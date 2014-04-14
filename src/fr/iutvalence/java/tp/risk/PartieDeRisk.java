package fr.iutvalence.java.tp.risk;

public class PartieDeRisk
{
	private final Plateau plateau;
	private int nombreDeJoueurs;
	private final Joueur[] joueursDeLaPartie;
	private final int nbRenfortPremierTour;
	
	
	
	public PartieDeRisk(int nombreDeJoueurs)
	{
		this.plateau = new Plateau();
		this.nombreDeJoueurs = nombreDeJoueurs;
		this.joueursDeLaPartie = new Joueur[nombreDeJoueurs];
		
		
		int[] total = new int[6];
		
		switch (nombreDeJoueurs)
		{
			case 2 :
				total[0] =21;
				total[1]= 21;
				this.nbRenfortPremierTour=40;
				break;
				
			case 3 :
				total[0] =14;
				total[1]= 14;
				total[2] =14;
				this.nbRenfortPremierTour=35;
				break;
				
			case 4 :
				total[0] =10;
				total[1]= 10;
				total[2] =11;
				total[3]= 11;
				this.nbRenfortPremierTour=30;
				break;
				
			case 5 :
				total[0]=8;
				total[1]=8;
				total[2]=8;
				total[3]=9;
				total[4]=9;
				this.nbRenfortPremierTour=25;
				break;
				
			case 6:
				total[0]=7;
				total[1]=7;
				total[2]=7;
				total[3]=7;
				total[4]=7;
				total[5]=7;
				this.nbRenfortPremierTour=20;
				break;
				
			default:
				System.out.println("Le nombre de joueur doit être compris entre 2 et 6.");
				this.nbRenfortPremierTour=0;
		}
		
		
		for(int numeroDuJoueur = 0; numeroDuJoueur<this.nombreDeJoueurs; numeroDuJoueur++)
		{
			joueursDeLaPartie[numeroDuJoueur] = new Joueur(Couleur.values()[numeroDuJoueur], numeroDuJoueur,plateau.obtenirRegion(total[numeroDuJoueur]));
			
		}
		
		
	}
	
	public void jouer()
	{
		
		System.out.println("...");
		
		//1er Tour
		for(int numeroDuJoueur = 0; numeroDuJoueur<this.nombreDeJoueurs; numeroDuJoueur++)
		{
			System.out.println();
			System.out.println("C'est le tour de "+joueursDeLaPartie[numeroDuJoueur].obtenirNomJoueur());
			joueursDeLaPartie[numeroDuJoueur].placerArmee(nbRenfortPremierTour);
		}
		
		
		
		
		
	}
	
}
