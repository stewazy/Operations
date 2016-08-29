package com.stewazy.test;

import static org.junit.Assert.*;

import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.util.InputMismatchException;

import org.junit.Test;

import com.stewazy.main.KeyboardInput;

/**
 * Testing methods in KeyboardInput.java
 * @author Stevan Mihajlov
 *
 */
public class KeyboardInputTest {

	/**
	 * Testing getting double value
	 */
	@Test
	public void testGetDouble() {
		InputStream anyInputStream = new ByteArrayInputStream("2".getBytes());
		KeyboardInput input = new KeyboardInput(anyInputStream);
		assertEquals(2, input.getDouble(),0);
	}

	/**
	 * Testing getting char value
	 */
	@Test
	public void testGetChar() {
		InputStream anyInputStream = new ByteArrayInputStream("c".getBytes());
		KeyboardInput input = new KeyboardInput(anyInputStream);
		assertEquals('c', input.getChar()); 
	}

}
