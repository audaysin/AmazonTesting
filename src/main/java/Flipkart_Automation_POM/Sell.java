package Flipkart_Automation_POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Sell {
	
	@FindBy(xpath= "//*[@id=\"container\"]/div/div[1]/div[1]/div[2]/div[4]/a")
			private WebElement btn_sales;
	
	@FindBy(xpath="//*[@id=\"app\"]/div[1]/div/div[1]/ul/li[6]/div/button/span")
	private WebElement btn_StartSelling;
	
	public  Sell(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
 public void click_sellbtn() {
	 btn_sales.click();
	 
 }
 
 public void click_StartSellingbtn() {
	 btn_StartSelling.click();
 }
}
