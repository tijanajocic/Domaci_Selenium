package domaci_01_02;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.opentelemetry.exporter.logging.SystemOutLogExporter;

public class zadatak2 {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "driver-lib/chromedriver.exe");
		WebDriver drajver = new ChromeDriver();
		drajver.get("https://videojs.com/city");
		drajver.manage().window().maximize();

		WebDriverWait wait = new WebDriverWait(drajver, Duration.ofSeconds(100));

		drajver.findElement(By.xpath("//*[@id=\"vjs_video_3\"]/button")).click();

		wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("//*[@id=\"vjs_video_3\"]/button")));

		System.out.println("proso");
		drajver.close();

	}

}

//
//
//2.Zadatak
//Napisti program koji:
//Ucitava stranicu https://videojs.com/city
//Pusta video klikom na play dugme
//Cekamo da se video ucita
//Tako sto proveravamo da li vise to play dugme nije vidljivo

