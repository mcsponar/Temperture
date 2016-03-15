package domain;

public class ConvertFarenheitToKelvinService extends ConvertTempertureService<FarenheitTempertureType, KelvinTempertureType> {

	private static final double CONVERSION = 5.0 / 9.0;
	private static final double OFFSET = 459.67;

	@Override
	public KelvinTempertureType Convert(FarenheitTempertureType temperture) {
		return new KelvinTempertureType((temperture.getValue() + OFFSET) * CONVERSION);
	}

}
