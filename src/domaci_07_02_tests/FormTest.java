package domaci_07_02_tests;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import domaci_07_02_pages.fromPage;
import net.jodah.failsafe.internal.util.Assert;

public class FormTest {

	private WebDriver driver;
	private fromPage formPage;
	private WebDriverWait wait;

	@BeforeMethod
	public void beforeMethod() {
		System.setProperty("webdriver.chrome.driver", "driver-lib\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		driver.navigate().to("file:///C:/Users/Rajovic/Downloads/form.html");
		wait = new WebDriverWait(driver, 10);

		formPage = new fromPage(driver, wait);
	}

	@Test
	public void formTest() throws InterruptedException {
		formPage.getFullNameInput().sendKeys("Nikola Rajovic");
		formPage.getGenderRadioButton("male").click();
		formPage.getDOBInput().sendKeys("21.08.1992.");
		formPage.getEmailInput().sendKeys("nickryan@gmail.com");
		formPage.roleSelect("QA");
		formPage.getCheckboxInput(1).click();
		formPage.getCheckboxInput(2).click();
		formPage.getCommentInput().sendKeys("Hello.");
		formPage.getSubmitButton().click();
		Thread.sleep(1000);
		Assert.assertTrue(formPage.isDataSaved(), "Data is not saved.");
	}

	@AfterMethod
	public void afterMethod() throws InterruptedException {
		driver.quit();
	}

}
