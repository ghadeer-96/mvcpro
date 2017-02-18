package mvcpro;

import static org.junit.Assert.*;

import org.junit.Test;

public class ModelTest {

	@Test
	public void TestAdd() {
		model m1=new model();
		m1.add(3.5, 4.0);
		double r = m1.getResult();
		assertTrue(r==7.5);
	}
	@Test
	public void TestSub() {
		model m1=new model();
		m1.sub(33.0, 44.0);
		double r = m1.getResult();
		assertTrue(r==-11.0);
	}
	@Test
	public void TestMul() {
		model m1=new model();
		m1.mul(2.5 ,4.0);
		double r = m1.getResult();
		assertTrue(r==10.0);
	}
	@Test
	public void TestDiv() {
		model m1=new model();
		m1.div(256.0,32.0);
		double r = m1.getResult();
		assertTrue(r==8.0);
	}
	@Test
	public void TestMod() {
		model m1=new model();
		m1.mod(90.0,8.0);
		double r = m1.getResult();
		assertTrue(r==2.0);
	}
	@Test
	public void TestClear() {
		model m1=new model();
		m1.clear();
		double r = m1.getResult();
		assertTrue(r==0.0);
	}	
}
