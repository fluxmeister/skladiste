package skladiste;

public class Bure extends Proizvod {

	double r, h;
	
	public Bure (double price, double r, double h) {
		super(price);
		this.h = h;
		this.r = r;
	}
	
	@Override
	public char getType() {
		return 'B';
	}
	
	@Override
	public double zapremina() {
		return r*r*3.14*h;
	}
	
	@Override
	public String toString() {
		return super.toString() + ", (" + r + ", " + h + "), sa zapreminom " + zapremina() + " i cenom " + super.getPrice();
	}
	
}
