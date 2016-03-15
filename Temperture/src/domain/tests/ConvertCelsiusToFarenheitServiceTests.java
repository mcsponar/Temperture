package domain.tests;

import static org.junit.Assert.*;

import java.util.Arrays;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

import domain.CelciusTempertureType;
import domain.ConvertCelsiusToFarenheitService;
import domain.FarenheitTempertureType;
import domain.TempertureType;

@RunWith(value = Parameterized.class)
public class ConvertCelsiusToFarenheitServiceTests {

	private ConvertCelsiusToFarenheitService service;
	private TempertureType temperture;
	private TempertureType expected;
	
	public ConvertCelsiusToFarenheitServiceTests(TempertureType temperture, TempertureType expected){
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
			{ new CelciusTempertureType(-50), new FarenheitTempertureType(-58.0)}, 
			{ new CelciusTempertureType(-40), new FarenheitTempertureType(-40.0)}, 
			{ new CelciusTempertureType(-30), new FarenheitTempertureType(-22.0)}, 
			{ new CelciusTempertureType(0), new FarenheitTempertureType(32.0)},
			{ new CelciusTempertureType(30), new FarenheitTempertureType(86.0)},
			{ new CelciusTempertureType(100), new FarenheitTempertureType(212.0)},
			{ new CelciusTempertureType(1000), new FarenheitTempertureType(1832.0)}
		});
	}
	
	@Test
	public void test_convert() {
		
		TempertureType actual =  service.Convert((CelciusTempertureType) temperture);
		assertTrue(expected.equals(actual));
	}

}
