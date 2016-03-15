package domain;

public final class FarenheitTempertureType extends TempertureType {

	
	private static final String SYMBOL = "F";
	private static final String FARENHEIT = "Farenheit";

	public FarenheitTempertureType(double value) {
		super(FARENHEIT, SYMBOL, value);
		
	}
	
}