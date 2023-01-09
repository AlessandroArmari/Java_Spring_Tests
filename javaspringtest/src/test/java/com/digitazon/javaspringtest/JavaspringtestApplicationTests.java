package com.digitazon.javaspringtest;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

//HERE I TYPE MY TESTS!!!

@SpringBootTest
class JavaspringtestApplicationTests {

	@BeforeAll // BEFORE AND AFTER AREN'T TESTS!
	// the're instruction to be run before @Tests
	static void setupdBeforeAll() {
		System.out.println("@BeforeAll, run before other tests");
	}

	@BeforeEach
	void setupBeforeEach() {
		System.out.println("@BeforeEach - before each tests!");
	}

	@Test // annotation meaning "it's a test!!!"
	void helloWorldTest() {
		System.out.println("Hello World! ---IT'S A TEST---");
	}
	// IMPORTANT: RUN TESTS IN THE LEFT-SECTION-GRADUATED-TEST-TUBE

	@Test // the @Test are actual tests--->they're shown in the "graduated" section
	void byeByeTest() {
		System.out.println("bye bye---> it works!");
	}

	@AfterAll
	static void setupAfterAll() {
		System.out.println("@AfterAll - after all tests!");
	}

	@AfterEach
	void setupAfterEach(){
		System.out.println("@AfterEach - rune after each tests!"); 

}
