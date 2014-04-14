package fr.iutvalence.java.tp.risk;

import java.security.SecureRandom;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Joueur
{
	private final String nomJoueur;
	private final Couleur couleur;
	private Set<Region> RegionDuJoueur; // est-ce pertinent ?
	
	public Joueur(Couleur couleur, int numeroDuJoueur, Region[] regions)
	{
		this.couleur = couleur;
		this.nomJoueur="Joueur"+numeroDuJoueur;
		this.RegionDuJoueur = new HashSet<Region>(Arrays.asList(regions));
	}
	
	public Region[] obtenirRegionDuJoueur()
	{
		//truc la
		return RegionDuJoueur.toArray(new Region[RegionDuJoueur.size()]);
	}
	
	//en travaux
	public void ajouterRegionDuJoueur(Region region)
	{
		this.RegionDuJoueur.add(region);
	}

	public Couleur obtenirCouleurJoueur()
	{
		return couleur;
	}

	public String obtenirNomJoueur()
	{
		return nomJoueur;
	}
	
	public void placerArmee(int nbArmeeAPlacer)
	{
		Region[] regionduJoueur = obtenirRegionDuJoueur();
		
		System.out.println("Vos régions sont :");
		for (int i=0;i<regionduJoueur.length;i++)
		{
			System.out.println(i+" "+regionduJoueur[i].nom+" Nombre d'armee sur la région : "+regionduJoueur[i].nbArmee);
		}
		
		while (nbArmeeAPlacer != 0)
		{
			System.out.println("Vous devez placer "+nbArmeeAPlacer+" armée(s)");
			
			Scanner sc = new Scanner(System.in);
			System.out.println("Sur quelle région voulez vous poser des troupes (numéro region) ?");
			int numeroRegion = sc.nextInt();
			
			System.out.println("Combiens d'armée voulez vous placer sur "+regionduJoueur[numeroRegion].nom+" ?");
			int nbArmeeJoueurAPlacer = sc.nextInt();
			regionduJoueur[numeroRegion].ajouterArmee(nbArmeeJoueurAPlacer);
			
			nbArmeeAPlacer=nbArmeeAPlacer-nbArmeeJoueurAPlacer;
		}
	}
	
	public int nbRenforts(Plateau plateau)
	{
		Continent[] tableauContinent = plateau.obtenirContinents();
		int nbDeRenforts = 0;
		
		
		for(int indiceContinentPlateau=0;indiceContinentPlateau<tableauContinent.length;indiceContinentPlateau++)
		{
			Region[] regionContinent = tableauContinent[indiceContinentPlateau].ObtenirRegionContinent();
			int nbRegionContinent = regionContinent.length;
			int nbRegionDuContinentJoueur = 0;
			
			for (int indiceRegionContinent=0;indiceRegionContinent<regionContinent.length;indiceRegionContinent++)
			{
				Region[] RegionDuJoueur= this.obtenirRegionDuJoueur();
				for(int indiceRegionJoueur =0; indiceRegionJoueur<RegionDuJoueur.length; indiceRegionJoueur++)
				{
					if (RegionDuJoueur[indiceRegionJoueur]==regionContinent[indiceRegionContinent])
						nbRegionDuContinentJoueur++;	
				}
			}
			
			if (nbRegionContinent == nbRegionDuContinentJoueur)
			{
				if (tableauContinent[indiceContinentPlateau].nom=="Afrique")
					nbDeRenforts=nbDeRenforts+3;
				else
					if(tableauContinent[indiceContinentPlateau].nom=="Europe")
						nbDeRenforts=nbDeRenforts+5;
					else
						if(tableauContinent[indiceContinentPlateau].nom=="Asie")
							nbDeRenforts=nbDeRenforts+7;
						else
							if(tableauContinent[indiceContinentPlateau].nom=="Amérique du Nord")
								nbDeRenforts=nbDeRenforts+5;
							else
								if(tableauContinent[indiceContinentPlateau].nom=="Amérique du Sud")
									nbDeRenforts=nbDeRenforts+2;
								else
									if(tableauContinent[indiceContinentPlateau].nom=="Oceanie")
										nbDeRenforts=nbDeRenforts+2;
								
			}	
		}
		
		nbDeRenforts=nbDeRenforts+this.obtenirRegionDuJoueur().length/3;
		
		return nbDeRenforts;
	}
	
	
}
