/**
 * 
 */

/**
 * @author moreau
 *
 */
public class Entreprise {
	String branch1111;
	/**
	 * nom de l'entreprise
	 */
	private String nom;

	public String getBranch1111() {
		return branch1111;
	}

	public void setBranch1111(String branch1111) {
		this.branch1111 = branch1111;
	}

	/**
	 * @return the nom
	 */
	public String getNom() {
		return nom;
	}

	/**
	 * @param nom the nom to set
	 */
	public void setNom(String nom) {
		this.nom = nom;
	}
	
	/**
	 * constructeur qui crée une entreprise
	 */
	public Entreprise(String nom) {
		this.nom = nom;
	}
}
