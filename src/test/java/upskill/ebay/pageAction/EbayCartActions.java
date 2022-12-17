package upskill.ebay.pageAction;

import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import upskill.ebay.pageElements.EbayCartLocators;
import upskill.utilities.SetupDrivers;

public class EbayCartActions {
	EbayCartLocators EbayCartLocatorsObj;
	
	public EbayCartActions (){
		EbayCartLocatorsObj = new EbayCartLocators();
		PageFactory.initElements(SetupDrivers.driver,EbayCartLocatorsObj);
		
	}
	public void switchNewWindow() {
		for (String winhandle : SetupDrivers.driver.getWindowHandles()) {
		SetupDrivers.driver.switchTo(). window(winhandle);}
		
	}	
		
	public void SelectSizeTypeDD() throws Exception {
		Thread.sleep(2000);
		Select dropDownObj = new Select(EbayCartLocatorsObj.ddSizeType);
		dropDownObj.selectByVisibleText("Big & Tall");
		Thread.sleep(2000);
		
	}
	public void selectMenSizeDD() throws Exception {
		Thread.sleep(2000);
		Select dropDownObj = new Select(EbayCartLocatorsObj.ddMenSize);
		//dropDownObj.selectByVisibleText("8XL");
		//dropDownObj.selectByIndex("5");
		dropDownObj.selectByValue("5");
		Thread.sleep(2000);
		
		
	}
	public void selectShadeDD() throws Exception {
		Thread.sleep(2000);
		Select dropDownObj = new Select(EbayCartLocatorsObj.ddShade);
		dropDownObj.selectByVisibleText("Black");
		Thread.sleep(2000);
				
	}
	public void enterQuantity() throws Exception {
		Thread.sleep(2000);
		EbayCartLocatorsObj.txtbxQty.clear ();
		EbayCartLocatorsObj.txtbxQty.sendKeys ("2");
	
		
	}
	public void addtoCart () throws Exception {
		Thread.sleep(2000);
		EbayCartLocatorsObj.btnAddCart.click ();
		Thread.sleep(2000);
			
		
	}
}