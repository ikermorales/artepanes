package examen.parc202012;

import static org.junit.Assert.*;

import org.junit.Test;

public class ContadorTest {

	@Test
	public void testGet() {
		Contador cont = new Contador(0);
		assertEquals(0, cont.get());
	}
	

	@Test
	public void testInc() {
		Contador cont = new Contador(1);
		cont.inc();
		assertEquals(2, cont.get());
	}
	
	
	@Test
	public void testIncNumero() {
		Contador cont = new Contador(1);
		cont.inc(4);
		assertEquals(5, cont.get());
	}



}
