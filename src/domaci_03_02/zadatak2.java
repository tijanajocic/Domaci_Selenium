package domaci_03_01;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class zadatak2 {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "driver-lib/chromedriver.exe");

		WebDriver drajver = new ChromeDriver();
		JavascriptExecutor js = (JavascriptExecutor) drajver;

		drajver.navigate().to("https://www.wikipedia.org/");

		WebElement jezik1 = drajver.findElement(By.xpath("//body"));

		List<WebElement> list = drajver.findElements(By.xpath("//div[contains(@class, 'central-featured')]//a"));

		for (int i = 0; i < list.size(); i++) {
			js.executeScript("window.open(arguments[0]);", list.get(i));
		}

	}
}

//2.Zadatak
//Napisati program koji:
//Ucitava stanicu https://www.wikipedia.org/
//Sa stranice sakuplja sve linkove (jezike) i svaki link otvara u novom prozoru pretrazivaca
//Svaki link potrebno je otvoriti u novom tabu.
//Skripta: window.open(arguments[0]);
