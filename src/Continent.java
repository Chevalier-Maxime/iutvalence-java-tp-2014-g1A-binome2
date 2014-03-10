/* TODO Javadoc */
/* TODO Un continent ne contient pas de régions ? */
public class Continent
{
	public final String nom;
	private Region appartient[];
	
	
	public Continent(String nom, Region[] appartient){
		this.nom=nom;
		this.appartient=appartient;
		
		
	}
	
	public void ajouterRegion(Region r){
		//this.nom=nom;
		
	}
}
