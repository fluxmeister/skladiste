package skladiste;

public class Sanduk extends Proizvod {

	double a, b, c;
	
	public Sanduk(double price, double a, double b, double c) {
		super(price);
		this.a = a;
		this.b = b;
		this.c = c;
	}
	
	@Override
	public char getType() {
		return 'S';
	}
	
	@Override
	public double zapremina() {
		return a*b*c;
	}
	
	@Override
	public String toString() {
		return super.toString() + ", (" + a + ", " + b + ", " + c + ") "
				+ "sa zapreminom " + zapremina() + " i cenom " + super.getPrice();
	}
	
}
