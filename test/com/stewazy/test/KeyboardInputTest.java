package com.stewazy.test;

import static org.junit.Assert.*;

import java.io.ByteArrayInputStream;
import java.io.InputStream;

import org.junit.Test;

import com.stewazy.main.KeyboardInput;


public class KeyboardInputTest {
	

	@Test
	public void testGetDouble() {
		InputStream anyInputStream = new ByteArrayInputStream("2".getBytes());
		KeyboardInput input = new KeyboardInput(anyInputStream);
		assertEquals(2, input.getDouble(),0);
	}
	
	@Test
	public void testGetChar() {
		InputStream anyInputStream = new ByteArrayInputStream("c".getBytes());
		KeyboardInput input = new KeyboardInput(anyInputStream);
		assertEquals('c',input.getChar()); 
	}
	

}
