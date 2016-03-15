package domain;

public class ConvertFahrenheitToCelsiusService extends ConvertTemperatureService<FarenheitTemperatureType, CelciusTemperatureType> {

	private final int OFFSET = 32;
	private final double CONVERSION = 5.0 / 9.0 ;
	
	public CelciusTemperatureType Convert(FarenheitTemperatureType temperture) {
		return new CelciusTemperatureType((temperture.getValue() - OFFSET) * CONVERSION);
	}

}