package webapp;

import org.testng.annotations.Test;

public class SampleTest {
	
	@Test (groups = {"Test"})
	
	public void testSample(){
		
		int a=10;
		int b=11;
		int c=0;
		System.out.println("sum"+a+b);
	}

}
