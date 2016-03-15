package domain;

public abstract class ConvertTempertureService<TInput extends TempertureType, TOutput extends TempertureType> {

	public abstract TOutput Convert(TInput temperture);

	
	
}
