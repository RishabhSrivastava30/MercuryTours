package testNgPackage;

import org.apache.log4j.xml.DOMConfigurator;
import org.testng.Assert;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.Utility.Utility;
import com.relevantcodes.extentreports.LogStatus;
import com.relevantcodes.extentreports.model.Log;


public class TC_001 {
	
		
		@BeforeSuite
		public void befsuite() {
			//Utility.a="rishabh";
			//System.out.println(Utility.a);
			
			
			System.out.println("bs1");
			
			//extent=new ExtentReports(System.getProperty("user.dir")+"test-output/MercuryTours-HtmlReport.html",true)
		}
		
		@BeforeClass
		public void brfCls() {
			System.out.println("bc1");
		}
		
		
		@BeforeTest
		public void beftst() {
			System.out.println("bt1");
		}
		
		@Test
		public void test() {
			System.out.println("test");
			
			Utility.passtest();
			
			}
		
		@AfterSuite
		public void endsuit() {
//			/DOMConfigurator.configure("log4j.xml");
			Utility.passTest("aa");
			 //String sValue = "Lakshay Sharma";
			  
			 //Assert.assertEquals("Lakshay Sharma", sValue);
			//Log.info("New driver instantiated");
			Utility.logTest("bhak1");
			Utility.logTest("bhak2");
			Utility.passTest("bb");
			Utility.logTest("1bhak");
			Utility.logTest("2bhak");
			Utility.logTest("3bhak");
			
			Utility.endTest();
		}
		

}
