package domain;

public class ConvertCelsiusToFarenheitService extends ConvertTempertureService {
	
	private final int OFFSET = 32;
	private final float CONVERSION = 9/5;
	
	public double Convert(int temperture) {
		return (int) (temperture * CONVERSION) + OFFSET;
	}
}