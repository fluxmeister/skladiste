package skladiste;

public class App {

	public static void main(String[] args) {
		
		Skladiste s = new Skladiste (60, 3);
		
		Sanduk s1 = new Sanduk(5000, 1, 2, 3);
		Bure b1 = new Bure(2000, 1, 2);
		
		System.out.println("Trenutna zarada skladišta " + s.zarada());
		
	}

}
