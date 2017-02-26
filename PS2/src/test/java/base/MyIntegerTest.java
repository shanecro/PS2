package base;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import base.MyInteger;

public class MyIntegerTest {


	public static MyInteger num1;
	public static MyInteger num2;
	public static MyInteger num3;
	
	

	
	
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		num1 = new MyInteger(4);
		num2= new MyInteger(5);
		num3= new MyInteger(5);
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

	//Is even/odd/prime
	
	@Test
	public void isEvenTest() {
		assertTrue("4 is an even number", num1.isEven(4));
	}

	@Test
	public void isNotEvenTest() {
		assertFalse("5 is not an even number", num1.isEven(5));
	}

	@Test
	public void isOddTest() {
		assertTrue("3 is an odd number", num1.isOdd(3));

	}

	@Test
	public void isNotOddTest() {
		assertFalse("4 is not and odd number", num1.isOdd(4));

	}

	@Test
	public void isPrimeTest() {
		assertTrue("5 is a prime number", num1.isPrime(5));
	}

	@Test
	public void isNotPrimeTest() {
		assertFalse("4 is not a prime number", num1.isPrime(4));
	}

//is even/odd/prime for int	
	@Test
	public void isEven() {
		assertTrue("This is an even number", num1.isEven(6));
	}
	@Test
	public void isNotEven() {
		assertFalse("This is not an even number", num1.isEven(5));
	}
	@Test
	public void isOdd() {
		assertTrue("This is an Odd number", num1.isOdd(5));
	}
	@Test
	public void isNotOdd() {
		assertFalse("This is not an Odd number", num1.isOdd(6));
	}
	@Test
	public void isPrime(){
		assertTrue("This is a prime number", num1.isPrime(7));
	}
	@Test
	public void isNotPrime(){
		assertFalse("This is not a prime number", num1.isPrime(4));
	}
	//is even/odd/prime for MyInteger
	@Test
	public void isEvenMyInteger(){
		assertTrue("this is an even number", num1.isEven(num1));
	}
	@Test
	public void isNotEvenMyInteger(){
		assertFalse("this is not an even number", num1.isEven(num2));
	}	
	@Test
	public void isOddMyInteger(){
		assertTrue("this is an Odd number", num1.isOdd(num2));
	}
	@Test
	public void isNotOddMyInteger(){
		assertFalse("this is not an odd number", num1.isOdd(num1));
	}
	@Test
	public void isPrimeMyInteger(){
		assertTrue("this is a prime number", num1.isPrime(num2));
	}
	@Test
	public void isNotPrimeMyInteger(){
		assertFalse("this is not a prime number", num1.isPrime(num1));
	}
	//IsEqualsInt
	@Test
	public void isEqualInt(){
		assertTrue("This number is equal to 5",num2.equals(5));
	}
	@Test
	public void isNotEqualInt(){
		assertFalse("This number is not equal to 5",num1.equals(5));
	}
	
	
	//IsEqualsMyInteger
	
	@Test
	public void isEqualMyIntegerl(){
		assertTrue("This number is equal to 5", num2.equals(num3));
	}
	@Test 
	public void isNotEqualMyInteger(){
		assertFalse("This number is not equal to 4", num1.equals(num2));
	}
}
