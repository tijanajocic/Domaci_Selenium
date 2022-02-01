package domaci_28_01;

import java.util.Scanner;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class zadatak1 {

	public static void main(String[] args) throws InterruptedException {
		Scanner s = new Scanner(System.in);
		System.out.println("Unesite broj zvezdica: ");
		int t = s.nextInt();

		System.setProperty("webdriver.chrome.driver", "driver-lib/chromedriver.exe");
		WebDriver drajver = new ChromeDriver();
		drajver.manage().window().maximize();
		drajver.get("https://s.bootsnipp.com/iframe/WaXlr");
//	    WebElement element = drajver.findElement(By.xpath("//*[@id='rating-star-1']"));
//		element.click();

		if (t == 1) {
			WebElement element = drajver.findElement(By.xpath("//*[@id='rating-star-1']"));
			element.click();
		} else if (t == 2) {
			WebElement element1 = drajver.findElement(By.xpath("//*[@id='rating-star-2']"));
			element1.click();
		} else if (t == 3) {
			WebElement element2 = drajver.findElement(By.xpath("//*[@id='rating-star-3']"));
			element2.click();
		} else if (t == 4) {
			WebElement element3 = drajver.findElement(By.xpath("//*[@id='rating-star-4']"));
			element3.click();

		} else {
			WebElement element4 = drajver.findElement(By.xpath("//*[@id='rating-star-5']"));
			element4.click();

		}

		drajver.close();
	}

}




//1. Zadatak 
//Maksimizirati prozor
//Ucitati stranicu https://s.bootsnipp.com/iframe/WaXlr
//Od korisnika ucitati broj na koju zvezdicu je potrebno kliknuti (u rasponu od 1 do 5)
//I izvrsite akciju klik na odgovarajuci element
//Na kraju programa ugasite pretrazivac.
