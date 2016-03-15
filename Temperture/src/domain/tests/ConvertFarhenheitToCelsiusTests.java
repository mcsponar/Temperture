package domain.tests;
import java.util.Arrays;

import domain.CelciusTempertureType;
import domain.ConvertFahrenheitToCelsiusService;
import domain.FarenheitTempertureType;
import domain.TempertureType;
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
	private TempertureType temperture;
	private TempertureType expected;
	
	
	public ConvertFarhenheitToCelsiusTests(TempertureType temperture, TempertureType expected){
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
			{ new FarenheitTempertureType(-10), new CelciusTempertureType(-23.3333)}, 
			{ new FarenheitTempertureType(0), new CelciusTempertureType(-17.7777)}, 
			{ new FarenheitTempertureType(10), new CelciusTempertureType(-12.2222)}, 
			{ new FarenheitTempertureType(30), new CelciusTempertureType(-1.1111)},
			{ new FarenheitTempertureType(-30), new CelciusTempertureType(-34.4444)},
			{ new FarenheitTempertureType(100), new CelciusTempertureType(37.7777)},
			{ new FarenheitTempertureType(1000), new CelciusTempertureType(537.7777)}
		});
	}
	
	@Test
	public void test_convert() {
		TempertureType actual =  service.Convert((FarenheitTempertureType) temperture);
		System.out.println(actual.getValue() + " " + expected.getValue());
		assertTrue(expected.equals(actual));
	}
	

}
