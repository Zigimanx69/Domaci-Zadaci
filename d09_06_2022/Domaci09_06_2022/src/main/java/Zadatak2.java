package SeleniumUvod;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class Zadatak2 {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver",
                "C:\\Users\\zigim\\OneDrive\\Documents\\Desktop\\projectiGit\\Domaci-Zadaci\\d3_06_2022\\untitled\\src\\main\\resources\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.navigate().to("https://www.tutorialrepublic.com/snippets/bootstrap/table-with-add-and-delete-row-feature.php");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        for (int i = 0; i < 5; i++) {

            driver.findElement(By.xpath("//button[contains(@class,'btn btn-info add-new')]")).click();
            driver.findElement(By.name("name")).sendKeys("Igor Djokic");
            driver.findElement(By.name("department")).sendKeys("Human Centar");
            driver.findElement(By.name("phone")).sendKeys("+32455888");
            driver.findElement(By.xpath("/html/body/div/div/div/table/tbody/tr[last()]/td[4]/a[1]/i")).click();


        }
        driver.quit();


    }
}
