/**
 * 
 */

/**
 * @author moreau
 *
 */
public class Employe extends Personne {

   String branch1111;
	/**
	 * num锟絩o d'employe
	 */

	/**
	 * Entreprise dans laquelle travaille l'employ锟�
=======

	/**
	 * num巖o d'employ�
	 */
	private int numero;
	
	/**
	 * Entreprise dans laquelle travaille l'employ�
>>>>>>> 749e6d49c7bdbfb78597176b3c65dfa0d613c968
	 */
	Entreprise entreprise;
	
	/**
	 * @return the entreprise
	 */
	public Entreprise getEntreprise() {
		return entreprise;
	}

	/**
	 * @param entreprise the entreprise to set
	 */
	public void setEntreprise(Entreprise entreprise) {
		this.entreprise = entreprise;
	}

	/**
	 * @return the numero
	 */
	public int getNumero() {
		return numero;
	}

	/**
	 * @param numero the numero to set
	 */
	public void setNumero(int numero) {
		this.numero = numero;
	}

	/**
	 * @param nom
	 * @param prenom
	 * @param sexe
	 * @param anneeNaissance
	 */
	public Employe(String nom, String prenom, boolean sexe, int anneeNaissance,int numero, Entreprise entreprise) {
		super(nom, prenom, sexe, anneeNaissance);
		this.numero = numero;
		this.entreprise = entreprise;
	}
	
	
	/* (non-Javadoc)
	 * @see Personne#toString()
	 */
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString()+" - travaille chez "+entreprise.getNom()+

		", numero "+this.numero;


	}

	public static void main(String[] args) {
		Entreprise comac = new Entreprise("Comac");
		Employe e1 = new Employe("Dassault","Marcel",true,1910,354,comac);
		Employe e2 = new Employe("Sarkozy","Nicolas",true,1940,335, comac);
		
		System.out.println(e1);
		System.out.println(e2);
		
	}

}
