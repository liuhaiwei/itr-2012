
public class Singleton {
	private static Singleton instance = null;
	
	// la présence de synchronized est obligatoire pour gérer les threads!
	synchronized public static Singleton getInstance() {
		if (instance != null) {
			return instance;
		}
		else {
			instance = new Singleton();
			return instance;
		}
	}
	
	private Singleton() {
		// fait le travail normal d'un constructeur
		System.out.println("1 instance");
	}

	public static void main(String[] args) {
		for (int i=0 ; i<101 ; i++) {
			new Singleton();
		}
	}
	
}
