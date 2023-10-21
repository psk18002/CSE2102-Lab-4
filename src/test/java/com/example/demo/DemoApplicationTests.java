package com.example.demo;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class DemoApplicationTests {

	@Test
	void contextLoads() {
	}

	@Test
	void notEqualTest() {
		int expected = 5;
		int actual = 3+2;
		Assertions.assertNotEquals(expected, actual+1);
	}

	@Test
	void simpleAdd_2() {
		int expected = 5;
		int actual = 3+2+1;
		Assertions.assertNotEquals(expected, actual);
	}
}
