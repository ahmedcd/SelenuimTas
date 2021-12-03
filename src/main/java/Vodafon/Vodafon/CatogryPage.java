package Vodafon.Vodafon;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CatogryPage extends PageBase {

	public CatogryPage(WebDriver driver) {
		super(driver);
	}

	@FindBy(linkText = "WOMEN")
	WebElement women;

	@FindBy(xpath = "//*[@id=\"subcategories\"]/ul/li[1]/div[1]/a")
	WebElement top;

	@FindBy(xpath = "//*[@id=\"subcategories\"]/ul/li[2]/div[1]/a")
	WebElement blouses;

	@FindBy(xpath = "//*[@id=\"center_column\"]/ul/li/div/div[1]/div/a[1]/img")
	WebElement productItem;

	@FindBy(xpath = "//*[@id=\"center_column\"]/ul/li/div/div[2]/div[2]/a[1]/span")
	WebElement Add_to_card;

	// method to choose item to buy
	public void chooseItemFromCatogery() {

		women.click();
		top.click();
		blouses.click();
		productItem.click();

	}

}
