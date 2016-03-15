package domain;

public class ConvertFahrenheitToCelsiusService extends ConvertTempertureService<FarenheitTempertureType, CelciusTempertureType> {

	private final int OFFSET = 32;
	private final double CONVERSION = 5.0 / 9.0 ;
	
	public CelciusTempertureType Convert(FarenheitTempertureType temperture) {
		return new CelciusTempertureType((temperture.getValue() - OFFSET) * CONVERSION);
	}

}