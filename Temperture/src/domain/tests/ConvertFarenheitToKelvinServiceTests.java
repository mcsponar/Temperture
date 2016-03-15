package domain.tests;

import static org.junit.Assert.*;

import java.util.Arrays;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

import domain.ConvertFarenheitToKelvinService;
import domain.FarenheitTemperatureType;
import domain.KelvinTemperatureType;
import domain.TemperatureType;

@RunWith(value = Parameterized.class)
public class ConvertFarenheitToKelvinServiceTests {
	
	private ConvertFarenheitToKelvinService service;
	
	private TemperatureType temperture;
	private TemperatureType expected;
	
	public ConvertFarenheitToKelvinServiceTests(TemperatureType temperture, TemperatureType expected){
		this.temperture = temperture;
		this.expected = expected;
	}
	@Before
	public void setUp() throws Exception {
		service = new ConvertFarenheitToKelvinService();
	}

	@After
	public void tearDown() throws Exception {
	}
	
	@Parameters(name = "{index}: convert({0})={1}")
	public static Iterable<Object[]> data1() {
		return Arrays.asList(new Object[][] { 
			{ new FarenheitTemperatureType(-459.67), new KelvinTemperatureType(0)}, 
			{ new FarenheitTemperatureType(-40), new KelvinTemperatureType(233.15)}, 
			{ new FarenheitTemperatureType(-30), new KelvinTemperatureType(238.7055)}, 
			{ new FarenheitTemperatureType(0), new KelvinTemperatureType(255.3722)},
			{ new FarenheitTemperatureType(30), new KelvinTemperatureType(272.0388)},
			{ new FarenheitTemperatureType(100), new KelvinTemperatureType(310.9277)},
			{ new FarenheitTemperatureType(1000), new KelvinTemperatureType(810.9277)}
		});
	}

	@Test
	public final void test() {
		TemperatureType actual =  service.Convert((FarenheitTemperatureType) temperture);
		//System.out.println(actual.getValue() + " " + expected.getValue());
		assertTrue(expected.equals(actual));
	}

}
