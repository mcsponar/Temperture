package domain;

public abstract class ConvertTemperatureService<TInput extends TemperatureType, TOutput extends TemperatureType> {

	public abstract TOutput Convert(TInput temperture);

	
	
}
