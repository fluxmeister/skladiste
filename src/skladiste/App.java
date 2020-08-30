package skladiste;

public class App {

	public static void main(String[] args) {


		Skladiste s = new Skladiste(60, 3);
		
		Sanduk s1 = new Sanduk(5000, 1, 2, 3);
		
		Bure b1 = new Bure(2000, 1, 2);

		
		System.out.println("Trenutna zarada skladišta " + s.zarada());
		System.out.println("Trenutna zapremina u skladištu " + s.trenutna_v());
		

		s.add(b1);
		System.out.println("Trenutna zarada skladišta " + s.zarada());
		System.out.println("Trenutna zapremina u skladištu " + s.trenutna_v());
		System.out.println("Preostala zapremina je " + s.preostala_v());
		System.out.println("Trenutno artikala " + s.trenutno_u_magacinu());
		
		s.add(s1);
		System.out.println("Trenutna zarada skladišta " + s.zarada());
		System.out.println("Trenutna zapremina u skladištu " + s.trenutna_v());
		System.out.println("Preostala zapremina je " + s.preostala_v());
		System.out.println("Trenutno artikala " + s.trenutno_u_magacinu());

		
		s.prodaja(1);
		System.out.println("Trenutna zarada skladišta " + s.zarada());
		System.out.println("Trenutna zapremina u skladištu " + s.trenutna_v());
		System.out.println("Preostala zapremina je " + s.preostala_v());
		System.out.println("Trenutno artikala " + s.trenutno_u_magacinu());
		
		s.prodaja(5);

	}

}
