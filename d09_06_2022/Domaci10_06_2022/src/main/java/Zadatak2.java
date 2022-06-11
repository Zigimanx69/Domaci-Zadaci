package Domaci2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.time.Duration;
import java.util.List;
import java.util.Random;

public class Zadatak2 {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver",
                "C:\\Users\\zigim\\OneDrive\\Documents\\Desktop\\projectiGit\\Domaci-Zadaci\\d3_06_2022\\untitled\\src\\main\\resources\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.navigate().to("https://geodata.solutions/");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

        Select s = new Select(driver.findElement(By.id("countryId")));
        List<WebElement> niz = s.getOptions();
        Random ran = new Random();
        int broj = ran.nextInt(niz.size());
        s.selectByIndex(broj);
        Thread.sleep(5000);

        Select s2 = new Select(driver.findElement(By.id("stateId")));
        List<WebElement> niz2 = s2.getOptions();
        Random ran2 = new Random();
        int broj2 = ran2.nextInt(niz2.size());
        s2.selectByIndex(broj2);
        Thread.sleep(5000);


        Select s3 = new Select(driver.findElement(By.id("cityId")));
        List<WebElement> niz3 = s3.getOptions();
        Random ran3 = new Random();
        int broj3 = ran3.nextInt(niz3.size());
        s3.selectByIndex(broj3);
        Thread.sleep(5000);


        System.out.println("Country is: " + niz.get(broj).getText());
        System.out.println("State is: " + niz.get(broj2).getText());
        System.out.println("City is: " + niz.get(broj3).getText());
        driver.quit();

    }
}
