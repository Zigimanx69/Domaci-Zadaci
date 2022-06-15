package Domaci4;

import com.google.common.collect.Table;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class BootstrapTableTests {
    private String firstName = "Igor";
    private String lastName = "Djokic";
    private String middleName = "Aleksandar";
    private WebDriver driver;
    private String baseUrl = "https://s.bootsnipp.com";


    @BeforeClass
    public void beforeClass() {
        System.setProperty("webdriver.chrome.driver",
                "C:\\Users\\zigim\\OneDrive\\Documents\\Desktop\\projectiGit\\Domaci-Zadaci\\d3_06_2022\\untitled\\src\\main\\resources\\chromedriver.exe");
        driver = new ChromeDriver();

    }

    @BeforeMethod
    public void beforreMethd() {
        driver.get(baseUrl);
        driver.manage().window().maximize();

    }

    @Test
    public void editRow() throws InterruptedException {
        driver.get(baseUrl + "/iframe/K5yrx");
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(5));
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        String actualTitle = driver.getTitle();
        String expectedTitle = "Table with Edit and Update Data - Bootsnipp.com";
        Assert.assertEquals(actualTitle, expectedTitle, "Title of page is not correct");

        driver.findElement(By.xpath("//*[@id='d1']/td[5]/button")).click();
        driver.findElement(By.id("fn")).isDisplayed();

        WebElement p = driver.findElement(By.id("fn"));
        p.sendKeys(Keys.DELETE);
        p.clear();
        WebElement w = driver.findElement(By.id("ln"));
        w.sendKeys(Keys.DELETE);
        w.clear();
        WebElement s = driver.findElement(By.id("mn"));
        s.sendKeys(Keys.DELETE);
        s.clear();

        p.sendKeys(firstName);
        w.sendKeys(lastName);
        s.sendKeys(middleName);

        Thread.sleep(3000);

        driver.findElement(By.id("up")).click();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[contains(@class,'modal-content')]")));

        WebElement name = driver.findElement(By.xpath("//*[@id='f1']"));
        String strng = name.getText();
        Assert.assertEquals("Igor", strng, "Name is not matching");

        WebElement last = driver.findElement(By.xpath("//*[@id='l1']"));
        String strng1 = last.getText();
        Assert.assertEquals("Djokic", strng1, "Last name is not matching");

        WebElement middle = driver.findElement(By.xpath("//*[@id='m1']"));
        String strng2 = middle.getText();
        Assert.assertEquals("Aleksandar", strng2, "Middle name is not matching");


        Thread.sleep(5000);

    }

    @Test
    public void testRow() {
        driver.get(baseUrl + "/iframe/K5yrx");
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(5));
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

        String actualTitle = driver.getTitle();
        String expectedTitle = "Table with Edit and Update Data - Bootsnipp.com";
        Assert.assertEquals(actualTitle, expectedTitle, "Title of page is not correct");

        driver.findElement(By.xpath("//*[@id='d1']/td[6]/button")).click();
        wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id='delete']/div[2]/div")));
        driver.findElement(By.id("del")).click();
        WebElement element = driver.findElement(By.xpath("//*[@id='delete']/div[2]/div"));
        try {
            if (element.isDisplayed()) {
                System.out.println("Element is visible");
            }
        } catch (Exception e) {
            System.out.println("Element is invisible");
            ;
        }

        wait.until(ExpectedConditions.invisibilityOf(element));

        List<WebElement> deletedRows = driver.findElements(By.xpath("//table/tbody/tr[0]"));
        Assert.assertTrue(deletedRows.isEmpty(), "[ERROR] Row is not deleted");

    }

    @Test
    public void takeAScreenshoot() throws IOException {
        driver.get(baseUrl + "/iframe/K5yrx");
        String actualTitle = driver.getTitle();
        String expectedTitle = "Table with Edit and Update Data - Bootsnipp.com";
        Assert.assertEquals(actualTitle, expectedTitle, "Title of page is not correct");
        TakesScreenshot scrShot = ((TakesScreenshot) driver);
        File srcFile = scrShot.getScreenshotAs(OutputType.FILE);
        File destFile = new File("src/main/resources/screenshot.png");
        FileHandler.copy(srcFile, destFile);


    }

    @AfterClass
    public void kraj() {
        driver.quit();
    }
}
