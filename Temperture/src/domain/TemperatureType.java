package domain;

/*
 * This class will act as the base class for temperatures.
 */
public abstract class TemperatureType {

	private static final double MIN_RANGE_ACCEPTABLE = -0.0001;
	private static final double MAX_RANGE_ACCEPTABLE = 0.0001;
	private String name;
	private String unit;
	private double value;
	
	protected TemperatureType(String name, String unit, double value) {
		this.name = name;
		this.unit = unit;
		this.value = value;
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @return the unit
	 */
	public String getUnit() {
		return unit;
	}
	
	/**
	 * @return the value
	 */
	public double getValue() {
		return value;
	}
	
	/**
	 * Set @param value
	 */
	public void setValue(double value) {
		this.value = value;
	}

	@Override
	public boolean equals(Object obj) {
		return this.equals((TemperatureType) obj);
	}
	
	public boolean equals(TemperatureType obj) {
		
		double delta = this.value - obj.value;
		
		boolean areEqual = (delta < MAX_RANGE_ACCEPTABLE && delta > MIN_RANGE_ACCEPTABLE) && this.unit.equalsIgnoreCase(obj.unit);
		
		return areEqual;
		
	}
	
}


