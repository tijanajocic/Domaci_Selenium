package domaci_28_01;

import java.util.Scanner;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class zadatak2 {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "driver-lib/chromedriver.exe");
		WebDriver drajver = new ChromeDriver();
		drajver.manage().window().maximize();
		drajver.navigate()
				.to("https://www.tutorialrepublic.com/snippets/bootstrap/table-with-add-and-delete-row-feature.php");
		Scanner s = new Scanner(System.in);

		for (int i = 1; i <= 5; i++) {
			drajver.findElement(By.xpath("//*[contains(@class, btn btn-info add-new')]")).click();
			System.out.println("Name: ");
			String name = s.next();
			System.out.println("Dep: ");
			String dep = s.next();
			System.out.println("Phone: ");
			String phone = s.next();

			drajver.findElement(By.id("name")).sendKeys(name);
			drajver.findElement(By.id("department")).sendKeys(dep);
			drajver.findElement(By.id("phone")).sendKeys(phone);
			drajver.findElement(By.xpath("//*[contains(@class, 'table table-bordered')]/tbody//tr[last()]/td[4]/a[1]"))
					.click();
		}
		drajver.close();
	}

}

//
//2. Zadatak
//Napisati program koji vrsi dodavanje 5 reda u tabelu. 
//Maksimizirati prozor
//Ucitati stranicu https://www.tutorialrepublic.com/snippets/bootstrap/table-with-add-and-delete-row-feature.php
//Dodati red podataka - jedan red u jednoj iteraciji 
//Kliknite na dugme Add New
//Unesite name,departmant i phone (mogu da budu uvek iste vrednost)
//Kliknite na zeleno Add dugme
//Na kraju programa ugasite pretrazivac.

