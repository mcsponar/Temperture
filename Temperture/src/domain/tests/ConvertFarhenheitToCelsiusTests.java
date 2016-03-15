package domain.tests;
import java.util.Arrays;

import domain.CelciusTemperatureType;
import domain.ConvertFahrenheitToCelsiusService;
import domain.FarenheitTemperatureType;
import domain.TemperatureType;
import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

@RunWith(value = Parameterized.class)
public class ConvertFarhenheitToCelsiusTests {

	private ConvertFahrenheitToCelsiusService service;
	private TemperatureType temperture;
	private TemperatureType expected;
	
	
	public ConvertFarhenheitToCelsiusTests(TemperatureType temperture, TemperatureType expected){
		this.temperture = temperture;
		this.expected = expected;
	}
	
	@Before
	public void setUp() throws Exception {
		service = new ConvertFahrenheitToCelsiusService();
	}

	@After
	public void tearDown() throws Exception {
	}

	//Declares parameters here
	@Parameters(name = "{index}: convert({0})={1}")
	public static Iterable<Object[]> data1() {
		return Arrays.asList(new Object[][] { 
			{ new FarenheitTemperatureType(-10), new CelciusTemperatureType(-23.3333)}, 
			{ new FarenheitTemperatureType(0), new CelciusTemperatureType(-17.7777)}, 
			{ new FarenheitTemperatureType(10), new CelciusTemperatureType(-12.2222)}, 
			{ new FarenheitTemperatureType(30), new CelciusTemperatureType(-1.1111)},
			{ new FarenheitTemperatureType(-30), new CelciusTemperatureType(-34.4444)},
			{ new FarenheitTemperatureType(100), new CelciusTemperatureType(37.7777)},
			{ new FarenheitTemperatureType(1000), new CelciusTemperatureType(537.7777)}
		});
	}
	
	@Test
	public void test_convert() {
		TemperatureType actual =  service.Convert((FarenheitTemperatureType) temperture);
		System.out.println(actual.getValue() + " " + expected.getValue());
		assertTrue(expected.equals(actual));
	}
	

}
