package skladiste;

public abstract class Proizvod {

	private static int count = 0;
	private final int ID = count++;
	private double cena;
	
	public Proizvod(double cena) {
		this.cena = cena;
	}
	
	public abstract char getType();
	
	public abstract double zapremina();
	
	public double getPrice() {
		return cena;
	}
	
	public int getID() {
		return ID;
	}
	
	@Override
	public String toString() {
		return getType() + ", " + getID();
	}
}
