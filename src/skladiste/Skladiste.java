package skladiste;

import java.util.ArrayList;

public class Skladiste {

	ArrayList<Proizvod> magacin;
	private final int kapacitet;
	private final double max_zapremina;
	
	public Skladiste(double max_zapremina, int kapacitet) {
		this.max_zapremina = max_zapremina;
		this.kapacitet = kapacitet;
		
		magacin = new ArrayList();
	}
	
	public int trenutno_u_magacinu() {
		return magacin.size();
	}
	
	public int max_br_proizvda() {
		return kapacitet;
	}
	
	public double trenutna_v() {
		double V = 0;
		for(Proizvod p : magacin) {
			V += p.zapremina();
		}
		return V;
	}
	
	public double preostala_v() {
		return max_zapremina - trenutna_v();
	}
	
	public double zarada() {
		double income = 0;
		for(Proizvod p:magacin) {
			income += p.getPrice();
		}
		return income*0.2;
	}
	
	public void add(Proizvod p) {
		if((magacin.size()<kapacitet)&&(trenutna_v()+p.zapremina()<max_zapremina)) {
			magacin.add(p);
			
		}
		else {
			System.out.println("Skladište je puno.");
		}
	}
	
	public void ispis() {
		for(Proizvod p:magacin) {
			System.out.println(p);
		}
	}
	
	public void prodaja(int i) {
		if(i>-1 && i<magacin.size()) {
			magacin.remove(i);
			System.out.println("Uspešna prodaja.");
		}
		else {
			System.out.println("Neuspešna prodaja.");
		}
	}
	
}
