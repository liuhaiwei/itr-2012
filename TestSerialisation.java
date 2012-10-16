import java.io.*;

public class TestSerialisation {

	public static void sauvePersonne(Personne p,String fileName) throws java.io.IOException {
		FileOutputStream fOut = new FileOutputStream(fileName); 
		ObjectOutputStream oOut = new ObjectOutputStream(fOut); 
		oOut.writeObject(p);
		oOut.flush();
		oOut.close();
		fOut.close();
	}
	
	public static Personne chargePersonne(String fileName) throws java.io.IOException, ClassNotFoundException {
		FileInputStream fichier = new FileInputStream(fileName); 
		ObjectInputStream is = new ObjectInputStream(fichier); 
		Personne p = (Personne) is.readObject();
		return p;
	}
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Entreprise gouv = new Entreprise("Gouvernement Français");
		Personne fh = new Personne("François", "Hollande",true,1939);
		Manager dd = new Manager("Dagot","Dimitri",true,1960,3243,gouv);
		dd.setContact(new ContactMail("dimitri.dagot@ecp.fr"));
		
		Employe gm = new Employe("Moreau","Guillaume",true,1973,0,gouv);
		gm.setContact(new ContactMail("guillaume.moreau@ec-nantes.fr"));
		
		Employe yl = new Employe("Yu","Lei",true,1973,467,gouv);
		Employe yc = new Employe("Yin","Chuantao",true,1977,9,gouv);
		dd.ajouteEmploye(gm);
		dd.ajouteEmploye(yl);
		dd.ajouteEmploye(yc);

		try {
			sauvePersonne(fh,"holland.ser");
			sauvePersonne(gm,"gm.ser");
			sauvePersonne(dd,"dd.ser");
			
			Personne p1 = chargePersonne("holland.ser");
			Employe egm = (Employe) chargePersonne("gm.ser");
			
			System.out.println(p1.getNomComplet());
			System.out.println(egm.getNomComplet());
			
			
		}
		catch(IOException e) {
			System.out.println("Erreur d'écriture sur le disque : "+e.getMessage());
		}
		catch(ClassNotFoundException e) {
			System.out.println("Classe inconnue");
		}
	}

}
