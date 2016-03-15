package domain;

public class ConvertFarenheitToKelvinService extends ConvertTemperatureService<FarenheitTemperatureType, KelvinTemperatureType> {

	private static final double CONVERSION = 5.0 / 9.0;
	private static final double OFFSET = 459.67;

	@Override
	public KelvinTemperatureType Convert(FarenheitTemperatureType temperture) {
		return new KelvinTemperatureType((temperture.getValue() + OFFSET) * CONVERSION);
	}

}
