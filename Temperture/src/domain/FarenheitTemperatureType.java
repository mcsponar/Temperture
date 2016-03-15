package domain;

public final class FarenheitTemperatureType extends TemperatureType {

	
	private static final String SYMBOL = "F";
	private static final String FARENHEIT = "Farenheit";

	public FarenheitTemperatureType(double value) {
		super(FARENHEIT, SYMBOL, value);
		
	}
	
}