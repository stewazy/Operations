package com.stewazy.test;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

/**
 * Run all tests
 * @author Stevan Mihajlov
 *
 */

@RunWith(Suite.class)
@SuiteClasses({ OperationTest.class, KeyboardInputTest.class })
public class AllTests {
	

}
