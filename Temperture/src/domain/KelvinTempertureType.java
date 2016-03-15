package domain;

public final class KelvinTempertureType extends TempertureType {

	
	private static final String SYMBOL = "K";
	private static final String KELVIN = "Kelvin";

	public KelvinTempertureType(double value) {
		super(KELVIN, SYMBOL, value);
		
	}
	
}