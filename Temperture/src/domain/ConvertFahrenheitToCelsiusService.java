package domain;

public class ConvertFahrenheitToCelsiusService extends ConvertTempertureService {

	private final int OFFSET = 32;
	private final double CONVERSION = 5.0 / 9.0 ;
	
	public double Convert(int temperture) {
		return (temperture - OFFSET) * CONVERSION;
	}

}