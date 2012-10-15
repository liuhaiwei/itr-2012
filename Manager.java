import java.util.LinkedList;

/**
 * 
 */

/**
 * @author moreau
 * une classe Manager
 */
public class Manager extends Employe {



	/**
	 * liste des personnes sous les ordres du Manager
	 */
	private LinkedList<Employe> employes;
	
	/**
<<<<<<< HEAD
<<<<<<< HEAD
	 * sup宸杋eur hi宸朼rchique
	 * 
	 * pour le patron de l'entreprise, le sup宸杋eur vaudra null
=======
	 * sup锟絩ieur hi锟絩archique
	 * 
	 * pour le patron de l'entreprise, le sup锟絩ieur vaudra null
>>>>>>> testbranch
=======
	 * sup�rieur hi�rarchique
	 * 
	 * pour le patron de l'entreprise, le sup�rieur vaudra null
>>>>>>> 749e6d49c7bdbfb78597176b3c65dfa0d613c968
	 */
	private Manager manager;
	
	/**
	 * @return the manager
	 */
	public Manager getManager() {
		return manager;
	}

	/* (non-Javadoc)
	 * @see Employe#toString()
	 */
	@Override
	public String toString() {
		return "MANAGER "+super.toString();
	}

	/**
	 * @param manager the manager to set
	 */
	public void setManager(Manager manager) {
		this.manager = manager;
	}

	/**
<<<<<<< HEAD
	 * ajoute un employ锟斤拷la liste des gens sous les ordres du 
	 * manager
	 * @param nouveau l'employ锟斤拷ajouter
	 */


	public void ajouteEmploye(Employe nouveau) {
		// ajout � la liste des nouveaux
		this.employes.add(nouveau);
		
		// on v�rifie si nouveau est lui-m�me un Manager

		if (nouveau instanceof Manager) {
			// sous-classement
			Manager m1 = (Manager) nouveau;
			m1.setManager(this);
		}
	}
	
	/**
<<<<<<< HEAD
<<<<<<< HEAD
	 * donne le nombre d'employ宸�sous les ordres d'un manager
=======
	 * donne le nombre d'employ锟絪 sous les ordres d'un manager
>>>>>>> testbranch
=======
	 * donne le nombre d'employ�s sous les ordres d'un manager
>>>>>>> 749e6d49c7bdbfb78597176b3c65dfa0d613c968
	 */
	public int nombreEmployes() {
		int s = this.employes.size();
		for (Employe e : this.employes) {
			if (e instanceof Manager) {
				Manager m = (Manager) e;
				s += m.nombreEmployes();
			}
		}
		return s;
	}
	

	public int nombreFemme(){
		int n=0;
		for (Employe e: this.employes){
			n+= !e.isSexe()?1:0;
				if(e instanceof Manager){
					Manager t=(Manager) e;
					
					n += t.nombreFemme();
				}
			}
			
		return n;
	}

	/**
	 * compte le nombre de femmes sous la responsabillit� d'un manager
	 * @return
	 */
	public int nombreFemmes() {
		int f = 0;
		for (Employe e: this.employes) {
			if (!e.isSexe()) {
				f++;
			}
			if (e instanceof Manager) {
				Manager m = (Manager) e;
				f += m.nombreFemmes();
			}
		}
		return f;
	}
	
	/**
	 * 
	 * pourcentage de femmes sous la responsabilit� d'un manager
	 */
	float pourcentageFemmes() throws PasDEmployeException {
		int nf = nombreFemmes();
		int ne = nombreEmployes();
		if (ne == 0) {
			throw new PasDEmployeException();
		}
		float r = ((float) nf / (float) ne)*100f;
		return r;
	}
	

	/**
	 * afficher la hierarchie d'un manager sur le modele
	 * A a pour chef B
	 * B a pour chef C
	 * C a pour chef D
	 * D est le patron
	 */

	public double pourcentageFemme(){
		return (double)this.nombreFemme()/this.nombreEmployes();
	}

	void afficheHierarchie() {
		if (this.manager == null) {
			System.out.println(this.getNomComplet()+" est le patron");
		}
		else {
			System.out.println(this.manager.getNomComplet()+" est le chef de "+this.getNomComplet());
			this.manager.afficheHierarchie();
		}
	}
	
	/**
	 * @param nom
	 * @param prenom
	 * @param sexe
	 * @param anneeNaissance
	 * @param numero
	 * @param entreprise
	 */
	public Manager(String nom, String prenom, boolean sexe, int anneeNaissance,
			int numero, Entreprise entreprise) {
		super(nom, prenom, sexe, anneeNaissance, numero, entreprise);
		this.employes = new LinkedList<Employe>();
	}

}
