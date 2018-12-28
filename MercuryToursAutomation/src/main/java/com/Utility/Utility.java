package com.Utility;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class Utility {

		  //public static void main(String[] args) {

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
