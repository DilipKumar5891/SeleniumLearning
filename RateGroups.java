package com.Akorbi.PageObjects;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class RateGroups {

	WebDriver ldriver;
	
	public RateGroups (WebDriver rdriver){
		
		ldriver = rdriver;
		PageFactory.initElements(rdriver, this);
	}
	
	@FindBy(xpath = "//span[contains(text(),'Rate Groups')]")
	WebElement rategroups;
	
	@FindBy(xpath = "//span[contains(text(),'New Rate Group')]")
	WebElement newrategroupbtn;
	
	@FindBy(xpath = "//input[@id='rategroup']")
	WebElement rginputname;
	
	@FindBy(xpath = "//span[contains(text(),'Save')]")
	WebElement savebtn;
	
	@FindBy(xpath = "//span[contains(text(),'Cancel')]")
	WebElement cancelbtn;
	
	@FindBy(xpath = "//tbody/tr[1]/td[2]/a[1]/img[1]")
	WebElement editbtn;
	
	@FindBy(id = "search")
	
	WebElement rgsearch;
	
	@FindBy(xpath = "//thead/tr[1]/th[1]/span[1]/span[1]/*[1]")
	WebElement rgsorting;
	
	@FindBy (xpath = "//select[@id='mui-32451']")
	WebElement rowsperpage;
	
	@FindBy (xpath = "//body/div[@id='root']/div[1]/main[1]/div[1]/div[3]/div[1]/div[3]/div[1]/table[1]/tfoot[1]/tr[1]/div[1]/td[1]/div[1]/div[3]/button[3]/span[1]/*[1]")
	WebElement nextpage;
	
	@FindBy(xpath = "//body/div[@id='root']/div[1]/main[1]/div[1]/div[3]/div[1]/div[3]/div[1]/table[1]/tfoot[1]/tr[1]/div[1]/td[1]/div[1]/div[3]/button[2]/span[1]/*[1]")
	WebElement previouspage;
	
	@FindBy(xpath = "//body/div[@id='root']/div[1]/main[1]/div[1]/div[3]/div[1]/div[3]/div[1]/table[1]/tfoot[1]/tr[1]/div[1]/td[1]/div[1]/div[3]/button[4]/span[1]/*[1]")
	WebElement lastpage;
	
	@FindBy(xpath = "//body/div[@id='root']/div[1]/main[1]/div[1]/div[3]/div[1]/div[3]/div[1]/table[1]/tfoot[1]/tr[1]/div[1]/td[1]/div[1]/div[3]/button[1]/span[1]/*[1]")
	WebElement firstpage;
	
	@FindBy(xpath = "//*[@id=\"root\"]/div/main/div/div[3]/div/div[1]/div")
	
	WebElement RGCToast;
	
	
	
	public void clickrg(){
		rategroups.click();
	}
	public void clicknewrg(){
		
		newrategroupbtn.click();
	}
	
	public void inputrgname(String rgname) throws InterruptedException {
		Thread.sleep(2000);
		rginputname.click();
		rginputname.clear();
		rginputname.sendKeys(rgname);
	}
	
	public void clickrgsave() {
		savebtn.click();
	}
	
	public void clickcancel() {
		cancelbtn.click();
	}
	
	public void inputsearch(String searchip) {
		rgsearch.sendKeys(searchip);
	}
	
	public void clicksorting() {
		rgsorting.click();
	}
	public void clickeditbtn() {
		editbtn.click();
	}
	
	public void clickrowsperpage() throws InterruptedException {
		Select pagination = new Select(rowsperpage);
		pagination.selectByVisibleText("10");
		Thread.sleep(3000);
		pagination.deselectByVisibleText("25");
		Thread.sleep(3000);
		pagination.deselectByVisibleText("50");
		Thread.sleep(3000);
		pagination.deselectByVisibleText("50");
	}
	
	public String toastmesg(){
//		showMessageDialog(null,RGCToast.getText());
		System.out.println(RGCToast.getText());
		rategroups.click();
	return RGCToast.getText();
	
//		showMessageDialog(null,RGCToast.getText());
		}
	
	
	
	
	
	
	

}
