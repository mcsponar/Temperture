package domain.tests;
import java.util.Arrays;

import domain.ConvertFahrenheitToCelsiusService;
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
	private final double DELTA = .01;
	
	private int temperture;
	private double expected;
	
	
	public ConvertFarhenheitToCelsiusTests(int temperture, double expected){
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
			{ -10, -23.33}, 
			{ 0, -17.78}, 
			{ 10, -12.22}, 
			{ 30, -1.11},
			{ -30, -34.44},
			{ 100, 37.78},
			{ 1000, 537.78}
		});
	}
	
	@Test
	public void test_convert() {
		assertEquals(expected, service.Convert(temperture), DELTA);
	}
	

}
