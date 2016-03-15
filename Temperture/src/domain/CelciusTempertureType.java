package domain;

public final class CelciusTempertureType extends TempertureType {

	
	private static final String SYMBOL = "C";
	private static final String CELCIUS = "Celcius";

	public CelciusTempertureType(double value) {
		super(CELCIUS, SYMBOL, value);
		
	}
	
}