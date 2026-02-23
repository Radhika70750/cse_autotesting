package com.aditya.csejenkines1;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class CseaddTest {
	Cseadd c=new Cseadd();
	@Test
	void Csetest() {
		int result=c.add(2,3);
		assertEquals(5,result);
	}
	@Test
	void Csetest1() {
		int result=c.mul(2,3);
		assertEquals(5,result);
	}
}