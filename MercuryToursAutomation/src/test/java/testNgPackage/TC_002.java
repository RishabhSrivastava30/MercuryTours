package testNgPackage;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TC_002 {
	
	@BeforeSuite
	public void befsuite2() {
		System.out.println("bs2");
	}
	
	@BeforeClass
	public void brfCls2() {
		System.out.println("bc2");
	}
	
	
	@Test
	public void tst2() {
		System.out.println("tc02");
	}
	
	@BeforeTest
	public void beftst2() {
		System.out.println("bt2");
	}
	

}
