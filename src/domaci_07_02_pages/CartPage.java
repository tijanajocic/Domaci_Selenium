package domaci_07_02_pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

public class CartPage {
	
	WebDriver driver;
	JavascriptExecutor js;
	WebDriverWait wait;

	public CartPage(WebDriver driver, WebDriverWait wait) {
		this.driver = driver;
		this.wait = wait;
	}

	public boolean isProductInTheCart() {
		boolean isProductInTheCart;
		String value = driver.findElement(By.id("quantity_6203c14ada11f")).getAttribute("value");
		if (value.equals("2")) {
			return isProductInTheCart = true;
		}
		return isProductInTheCart = false;
	}
	
	public WebElement getRemoveButton() {
		return driver.findElement(By.className("remove"));
	}
	
	public boolean isCartEmpty() {

		boolean isCartEmpty = false;
		try {
			driver.findElement(By.xpath("//*[contains(text(),'Your cart is currently empty.')]"));
			isCartEmpty = true;
		} catch (Exception e) {
			isCartEmpty = false;
		}
		return isCartEmpty;
	}

}


