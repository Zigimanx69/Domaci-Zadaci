package Domaci2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.List;

public class Zadatak1 {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver",
                "C:\\Users\\zigim\\OneDrive\\Documents\\Desktop\\projectiGit\\Domaci-Zadaci\\d3_06_2022\\untitled\\src\\main\\resources\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.navigate().to("https://s.bootsnipp.com/iframe/Dq2X");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        List<WebElement> dynamicElement = driver.findElements(By.xpath("//button[contains(@class, 'close')][last()]"));

        for (int i = 0; i < 5; i++) {
            driver.findElement(By.xpath("//button[contains(@class, 'close')][last()]")).click();
            if(dynamicElement.size() != 0){
                System.out.println("Element present");
            }
            else{
                System.out.println("Element not present");
            }
        }
           driver.quit();

    }
}
