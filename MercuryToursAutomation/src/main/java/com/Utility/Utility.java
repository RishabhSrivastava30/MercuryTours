package com.Utility;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.HashMap;
import java.util.Properties;

import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.Assert;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

public class Utility {

	 static ExtentReports extent= new ExtentReports (System.getProperty("user.dir") +"/test-output/MercuryTours-Report.html", true);;
	 static ExtentTest logger;
public static HashMap<String, String> map;
	 
	 public static void excelValToMap(String strSheetName) throws IOException {
			String FilePath = "C:\\Users\\Lenovo\\Desktop\\GitFolder\\Resources\\MercuryTours-TestData.xlsx";
			 FileInputStream fs = new FileInputStream(FilePath);
			
			XSSFWorkbook wb=new XSSFWorkbook(fs);
			 
			 XSSFSheet sh= wb.getSheet(strSheetName);
			 System.out.println(sh.getLastRowNum());
			 
			 //Create map and add key value pair
			
			 map = new HashMap<String, String>();
			 map.clear();
			 for(int i=1; i<=sh.getLastRowNum(); i++)
			 {
				 XSSFCell cell=sh.getRow(i).getCell(1);
				 cell.setCellType(CellType.STRING);
				 
				 
				 map.put(sh.getRow(i).getCell(0).getStringCellValue(), cell.getStringCellValue().trim());
			 }
			 
			 System.out.println(map.get("First Name"));
			 
			wb.close(); 
		}
	 //extent = new ExtentReports (System.getProperty("user.dir") +"/test-output/MercuryTours-Report.html", true);
	public static void passtest()
	{
	 
	 
	 
	 
	 //extent=ExtentReports (System.getProperty("user.dir") +"/test-output/MercuryTours-Report.html", true);
	
	 logger = extent.startTest("passTest");
	 
	 Assert.assertTrue(true);
	 //To generate the log when the test case is passed
	 logger.log(LogStatus.PASS, "Test Case Passed is passTest");
	 logger.log(LogStatus.PASS, "Test Case (failTest) Status is passed");
	 logger.log(LogStatus.FAIL, "Test Case Failed is test223344 ");
	/* extent.endTest(logger);
	 logger = extent.startTest("passTest22");
	 logger.log(LogStatus.FAIL, "Test Case passTest22 ");
	 extent.endTest(logger);
	 extent.flush();
	 extent.close();
	 //extent.endTest("passTest");*/
	 extent.endTest(logger);
	 
	}
	
	public static void passTest(String logTest) {
		 logger = extent.startTest(logTest);
	}
	public static void logTest(String Message) {
		 
		 
//		 /Assert.assertTrue(true);
		 //To generate the log when the test case is passed
		 logger.log(LogStatus.PASS, Message);
		 
		 extent.endTest(logger);
	}
	
	public static void endTest() {
		 //extent.endTest(logger);
		 extent.flush();
		 extent.close();
	}
	
	 
	 
	 /*public String a;
		  //public static void main(String[] args) {
			public ExtentReports extent = new ExtentReports(System.getProperty("user.dir")+"test-output/MercuryTours-HtmlReport.html",true);
			
			ExtentTest logger=extent.startTest("passTest");
			
			logger.log(LogStatus.PASS, "Test Case Passed is passTest");
			logger.*/
			
			  public void FetchValue(String strValue)
			  {
				  Properties prop = new Properties();
				    InputStream input = null;

				    
				    try {
				        input = new FileInputStream("C:\\Users\\Lenovo\\Desktop\\GitFolder\\Resources\\config.properties");

				        // load a properties file
				        
							prop.load(input);
							System.out.println(prop.getProperty(strValue));
						} catch (IOException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						} catch (Exception ex) {
							ex.printStackTrace();
						}  finally {
						    if (input != null) {
						        try {
						            input.close();
						        } catch (IOException e) {
						            e.printStackTrace();
						        }
						    }
						}
 
			  }
			    
			        
			        
	}

//}
