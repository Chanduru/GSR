package gsr.Qbend.Admin;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

public class QBactionLib {

	public static WebDriver Driver; 
	
	
	//******************************************************************************************************************************************	
		/**
		 * Function to set text in an Qbend forms field
		 * @param slocator, sValue 
		 */	
	
	public boolean setText(String slocator, String sValue) throws Exception
	{
		try
		{
			System.out.println("Trying to set text on field :" + slocator + " with value = " + sValue);
			Driver.findElement(By.xpath(slocator)).sendKeys(sValue);
			System.out.println("Set text on field : " + slocator + " successful");
			return true;
		}
		catch(Exception e)
		{
			String sMessage = e.getMessage();
			//LastException.setLastError(sMessage);
			throw new Exception(sMessage);
		}
				
	}
	//******************************************************************************************************************************************
		/**
		 * Function to click an Qbend forms button
		 * @param slacator, sValue 
		 */	
		public boolean clickButton(String slocator) throws Exception
		{
			try
			{
				
				
				System.out.println("Trying to click the button :" + slocator);
				Driver.findElement(By.xpath(slocator)).click();
				//Thread.sleep(Integer.parseInt(ConfigProperties.Config.getProperty("Test_Execution_Speed")));
				System.out.println("Click button : " + slocator + " successful");
				return true;
			}
			catch(Exception e)
			{
				String sMessage = e.getMessage();
				//LastException.setLastError(sMessage);
				throw new Exception(sMessage);
			}
			
		}
		//******************************************************************************************************************************************

		/**
		 * Function to select a value from oracle forms list 
		 * @param sObject, sValue 
		 */	
		public boolean selectListValue(String slocator, String sValue) throws Exception
		{
			try
			{
				
				System.out.println("Object : " + slocator + "exists");
				System.out.println("Trying to select the value :" + sValue + " from the list: " + slocator);
				Select select = new Select(Driver.findElement(By.xpath(slocator)));
				select.selectByVisibleText(sValue);
				
					System.out.println("Select list value :" + sValue + " from the list: " + slocator + " successful");
				return true;
			}
			catch(Exception e)
			{
				String sMessage = e.getMessage();
				//LastException.setLastError(sMessage);
				throw new Exception(sMessage);
			}
		}

}
