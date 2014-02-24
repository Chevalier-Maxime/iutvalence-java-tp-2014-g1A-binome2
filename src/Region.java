/* TODO Javadoc. */
public class Region
{
	public final String nom;
	public final int nbArmee;
	public Region[] voisins;
	
	public Region(String nom){
		this.nom=nom;
		this.nbArmee=0;
	}
	

	
	
	public void ajouterVoisins(Region[] voisins) {
		
		this.voisins=voisins ;		// a verifier
			
	}
}


