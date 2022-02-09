package domaci_07_02_pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ProductPage {

	WebDriver driver;
	JavascriptExecutor js;
	WebDriverWait wait;

	public ProductPage(WebDriver driver, WebDriverWait wait) {
		this.driver = driver;
		this.wait = wait;
	}

	public void scrollToAddToCartButton() {
		js = (JavascriptExecutor) driver;
		WebElement addToCart = driver.findElement(By.name("add-to-cart"));
		js.executeScript("arguments[0].scrollIntoView", addToCart);
	}

	public WebElement getQuantityUpButton() {
		return driver.findElement(By.xpath("//*[contains(@class, 'quantity-button quantity-up')]"));
	}

	public WebElement getAddToCartButton() {
		return driver.findElement(By.xpath("//*[contains(@class, 'quantity-button quantity-up')]"));
	}

	public boolean isTextFound() {
		boolean isTextFound = false;
		wait.until(
				ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[contains(@class,'woocommerce-message')]")));
		try {
			driver.findElement(By.xpath("//*[contains(@class,'woocommerce-message')]"));
			isTextFound = true;
		} catch (Exception e) {
			isTextFound = false;
		}
		return isTextFound;
	}

	public WebElement getViewCartButton() {
		return driver.findElement(By.xpath("//*[contains(@class, 'button wc-forward')]"));
	}

}
