package domaci_01_02;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class zadatak1 {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "driver-lib/chromedriver.exe");
		WebDriver drajver = new ChromeDriver();
		drajver.get("https://www.udemy.com/courses/search/?src=ukw&q=slksd");
		drajver.manage().window().maximize();
		WebDriverWait wait = new WebDriverWait(drajver, Duration.ofSeconds(15));
		wait.until(ExpectedConditions.presenceOfElementLocated(
				By.xpath("//*[contains(@class, 'language-selector-button--button--1wgoL')]")));
		drajver.findElement(By.xpath("//button[contains(@class, 'language-selector-button--button--1wgoL')]")).click();

		boolean t;
		try {
			wait.until(ExpectedConditions.presenceOfElementLocated(
					By.xpath("//*[contains(@class, 'udlite-modal-title udlite-heading-lg')]")));
			drajver.findElement(By.xpath("//*[contains(@class, 'udlite-modal-title udlite-heading-lg')]"));
			t = true;
		} catch (Exception e) {
			t = false;
		}

		if (t) {
			System.out.println("Prikazao se.");
		} else {
			System.out.println("Nije.");
		}

	}

}



//
//1.Zadatak
//Napisati program koji :
//Ucitava stranicu https://www.udemy.com/courses/search/?src=ukw&q=slksd
//Klikce na dugme za jezik i proverava da li se prikazuje dijalog za promenu jezika
//Stampa u konzoli tekst “Dijalog se prikazao”

