
public class EntrepriseTest {
	String branch1111;
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Entreprise gouv = new Entreprise("Gouvernement Français");
		Manager fh = new Manager("Hollande","François",true, 1939,342,gouv);
		Manager jma = new Manager("Ayrault","Jean-Marc",true, 1939,787,gouv);
		fh.ajouteEmploye(jma);
		Manager db = new Manager("Batho","Delphine",false,1973,423,gouv);
		jma.ajouteEmploye(db);
		Manager gf = new Manager("Fioraso","Genevieve",false,1950,23,gouv);
		jma.ajouteEmploye(gf);
		Manager dd = new Manager("Dagot","Dimitri",true,1960,3243,gouv);
		gf.ajouteEmploye(dd);
		Employe gm = new Employe("Moreau","Guillaume",true,1973,0,gouv);
		Employe yl = new Employe("Yu","Lei",true,1973,467,gouv);
		Employe yc = new Employe("Yin","Chuantao",true,1977,9,gouv);
		Employe yd = new Employe("xxp","xxxxxp",true,1977,9,gouv);
		dd.ajouteEmploye(gm);
		dd.ajouteEmploye(yl);
		dd.ajouteEmploye(yc);
		dd.ajouteEmploye(yd);
		fh.afficheHierarchie();
		System.out.println("F. Hollande a "+fh.nombreEmployes()+" employes");
		System.out.println("D. Batho a "+db.nombreEmployes()+" employes");
		
		System.out.println("---------");
		
		jma.afficheHierarchie();

		System.out.println("---------");

		dd.afficheHierarchie();
		
		
		System.out.println(fh.nombreFemme());
		System.out.println(fh.pourcentageFemme());
	}
	public String getBranch1111() {
		return branch1111;
	}
	public void setBranch1111(String branch1111) {
		this.branch1111 = branch1111;
	}

}
