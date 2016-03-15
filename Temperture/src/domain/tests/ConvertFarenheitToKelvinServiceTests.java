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
import domain.FarenheitTempertureType;
import domain.KelvinTempertureType;
import domain.TempertureType;

@RunWith(value = Parameterized.class)
public class ConvertFarenheitToKelvinServiceTests {
	
	private ConvertFarenheitToKelvinService service;
	
	private TempertureType temperture;
	private TempertureType expected;
	
	public ConvertFarenheitToKelvinServiceTests(TempertureType temperture, TempertureType expected){
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
			{ new FarenheitTempertureType(-459.67), new KelvinTempertureType(0)}, 
			{ new FarenheitTempertureType(-40), new KelvinTempertureType(233.15)}, 
			{ new FarenheitTempertureType(-30), new KelvinTempertureType(238.7055)}, 
			{ new FarenheitTempertureType(0), new KelvinTempertureType(255.3722)},
			{ new FarenheitTempertureType(30), new KelvinTempertureType(272.0388)},
			{ new FarenheitTempertureType(100), new KelvinTempertureType(310.9277)},
			{ new FarenheitTempertureType(1000), new KelvinTempertureType(810.9277)}
		});
	}

	@Test
	public final void test() {
		TempertureType actual =  service.Convert((FarenheitTempertureType) temperture);
		//System.out.println(actual.getValue() + " " + expected.getValue());
		assertTrue(expected.equals(actual));
	}

}
