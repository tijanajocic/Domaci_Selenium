package domaci_31_01;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class zadatak1 {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "driver-lib/chromedriver.exe");
		WebDriver drajver = new ChromeDriver();
		drajver.manage().window().maximize();
		drajver.get("https://s.bootsnipp.com/iframe/Dq2X");

		List<WebElement> elementi = drajver.findElements(By.xpath("//*[contains(@class, 'col-md-12')]//button"));

		for (int i = 1; i <= elementi.size(); i++) {
			drajver.findElement(By.xpath("//*[contains(@class, 'col-md-12')]//div[last()]/button")).click();
			Thread.sleep(1000);
			List<WebElement> brisanjaElemenata = drajver
					.findElements(By.xpath("//*[contains(@class, 'col-md-12')]//button"));
			if (brisanjaElemenata.size() == elementi.size() - i) {
				System.out.println("Jeste");
			} else {
				System.out.println("Nije");
			}
		}

		drajver.close();
	}
}


//
//1.Zad
//Napisati program koji:
//Ucitava stranicu https://s.bootsnipp.com/iframe/Dq2X
//Klikce na svaki iks da ugasi obavestenje i proverava da li se nakon klika element obrisao sa stranice i ispisuje odgovarajuce poruke (OVO JE POTREBNO RESITI KORISCENJEM PETLJE)
//POMOC: Brisite elemente odozdo.
