package com.service;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class OperationServiceTest {

	@Test  // like main method
	void testAdd() {
		OperationService os=new OperationService();
		int result=os.add(200, 300);
		assertEquals(500, result);
		}

	@Test  // like main method
	void testSub() {
		OperationService os=new OperationService();
		int result=os.sub(300, 200);
		assertEquals(100, result);
		}

	@Test  // like main method
	void testMul() {
		OperationService os=new OperationService();
		int result=os.mul(2, 100);
		assertEquals(200, result);
		}

	@Test  // like main method
	void testDiv() {
		OperationService os=new OperationService();
		int result=os.div(300, 100);
		assertEquals(3, result);
		}

}
