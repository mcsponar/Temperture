package domain;

public class ConvertCelsiusToFarenheitService extends ConvertTemperatureService<CelciusTemperatureType, FarenheitTemperatureType> {
	
	private final int OFFSET = 32;
	private final double CONVERSION = 9.0 / 5.0;
	
	public FarenheitTemperatureType Convert(CelciusTemperatureType temperture) {
		return new FarenheitTemperatureType((temperture.getValue() * CONVERSION) + OFFSET);
	}	
}