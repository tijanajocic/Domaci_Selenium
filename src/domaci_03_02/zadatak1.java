package domaci_03_01;

import java.util.Scanner;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class zadatak1 {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "driver-lib/chromedriver.exe");

		Scanner s = new Scanner(System.in);
		WebDriver drajver = new ChromeDriver();
		JavascriptExecutor js = (JavascriptExecutor) drajver;

		drajver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

		drajver.navigate().to("https://www.google.com/");
		WebElement body = drajver.findElement(By.xpath("//body"));

		System.out.print("Unesite boju : ");
		String color = s.next();

		js.executeScript("arguments[0].style='background:' + arguments[0];", body, color);

	}

}

//
//1.Zadatak 
//Napisati program koji:
//Ucitava stranicu https://www.google.com/
//Hvata body element sa stranicu i njemu setuje atribut 
//style na vrednost “background: nekaBoja”
//Skripta: arguments[0].style=”background: black”;
