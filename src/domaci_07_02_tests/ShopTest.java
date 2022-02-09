package domaci_07_02_tests;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import domaci_07_02_pages.CartPage;
import domaci_07_02_pages.MainPage;
import domaci_07_02_pages.ProductPage;
import net.jodah.failsafe.internal.util.Assert;

public class ShopTest {
	private WebDriver driver;
	private MainPage mainPage;
	private ProductPage productPage;
	private CartPage cartPage;
	private WebDriverWait wait;

	@BeforeMethod
	public void beforeMethod() {
		System.setProperty("webdriver.chrome.driver", "driver-lib\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		driver.navigate().to("https://cms.demo.katalon.com/");
		wait = new WebDriverWait(driver, 10);
		SoftAssert softAssertion = new SoftAssert();
		
		mainPage = new MainPage(driver, wait);
		productPage = new ProductPage(driver, wait);
		cartPage = new CartPage(driver, wait);
		
	}

	@Test
	public void formTest() throws InterruptedException {
		mainPage.getShopButton().click();
		mainPage.getFirstProductButton().click();
		productPage.getQuantityUpButton().click();
		Assert.assertTrue(productPage.isTextFound(), "No message shown.");
		productPage.getViewCartButton().click();
		Assert.assertTrue(cartPage.isProductInTheCart(), "Cart empty.");
		cartPage.getRemoveButton().click();
		Assert.assertTrue(cartPage.isCartEmpty(), "Cart is not empty.");
	}

	@AfterMethod
	public void afterMethod() throws InterruptedException {
		driver.quit();
	}


}
