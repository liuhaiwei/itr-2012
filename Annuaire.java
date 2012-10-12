import java.util.*;

public class Annuaire {
	private List<Contactable> ann;
	
	public Annuaire() {
		this.ann = new LinkedList<Contactable>();
	}
	
	public void ajouter(Contactable c) {
		this.ann.add(c);
	}
}
