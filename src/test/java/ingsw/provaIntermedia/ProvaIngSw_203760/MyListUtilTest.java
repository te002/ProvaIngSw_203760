package ingsw.provaIntermedia.ProvaIngSw_203760;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;

import org.joda.time.LocalDate;
import org.joda.time.LocalTime;
import org.junit.After;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class MyListUtilTest {

	private static MyListUtil lista;
	
	@BeforeClass
	public static void start() {
		lista= new MyListUtil();
	}
	
	@Before
	public void beforeEachTest() {
		lista.list = Arrays.asList(10,15,6,4,3,2,1,0,7);
		LocalDate date = LocalDate.now();
		LocalTime time= LocalTime.now();
		System.out.println("Data prima del test: "+date+System.lineSeparator()+" Orario prima del test: "+time+System.lineSeparator());
	}
	
	@After
	public void afterEachTest() {
		LocalDate date = LocalDate.now();
		LocalTime time= LocalTime.now();
		System.out.println("Data dopo il test: "+date+System.lineSeparator()+" Orario dopo il test: "+time+System.lineSeparator());
	}
	
	@Test
	public void crescenteOrderTest() {
		assertEquals(Arrays.asList(0,1,2,3,4,6,7,10,15), lista.sort(1));
	}
	
	@Test
	public void decrescenteOrderTest() {
		assertEquals(Arrays.asList(15,10,7,6,4,3,2,1,0), lista.sort(0));
	}
	
	@Test(expected = IllegalArgumentException.class)
	public void errorOrderTest() {
		lista.sort(3);
	}
	
}
