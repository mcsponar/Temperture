package domain;

public final class KelvinTemperatureType extends TemperatureType {

	
	private static final String SYMBOL = "K";
	private static final String KELVIN = "Kelvin";

	public KelvinTemperatureType(double value) {
		super(KELVIN, SYMBOL, value);
		
	}
	
}