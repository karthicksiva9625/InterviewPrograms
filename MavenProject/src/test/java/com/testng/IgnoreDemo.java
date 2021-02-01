package com.testng;

import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

public class IgnoreDemo {
	
	@Test
	private void axisBank() {
		System.out.println("AXISBANK");
	}
	
	@Test
	@Ignore
	private void indianBank() {
		System.out.println("INDIANBANK");
	}
	
	@Test
	private void kvbBank() {
		System.out.println("KVBBANK");
	}
	
	@Test
	@Ignore
	private void iobBank() {
		System.out.println("IOBBANK");
	}
	
	@Test
	private void stateBank() {
		System.out.println("STATEBANK");
	}

}
