package com.main;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class FirstProgram {
	
	@BeforeClass
	public static void sample1(){
		System.out.println("Before Class");	
	}

    @AfterClass	
    public static void sample2(){
		System.out.println("After Class");
	}

    @Before
    public void sample3(){
	System.out.println("before");
}

    @Test
    public  void sample4(){
	System.out.println("test");
}
    
    @After
    public void sample5(){
	System.out.println("After");
}

}
