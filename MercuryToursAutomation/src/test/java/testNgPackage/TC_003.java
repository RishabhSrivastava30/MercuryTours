package testNgPackage;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TC_003 {
  
	
	@BeforeSuite
	public void befsuite3() {
		System.out.println("bs3");
	}
	
	@BeforeClass
	public void brfCls2() {
		System.out.println("bc2");
	}
	
	
	@Test
  public void f() {
	  System.out.println("tc3");
  }
	@BeforeTest
	public void beftst2() {
		System.out.println("bt3");
	}
	
}
