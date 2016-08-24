package com.stewazy.test;

import static org.junit.Assert.*;

import java.util.Random;

import org.junit.Test;

import com.stewazy.main.Operation;

/**
 * Test class for class Operation
 * @author Lenovo
 *
 */

public class OperationTest {

	/**
	 * Variables used during testing
	 */
	Operation testing;
	double MAX_VALUE=100000;
	double MIN_VALUE=-100000;
	double firstRandomNumber;
	double secondRandomNumber;
	Random r;

	/**
	 * Testing calculate method using '+' as operation 
	 * Positive test scenario
	 */

	@Test
	public void testingAddPositive()
	{
		r = new Random();
		firstRandomNumber=MIN_VALUE+(MAX_VALUE-MIN_VALUE)*r.nextDouble();
		secondRandomNumber=MIN_VALUE+(MAX_VALUE-MIN_VALUE)*r.nextDouble();

		testing = new Operation(firstRandomNumber,secondRandomNumber,'+');
		testing.calculate();
		assertEquals(firstRandomNumber+secondRandomNumber,Double.parseDouble(testing.getResult()),0);
	}

	/**
	 * Testing calculate method using '+' as operation
	 * Negative test scenario
	 */
	@Test
	public void testingAddNegative()
	{
		r = new Random();
		firstRandomNumber=MIN_VALUE+(MAX_VALUE-MIN_VALUE)*r.nextDouble();
		secondRandomNumber=MIN_VALUE+(MAX_VALUE-MIN_VALUE)*r.nextDouble();

		testing = new Operation(firstRandomNumber,secondRandomNumber,'+');
		testing.calculate();
		assertNotEquals(firstRandomNumber*secondRandomNumber,Double.parseDouble(testing.getResult()),0);
	}


	/**
	 * Testing calculate method using '-' as operation
	 * Positive test scenario
	 */

	@Test
	public void testingSubtractPositive()
	{
		r = new Random();
		firstRandomNumber=MIN_VALUE+(MAX_VALUE-MIN_VALUE)*r.nextDouble();
		secondRandomNumber=MIN_VALUE+(MAX_VALUE-MIN_VALUE)*r.nextDouble();

		testing = new Operation(firstRandomNumber,secondRandomNumber,'-');
		testing.calculate();
		assertEquals(firstRandomNumber-secondRandomNumber,Double.parseDouble(testing.getResult()),0);
	}

	/**
	 * Testing calculate method using '-' as operation
	 * Negative test scenario
	 */

	@Test
	public void testingSubtractNegative()
	{
		r = new Random();
		firstRandomNumber=MIN_VALUE+(MAX_VALUE-MIN_VALUE)*r.nextDouble();
		secondRandomNumber=MIN_VALUE+(MAX_VALUE-MIN_VALUE)*r.nextDouble();

		testing = new Operation(firstRandomNumber,secondRandomNumber,'-');
		testing.calculate();
		assertNotEquals(firstRandomNumber*secondRandomNumber,Double.parseDouble(testing.getResult()),0);
	}

	/**
	 * Testing calculate method using '*' operation
	 * Positive test scenario
	 */

	@Test
	public void testingMultiplyPositive()
	{
		r = new Random();
		firstRandomNumber=MIN_VALUE+(MAX_VALUE-MIN_VALUE)*r.nextDouble();
		secondRandomNumber=MIN_VALUE+(MAX_VALUE-MIN_VALUE)*r.nextDouble();

		testing = new Operation(firstRandomNumber,secondRandomNumber,'*');
		testing.calculate();
		assertEquals(firstRandomNumber*secondRandomNumber,Double.parseDouble(testing.getResult()),0);
	}

	/**
	 * Testing calculate method using '*' operation
	 * Negative test scenario
	 */

	@Test
	public void testingMultiplyNegative()
	{
		r = new Random();
		firstRandomNumber=MIN_VALUE+(MAX_VALUE-MIN_VALUE)*r.nextDouble();
		secondRandomNumber=MIN_VALUE+(MAX_VALUE-MIN_VALUE)*r.nextDouble();

		testing = new Operation(firstRandomNumber,secondRandomNumber,'*');
		testing.calculate();
		assertNotEquals(firstRandomNumber*secondRandomNumber+1,Double.parseDouble(testing.getResult()),0);
	}

	/**
	 * Testing calculate method using '/' operation
	 * Postive test scenario
	 * Test excludes division with zero
	 */

	@Test
	public void testingDividePositive()
	{
		r = new Random();
		firstRandomNumber=MIN_VALUE+(MAX_VALUE-MIN_VALUE)*r.nextDouble();
		secondRandomNumber=MIN_VALUE+(MAX_VALUE-MIN_VALUE)*r.nextDouble();

		testing = new Operation(firstRandomNumber,secondRandomNumber,'/');
		testing.calculate();
		assertEquals(firstRandomNumber/secondRandomNumber,Double.parseDouble(testing.getResult()),0);
	}

	/**
	 * Testing calculate method using '/' operation
	 * Negative test scenario
	 * Test excludes division with zero
	 */

	@Test
	public void testingDivideNegative()
	{
		r = new Random();
		firstRandomNumber=MIN_VALUE+(MAX_VALUE-MIN_VALUE)*r.nextDouble();
		secondRandomNumber=MIN_VALUE+(MAX_VALUE-MIN_VALUE)*r.nextDouble();

		testing = new Operation(firstRandomNumber,secondRandomNumber,'/');
		testing.calculate();
		assertNotEquals(firstRandomNumber/secondRandomNumber+1,Double.parseDouble(testing.getResult()),0);
	}

	/**
	 * Testing calculate method using '/' operation
	 * Testing division with zero
	 */

	@Test
	public void testingDevideWithZero()
	{
		r = new Random();
		firstRandomNumber=MIN_VALUE+(MAX_VALUE-MIN_VALUE)*r.nextDouble();
		testing = new Operation(2,0,'/');
		testing.calculate();
		assertEquals("Error: Division with zero!",testing.getResult());	
	}

	/**
	 * Testing calculate method with a random char a-z
	 */

	@Test
	public void testingCalculateWrongOperation()
	{
		r = new Random();
		testing = new Operation(2,0,((char)(r.nextInt(26) + 'a')));
		testing.calculate();
		assertEquals("error",testing.getResult());	

	}

}
