package base;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class MyInteger_Test {

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testisEven(){
		MyInteger a = new MyInteger(100);
		MyInteger b = new MyInteger(57);
		
		assertFalse(b.isEven());
		assertTrue(a.isEven());
		
		int n1=4;
		int n2=81;
		
		assertTrue(MyInteger.isEven(n1));
		assertFalse(MyInteger.isEven(n2));
		
		assertTrue(MyInteger.isEven(a));
		assertFalse(MyInteger.isEven(b));
	}
	
	@Test
	public void testisOdd(){
		MyInteger a = new MyInteger(100);
		MyInteger b = new MyInteger(57);
		
		assertTrue(b.isOdd());
		assertFalse(a.isOdd());
		
		int n1=4;
		int n2=81;
		
		assertFalse(MyInteger.isOdd(n1));
		assertTrue(MyInteger.isOdd(n2));
		
		assertTrue(MyInteger.isOdd(b));
		assertFalse(MyInteger.isOdd(a));
	}
	
	@Test
	public void testisPrime(){
		MyInteger a = new MyInteger(100);
		MyInteger c = new MyInteger(19);
		MyInteger d = new MyInteger(2);
		
		assertFalse(a.isPrime());
		assertTrue(d.isPrime());
		assertTrue(c.isPrime());
		
		int n1=4;;
		int n3=7;
		int n4=1;
		
		assertTrue(MyInteger.isPrime(n4));
		assertTrue(MyInteger.isPrime(n3));
		assertFalse(MyInteger.isPrime(n1));	
		
		assertTrue(MyInteger.isPrime(c));
		assertTrue(MyInteger.isPrime(d));
		assertFalse(MyInteger.isPrime(a));
	}
	
	@Test
	public void test() {
		assertTrue(1==1);
		MyInteger a = new MyInteger(100);
		MyInteger b = new MyInteger(57);
		
		assertEquals(b.getiValue(),57);
		
		
		assertTrue(a.equals(100));
		assertFalse(a.equals(b));
	
		
	}

	}

