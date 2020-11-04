package Conforti.JUnitProvaIntermedia203856;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;

import org.joda.time.DateTime;
import org.joda.time.LocalDate;
import org.joda.time.LocalDateTime;
import org.joda.time.LocalTime;
import org.junit.After;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class MyListUtilTest {

	private static MyListUtil m;
	
	@BeforeClass
	public static void start() {
		System.out.println("Inizializzazione..");
		m = new MyListUtil();
	}
	
	@Before
	public void beforeEachTest() {
		System.out.println("Eseguo prima di ogni test.." + System.lineSeparator());
		m.lista = Arrays.asList(10,20,5,4,3,7,8,9,0,5,6);
		LocalDate data = LocalDate.now();
		LocalTime orario = LocalTime.now();
		System.out.println("Data prima del test:" + data + System.lineSeparator() + "Orario prima del test:" + orario + System.lineSeparator());
	}
	
	@After
	public void afterEachTest() {
		LocalDate data = LocalDate.now();
		LocalTime orario = LocalTime.now();
		System.out.println("Data dopo il test:" + data + System.lineSeparator() + "Orario dopo il test:" + orario + System.lineSeparator());
	}
	
	@Test
	public void ordinaCrescenteTest() {
		System.out.println("Test ordine crescente");
		assertEquals(Arrays.asList(0,3,4,5,5,6,7,8,9,10,20), m.ordina(1));
	}
	
	@Test
	public void ordinaDecrescenteTest() {
		System.out.println("Test ordine decrescente");
		assertEquals(Arrays.asList(20,10,9,8,7,6,5,5,4,3,0), m.ordina(0));
	}
	
	@Test(expected = IllegalArgumentException.class)
	public void ordinaErrorTest() {
		System.out.println("Test errore");
		m.ordina(4);
	}
}
