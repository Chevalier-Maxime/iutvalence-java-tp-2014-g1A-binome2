/* TODO Javadoc */
public class Plateau {
    Continent continents[];
    Region    regions[];

    public Plateau() {
        Region GrandeBretagne = new Region("Grande-Bretagne");
        Region Islande = new Region("Islande");
        Region EuropeDuNord = new Region("Europe du Nord");
        Region Scandinavie = new Region("Scandinavie");
        Region EuropeDuSud = new Region("Europe du Sud");
        Region Ukraine = new Region("Ukraine");
        Region EuropeOccidentale = new Region("Europe Occidentale");

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
        Indonesie.ajouterVoisins(new Region[]{NouvelleGuinee, Siam});
        // Voisins de  l'australie orientale
        AustralieOrientale.ajouterVoisins(new Region[]{AustralieOccidentale, NouvelleGuinee});
        // Voisins de  la nouvelle guinee
        NouvelleGuinee.ajouterVoisins(new Region[]{AustralieOccidentale, AustralieOrientale, Indonesie});
        // Voisins de  l'australie occidentale
        AustralieOccidentale.ajouterVoisins(new Region[]{NouvelleGuinee, AustralieOrientale});
        //OCEANIE								fait


        // Voisins du congo
        Congo.ajouterVoisins(new Region[]{AfriqueDeLEst, AfriqueDuNord, AfriqueDuSud});
        // Voisins de l'afrique de l'est
        AfriqueDeLEst.ajouterVoisins(new Region[]{Madagascar, Egypte, Congo, AfriqueDuSud, AfriqueDuNord, MoyenOrient});
        // Voisins de l'egypte
        Egypte.ajouterVoisins(new Region[]{AfriqueDeLEst, AfriqueDuNord, MoyenOrient, EuropeDuSud});
        // Voisins de Madagascar
        Madagascar.ajouterVoisins(new Region[]{AfriqueDeLEst, AfriqueDuSud});
        // Voisins de l'afrique du nord
        AfriqueDuNord.ajouterVoisins(new Region[]{EuropeOccidentale, Egypte, AfriqueDeLEst, Congo, Bresil});
        // Voisins du sud
        AfriqueDuSud.ajouterVoisins(new Region[]{Madagascar, Congo, AfriqueDeLEst});
        //AFRIQUE								fait

        // Voisin de l'alaska
        Alaska.ajouterVoisins(new Region[]{Alberta, Kamchatka, TerritoiresDuNordOuest});
        // Voisin de l'alberta
        Alberta.ajouterVoisins(new Region[]{TerritoiresDuNordOuest, Alaska, Ontario, EtatsDeLOuest});
        // Voisin de l'amerique centrale
        AmeriqueCentrale.ajouterVoisins(new Region[]{EtatsDeLEst, EtatsDeLOuest, Venezuela});
        // Voisin du groenland
        Groenland.ajouterVoisins(new Region[]{Islande, Quebec, Ontario, TerritoiresDuNordOuest});
        // Voisin des TerritoiresDuNordOuest
        TerritoiresDuNordOuest.ajouterVoisins(new Region[]{Alaska, Alberta, Ontario, Groenland});
        //Voisin de l'ontario
        Ontario.ajouterVoisins(new Region[]{Quebec, EtatsDeLEst, EtatsDeLOuest, Alberta, TerritoiresDuNordOuest, Groenland});
        // Voisin du quebec
        Quebec.ajouterVoisins(new Region[]{Groenland, Ontario, EtatsDeLEst});
        // Voisin de l'EtatsDeLOuest
        EtatsDeLOuest.ajouterVoisins(new Region[]{Alberta, Ontario, EtatsDeLEst, AmeriqueCentrale});
        // Amerique du Nord								fait


        // Voisin de l'argentine
        Argentine.ajouterVoisins(new Region[]{Bresil, Perou});
        // Voisin du brésil
        Bresil.ajouterVoisins(new Region[]{AfriqueDuNord, Argentine, Perou, Venezuela});
        // Voisin du pérou
        Perou.ajouterVoisins(new Region[]{Bresil, Argentine, Venezuela});
        // Voisin de Venezuela
        Venezuela.ajouterVoisins(new Region[]{Bresil, Perou, AmeriqueCentrale});
        //Amerique du Sud								  fait


        // Voisin de Afghanistan
        Afghanistan.ajouterVoisins(new Region[]{MoyenOrient, Inde, Chine, Oural, Ukraine});
        // Voisin de Chine
        Chine.ajouterVoisins(new Region[]{Afghanistan, Inde, Siam, Mongolie});
        // Voisin de Inde
        Inde.ajouterVoisins(new Region[]{MoyenOrient, Chine, Siam, Afghanistan});
        // Voisin de tchita
        Tchita.ajouterVoisins(new Region[]{Yakoutie, Kamchatka, Siberie, Mongolie});
        // Voisin de Japon
        Japon.ajouterVoisins(new Region[]{Kamchatka, Mongolie});
        // Voisin de MoyenOrient
        MoyenOrient.ajouterVoisins(new Region[]{Afghanistan, Inde, Egypte, AfriqueDeLEst, Ukraine});
        // Voisin de Mongolie
        Mongolie.ajouterVoisins(new Region[]{Chine, Siberie, Tchita, Kamchatka, Japon});
        // Voisin de Oural
        Oural.ajouterVoisins(new Region[]{Afghanistan, Ukraine, Chine, Siberie});
        // Voisin de Siam
        Siam.ajouterVoisins(new Region[]{Inde, Indonesie, Chine});
        // Voisin de Siberie
        Siberie.ajouterVoisins(new Region[]{Tchita, Mongolie, Chine, Oural, Yakoutie});
        // Voisin de Yakoutie
        Yakoutie.ajouterVoisins(new Region[]{Afghanistan, Ukraine, Chine, Siberie});
        // Voisin de Kamchatka
        Kamchatka.ajouterVoisins(new Region[]{Yakoutie, Mongolie, Tchita, Japon, Alaska});
        //Asie								  fait

        // Voisin de GrandeBretagne
        GrandeBretagne.ajouterVoisins(new Region[]{Islande, EuropeOccidentale, EuropeDuNord, Scandinavie});
        // Voisin de Islande
        Islande.ajouterVoisins(new Region[]{Groenland, GrandeBretagne, Scandinavie});
        // Voisin de EuropeDuNord
        EuropeDuNord.ajouterVoisins(new Region[]{EuropeDuSud, GrandeBretagne, Scandinavie, EuropeOccidentale, Ukraine});
        // Voisin de Scandinavie
        Scandinavie.ajouterVoisins(new Region[]{Islande, GrandeBretagne, EuropeDuNord, Ukraine});
        // Voisin de EuropeDuSud
        EuropeDuSud.ajouterVoisins(new Region[]{MoyenOrient, Egypte, EuropeOccidentale, EuropeDuNord, Ukraine});
        // Voisin de Ukraine
        Ukraine.ajouterVoisins(new Region[]{MoyenOrient, Afghanistan, Oural, Scandinavie, EuropeDuNord, EuropeDuSud});
        // Voisin de EuropeOccidentale
        EuropeOccidentale.ajouterVoisins(new Region[]{AfriqueDuNord, EuropeDuSud, EuropeDuNord, GrandeBretagne});

        this.continents = new Continent[]{Afrique, Asie, AmeriqueDuNord, AmeriqueDuSud, Europe, Oceanie};
        this.regions = new Region[]{GrandeBretagne, Islande, EuropeDuNord, Scandinavie, EuropeDuSud, Ukraine, EuropeOccidentale, Afghanistan, Chine, Inde, Tchita, Japon, Kamchatka, MoyenOrient, Mongolie, Siam, Siberie, Oural, Yakoutie, Alaska, Alberta, AmeriqueCentrale, EtatsDeLOuest, Groenland, TerritoiresDuNordOuest, EtatsDeLEst, Ontario, Quebec, Argentine, Bresil, Perou, Venezuela, Congo, AfriqueDeLEst, Egypte, Madagascar, AfriqueDuNord, AfriqueDuSud, AustralieOrientale, AustralieOccidentale, Indonesie, NouvelleGuinee};

    }
}
