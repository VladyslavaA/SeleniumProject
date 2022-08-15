import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class FirstTest {

    @Test
    public void check(){

        System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);


        By cardFrom = By.xpath("//input[@data-qa-node='numberdebitSource']");
        By expDate = By.xpath("//input[@data-qa-node='expiredebitSource']");
        By cvv = By.xpath("//input[@data-qa-node='cvvdebitSource']");
        By firstName = By.xpath("//input[@data-qa-node='firstNamedebitSource']");
        By firstNamereceiver = By.xpath("//input[@data-qa-node='firstNamereceiver']");
        By lastNamereceiver = By.xpath("//input[@data-qa-node='lastNamereceiver']");
        By lastName = By.xpath("//input[@data-qa-node='lastNamedebitSource']");
        By cardTo = By.xpath("//input[@data-qa-node='numberreceiver']");
        By amount = By.xpath("//input[@data-qa-node='amount']");
        By toggleComment = By.xpath("//span[@data-qa-node='toggle-comment']");
        By comment = By.xpath("//textarea[@data-qa-node='comment']");
        By submitBtn = By.xpath("//button[@type='submit']");

        driver.get("https://next.privat24.ua/money-transfer/card");
        driver.findElement(cardFrom).sendKeys("4004159115449003");
        driver.findElement(expDate).sendKeys("1129");
        driver.findElement(cvv).sendKeys("123");
        driver.findElement(firstName).sendKeys("Vlada");
        driver.findElement(lastName).sendKeys("Abramenko");
        driver.findElement(cardTo).sendKeys("4552331448138217");
        driver.findElement(amount).sendKeys("1000");
        driver.findElement(firstNamereceiver).sendKeys("TEST");
        driver.findElement(lastNamereceiver).sendKeys("testov");
        driver.findElement(toggleComment).click();
        driver.findElement(comment).sendKeys("test selenium");
        driver.findElement(submitBtn).submit();
    }

}
