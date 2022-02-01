package domaci_31_01;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class zadatak2 {

	public static void main(String[] args) {

		WebDriver drajver = new ChromeDriver();

		drajver.manage().window().maximize();
		drajver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
		
		drajver.navigate().to("https://geodata.solutions/");

		Select dropdownCountry = new Select(drajver.findElement(By.name("country")));
		Select dropdownState = new Select(drajver.findElement(By.name("state")));
		Select dropdownCity = new Select(drajver.findElement(By.name("city")));
		
		dropdownCountry.selectByVisibleText("Algeria");
		dropdownState.selectByVisibleText("Algiers");
		dropdownCity.selectByVisibleText("Rouiba");
		

		drajver.close();

	}
	
	
//	
//	Napisati program koji ucitava stranicu https://geodata.solutions/
//		Bira proizvoljan Country, State i City
//		Pritom potrebno je izvrsiti cekanje da se povaje State-ovi nakon izbora Country-a
//		I takodje je potrebno izvrsiti cekanje da se ucitaju gradovi nakon izbora State-a
//		Izabrerit Country, State i City tako da imate podatke da selektujete!


}

}

}
