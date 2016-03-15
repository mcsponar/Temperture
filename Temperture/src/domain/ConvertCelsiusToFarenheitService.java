package domain;

public class ConvertCelsiusToFarenheitService extends ConvertTempertureService<CelciusTempertureType, FarenheitTempertureType> {
	
	private final int OFFSET = 32;
	private final double CONVERSION = 9.0 / 5.0;
	
	public FarenheitTempertureType Convert(CelciusTempertureType temperture) {
		return new FarenheitTempertureType((temperture.getValue() * CONVERSION) + OFFSET);
	}	
}