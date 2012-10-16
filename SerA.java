import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;


public class SerA {
	protected int x;
	protected int y;
}

class SerB extends SerA implements java.io.Serializable {
	protected int c;
	
}

class SerTest {
	public static void main(String[] args) throws java.io.IOException,ClassNotFoundException {
		SerB s = new SerB();
		s.x = 9; s.y = 12; s.c = -2;
		FileOutputStream fOut = new FileOutputStream("serB.ser"); 
		ObjectOutputStream oOut = new ObjectOutputStream(fOut); 
		oOut.writeObject(s);
		oOut.flush();
		oOut.close();
		fOut.close();

		// recharger le tout
		FileInputStream fichier = new FileInputStream("serB.ser"); 
		ObjectInputStream is = new ObjectInputStream(fichier); 
		SerB p = (SerB) is.readObject();
		System.out.println(s.x);
		System.out.println(s.y);
		System.out.println(s.c);
		
		
	}
}