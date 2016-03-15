package domain;

public final class CelciusTemperatureType extends TemperatureType {

	
	private static final String SYMBOL = "C";
	private static final String CELCIUS = "Celcius";

	public CelciusTemperatureType(double value) {
		super(CELCIUS, SYMBOL, value);
		
	}
	
}