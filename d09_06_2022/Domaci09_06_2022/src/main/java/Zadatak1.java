package SeleniumUvod;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.lang.reflect.InvocationTargetException;
import java.util.List;
import java.util.Scanner;

public class Zadatak1 {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver",
                "C:\\Users\\zigim\\OneDrive\\Documents\\Desktop\\projectiGit\\Domaci-Zadaci\\d3_06_2022\\untitled\\src\\main\\resources\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        Scanner s = new Scanner(System.in);


        driver.manage().window().maximize();
        driver.navigate().to("https://s.bootsnipp.com/iframe/WaXlr");
        List<WebElement> niz = driver.findElements(By.xpath("//button[contains(@id, 'rating-star')]"));

        System.out.println("Unesite broj u rasponu od 1 do 5: ");
        int num = s.nextInt();
        niz.get(num - 1).click();
        Thread.sleep(5000);
        driver.quit();

    }


}

