import java.util.*;

public class Annuaire {
	private List<Contactable> ann;
	
	public Annuaire() {
		this.ann = new LinkedList<Contactable>();
	}
	
	public void ajouter(Contactable c) {
		this.ann.add(c);
	}
	
	public Contact chercher(String nom) {
		Contact c = null;
		for (Contactable x : this.ann) {
			if (nom.equals(x.getNom())) {
				c = x.getContact();
				break;
			}
		}
		return c;
	}
}
