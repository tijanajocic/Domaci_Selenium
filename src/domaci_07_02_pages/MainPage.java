package domaci_07_02_pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

public class MainPage {
	WebDriver driver;
	WebDriverWait wait;

	public MainPage(WebDriver driver, WebDriverWait wait) {
		this.driver = driver;
		this.wait = wait;
	}

	public WebElement getShopButton() {
		return driver.findElement(By.xpath("//*[@id= 'primary-menu']//li[5]/a"));
	}

	public WebElement getFirstProductButton() {
		return driver.findElement(
				By.xpath("//*[contains(@class, 'woocommerce-LoopProduct-link woocommerce-loop-product__link')]"));
	}

}
