/* TODO Javadoc */
public class Plateau
{
	Continent continents[];
	Region    regions[];
	
	public Plateau() {
	
	 Region GrandeBretagne = new Region("Grande-Bretagne");
	 Region Islande = new Region("Islande");
	 Region EuropeDuNord = new Region("Europe du Nord");
	 Region Scandinavie = new Region("Scandinavie");
	 Region EuropeDuSud = new Region("Europe du Sud");
	 Region Ukraine = new Region("Ukraine");
	 Region EuropeOccidentale= new Region("Europe Occidentale");
	
	 Continent Europe = new Continent("Europe");

	
	Region Afghanistan = new Region("Afghanistan");
	Region Chine = new Region("Chine");
	Region Inde = new Region("Inde");
	Region Tchita = new Region("Tchita");
	Region Japon = new Region("Japon");
	Region Kamchatka = new Region("Kamchatka");
	Region MoyenOrient = new Region("Moyen-Orient");
	Region Mongolie = new Region("Mongolie");
	Region Siam = new Region("Siam");
	Region Siberie = new Region("Sibérie");
	Region Oural = new Region("Oural");
	Region Yakoutie = new Region("Yakoutie");
	
	Continent Asie = new Continent("Asie");
	
	
	Region Alaska = new Region("Alaska");
	Region Alberta = new Region("Alberta");
	Region AmeriqueCentrale = new Region("Amerique-Centrale");
	Region EtatsDeLEst = new Region("Etats de l'est");
	Region Groenland = new Region("Groenland");
	Region TerritoiresDuNordOuest = new Region("Territoires du Nord-Ouest");
	Region Ontario = new Region("Ontario");
	Region Quebec = new Region("Quebec");
	Region EtatsDeLOuest = new Region("Etats de l'ouest");
	
	Continent AmeriqueDuNord = new Continent("Amérique du Nord");
	
	
	Region Argentine = new Region("Argentine");
	Region Bresil = new Region("Brésil");
	Region Perou = new Region("Pérou");
	Region Venezuela = new Region("Venezuela");
	
	Continent AmeriqueDuSud = new Continent("Amérique du Sud");
	
	
	Region Congo = new Region("Congo");
	Region AfriqueDeLEst = new Region("Afrique de l'est");
	Region Egypte = new Region("Egypte");
	Region Madagascar = new Region("Madagascar");
	Region AfriqueDuNord = new Region("Afrique du Nord");
	Region AfriqueDuSud = new Region("Afrique du sud");
	
	Continent Afrique = new Continent("Afrique");
	

	Region AustralieOrientale = new Region("Australie Orientale");
	Region Indonesie = new Region("Indonesie");
	Region NouvelleGuinee = new Region("Nouvelle-Guinee");
	Region AustralieOccidentale = new Region("Australie Occidentale");
	
	Continent Oceanie = new Continent("Oceanie");
	
	// Voisins de  l'indonésie
	Region[] Vinde= new Region[]{NouvelleGuinee,Siam}; 	
	Indonesie.ajouterVoisins(Vinde);
	
	// Voisins de  l'australie orientale
	Region[] VAustralieOrientale= new Region[]{AustralieOccidentale,NouvelleGuinee}; 	
	AustralieOrientale.ajouterVoisins(VAustralieOrientale);
	

	// Voisins de  la nouvelle guinee
	Region[] VNouvelleGuinee= new Region[]{AustralieOccidentale,AustralieOrientale,Indonesie}; 	
	NouvelleGuinee.ajouterVoisins(VNouvelleGuinee);
	
	// Voisins de  l'australie occidentale
	Region[] VAustralieOccidentale= new Region[]{NouvelleGuinee,AustralieOrientale}; 	
	AustralieOccidentale.ajouterVoisins(VAustralieOccidentale);
	
	
	//OCEANIE								fait
	
	
	// Voisins du congo
	Region[] VCongo= new Region[]{AfriqueDeLEst,AfriqueDuNord,AfriqueDuSud}; 	
		Congo.ajouterVoisins(VCongo);
		
	
	// Voisins de l'afrique de l'est
		Region[] VAfriqueDeLEst= new Region[]{Madagascar,Egypte,Congo,AfriqueDuSud,AfriqueDuNord,MoyenOrient}; 	
		AfriqueDeLEst.ajouterVoisins(VAfriqueDeLEst);
		
		
	// Voisins de l'egypte
		Region[] VEgypte= new Region[]{AfriqueDeLEst,AfriqueDuNord,MoyenOrient,EuropeDuSud}; 	
		Egypte.ajouterVoisins(VEgypte);
		
	// Voisins de Madagascar
		Region[] VMadagascar= new Region[]{AfriqueDeLEst,AfriqueDuSud}; 	
		Madagascar.ajouterVoisins(VMadagascar);
		
	// Voisins de l'afrique du nord
		Region[] VAfriqueDuNord= new Region[]{EuropeOccidentale,Egypte,AfriqueDeLEst,Congo,Bresil}; 	
		AfriqueDuNord.ajouterVoisins(VAfriqueDuNord);
		
				
	// Voisins du sud
		Region[] VAfriqueDuSud= new Region[]{Madagascar,Congo,AfriqueDeLEst}; 	
		AfriqueDuSud.ajouterVoisins(VAfriqueDuSud);
		
		
	//AFRIQUE								fait
		
	
	// Voisin de l'alaska
		Region[] VAlaska= new Region[]{Alberta,Kamchatka,TerritoiresDuNordOuest}; 	
		Alaska.ajouterVoisins(VAlaska);
		
	// Voisin de l'alberta
		Region[] VAlberta= new Region[]{TerritoiresDuNordOuest,Alaska,Ontario,EtatsDeLOuest}; 	
		Alberta.ajouterVoisins(VAlberta);
		
	// Voisin de l'amerique centrale
		Region[] VAmeriqueCentrale= new Region[]{EtatsDeLEst,EtatsDeLOuest,Venezuela}; 	
		AmeriqueCentrale.ajouterVoisins(VAmeriqueCentrale);
		
	// Voisin du groenland
		Region[] VGroenland= new Region[]{Islande,Quebec,Ontario,TerritoiresDuNordOuest}; 	
		Groenland.ajouterVoisins(VGroenland);
		
	// Voisin des TerritoiresDuNordOuest
		Region[] VTerritoiresDuNordOuest= new Region[]{Alaska,Alberta,Ontario,Groenland}; 	
		TerritoiresDuNordOuest.ajouterVoisins(VTerritoiresDuNordOuest);
		
		
	//Voisin de l'ontario
		Region[] VOntario= new Region[]{Quebec,EtatsDeLEst,EtatsDeLOuest,Alberta,TerritoiresDuNordOuest,Groenland}; 	
		Ontario.ajouterVoisins(VOntario);
		
	// Voisin du quebec
		Region[] VQuebec= new Region[]{Groenland,Ontario,EtatsDeLEst}; 	
		Quebec.ajouterVoisins(VQuebec);
		
	// Voisin de l'EtatsDeLOuest
		Region[] VEtatsDeLOuest= new Region[]{Alberta,Ontario,EtatsDeLEst,AmeriqueCentrale}; 	
		EtatsDeLOuest.ajouterVoisins(VEtatsDeLOuest);
		
		
	//Amerique du Nord								fait	
		
		
	// Voisin de l'argentine
		Region[] VArgentine= new Region[]{Bresil,Perou}; 	
		Argentine.ajouterVoisins(VArgentine);
		
	// Voisin du brésil
		Region[] VBresil= new Region[]{AfriqueDuNord,Argentine,Perou,Venezuela}; 	
		Bresil.ajouterVoisins(VBresil);	
		
	// Voisin du pérou
		Region[] VPerou= new Region[]{Bresil,Argentine,Venezuela}; 	
		Perou.ajouterVoisins(VPerou);
		
	// Voisin de Venezuela
		Region[] VVenezuela= new Region[]{Bresil,Perou,AmeriqueCentrale}; 	
		Venezuela.ajouterVoisins(VVenezuela);
		
		
	//Amerique du Sud								  fait
		
		
		
	// Voisin de Afghanistan
		Region[] vAfghanistan= new Region[]{MoyenOrient,Inde,Chine,Oural,Ukraine}; 	
		Afghanistan.ajouterVoisins(vAfghanistan);
		
		
	// Voisin de Chine
		Region[] vChine= new Region[]{Afghanistan,Inde,Siam,Mongolie}; 	
		Chine.ajouterVoisins(vChine);
		
		
	// Voisin de Inde
		Region[] vInde= new Region[]{MoyenOrient,Chine,Siam,Afghanistan}; 	
		Inde.ajouterVoisins(vInde);
		
	// Voisin de tchita
		Region[] vTchita= new Region[]{Yakoutie,Kamchatka,Siberie,Mongolie}; 	
		Tchita.ajouterVoisins(vTchita);
		
	// Voisin de Japon
		Region[] vJapon= new Region[]{Kamchatka,Mongolie}; 	
		Japon.ajouterVoisins(vJapon);
		
	// Voisin de MoyenOrient
		Region[] vMoyenOrient= new Region[]{Afghanistan,Inde,Egypte,AfriqueDeLEst,Ukraine}; 	
		MoyenOrient.ajouterVoisins(vMoyenOrient);
				
	// Voisin de Mongolie
		Region[] vMongolie= new Region[]{Chine,Siberie,Tchita,Kamchatka,Japon}; 	
		Mongolie.ajouterVoisins(vMongolie);
		
		
	// Voisin de Oural
		Region[] vOural= new Region[]{Afghanistan,Ukraine,Chine,Siberie}; 	
		Oural.ajouterVoisins(vOural);
		
	// Voisin de Siam
		Region[] vSiam= new Region[]{Inde,Indonesie,Chine}; 	
		Siam.ajouterVoisins(vSiam);
		
	// Voisin de Siberie
		Region[] vSiberie= new Region[]{Tchita,Mongolie,Chine,Oural,Yakoutie}; 	
		Siberie.ajouterVoisins(vSiberie);
		
	// Voisin de Yakoutie
		Region[] vYakoutie= new Region[]{Afghanistan,Ukraine,Chine,Siberie}; 	
		Yakoutie.ajouterVoisins(vYakoutie);
		
	// Voisin de Kamchatka
		Region[] vKamchatka= new Region[]{Yakoutie,Mongolie,Tchita,Japon,Alaska}; 	
		Kamchatka.ajouterVoisins(vKamchatka);
		
		
		
	//Asie								  fait
		
		
 
	// Voisin de GrandeBretagne
		Region[] vGrandeBretagne= new Region[]{Islande,EuropeOccidentale,EuropeDuNord,Scandinavie}; 	
		GrandeBretagne.ajouterVoisins(vGrandeBretagne);	
		 
	// Voisin de Islande
		Region[] vIslande= new Region[]{Groenland,GrandeBretagne,Scandinavie}; 	
		Islande.ajouterVoisins(vIslande);
		
	// Voisin de EuropeDuNord
		Region[] vEuropeDuNord= new Region[]{EuropeDuSud,GrandeBretagne,Scandinavie,EuropeOccidentale,Ukraine}; 	
		EuropeDuNord.ajouterVoisins(vEuropeDuNord);
		
	// Voisin de Scandinavie
		Region[] vScandinavie= new Region[]{Islande,GrandeBretagne,EuropeDuNord,Ukraine}; 	
		Scandinavie.ajouterVoisins(vScandinavie);
		
	// Voisin de EuropeDuSud
		Region[] vEuropeDuSud= new Region[]{MoyenOrient,Egypte,EuropeOccidentale,EuropeDuNord,Ukraine}; 	
		EuropeDuSud.ajouterVoisins(vEuropeDuSud);
		
	// Voisin de Ukraine
		Region[] vUkraine= new Region[]{MoyenOrient,Afghanistan,Oural,Scandinavie,EuropeDuNord,EuropeDuSud}; 	
		Ukraine.ajouterVoisins(vUkraine);
		
	// Voisin de EuropeOccidentale
		Region[] vEuropeOccidentale= new Region[]{AfriqueDuNord,EuropeDuSud,EuropeDuNord,GrandeBretagne}; 	
		EuropeOccidentale.ajouterVoisins(vEuropeOccidentale);
		
		this.continents = new Continent[] {Afrique,Asie,AmeriqueDuNord,AmeriqueDuSud,Europe,Oceanie};
		this.regions = new Region[] {GrandeBretagne,Islande,EuropeDuNord,Scandinavie,EuropeDuSud,Ukraine,EuropeOccidentale,Afghanistan,Chine,Inde,Tchita,Japon,Kamchatka,MoyenOrient,Mongolie,Siam,Siberie,Oural,Yakoutie,Alaska,Alberta,AmeriqueCentrale,EtatsDeLOuest,Groenland,TerritoiresDuNordOuest,EtatsDeLEst,Ontario,Quebec,Argentine,Bresil,Perou,Venezuela,Congo,AfriqueDeLEst,Egypte,Madagascar,AfriqueDuNord,AfriqueDuSud,AustralieOrientale,AustralieOccidentale,Indonesie,NouvelleGuinee};
	
	}
		
}	


