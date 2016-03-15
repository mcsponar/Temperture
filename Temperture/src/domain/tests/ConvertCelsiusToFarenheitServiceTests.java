package domain.tests;

import static org.junit.Assert.*;

import java.util.Arrays;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

import domain.CelciusTemperatureType;
import domain.ConvertCelsiusToFarenheitService;
import domain.FarenheitTemperatureType;
import domain.TemperatureType;

@RunWith(value = Parameterized.class)
public class ConvertCelsiusToFarenheitServiceTests {

	private ConvertCelsiusToFarenheitService service;
	private TemperatureType temperture;
	private TemperatureType expected;
	
	public ConvertCelsiusToFarenheitServiceTests(TemperatureType temperture, TemperatureType expected){
		this.temperture = temperture;
		this.expected = expected;
	}
	
	@Before
	public void setUp() throws Exception {
		service = new ConvertCelsiusToFarenheitService();
	}

	@After
	public void tearDown() throws Exception {
	}

	//Declares parameters here
	@Parameters(name = "{index}: convert({0})={1}")
	public static Iterable<Object[]> data1() {
		return Arrays.asList(new Object[][] { 
			{ new CelciusTemperatureType(-50), new FarenheitTemperatureType(-58.0)}, 
			{ new CelciusTemperatureType(-40), new FarenheitTemperatureType(-40.0)}, 
			{ new CelciusTemperatureType(-30), new FarenheitTemperatureType(-22.0)}, 
			{ new CelciusTemperatureType(0), new FarenheitTemperatureType(32.0)},
			{ new CelciusTemperatureType(30), new FarenheitTemperatureType(86.0)},
			{ new CelciusTemperatureType(100), new FarenheitTemperatureType(212.0)},
			{ new CelciusTemperatureType(1000), new FarenheitTemperatureType(1832.0)}
		});
	}
	
	@Test
	public void test_convert() {
		
		TemperatureType actual =  service.Convert((CelciusTemperatureType) temperture);
		assertTrue(expected.equals(actual));
	}

}
