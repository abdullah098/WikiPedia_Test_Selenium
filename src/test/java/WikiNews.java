import org.checkerframework.checker.units.qual.A;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class WikiNews {

    OpenBrowswe browser = new OpenBrowswe();
    TimeOut timeOut = new TimeOut();

    @Test
    public void WikiNews(){

        browser.StartWebBrouser();
        browser.driver.manage().window().maximize();
        browser.driver.get("https://www.wikipedia.org/");

        //scroll
        WebElement element = browser.driver.findElement(new By.ByXPath("//*[@id=\"www-wikipedia-org\"]/div[7]/div[3]/div[5]/a"));
        Actions actions = new Actions(browser.driver);
        actions.moveToElement(element);
        actions.perform();


        //click wikinews
        browser.driver.findElement(new By.ByXPath("//*[@id=\"www-wikipedia-org\"]/div[7]/div[3]/div[5]/a")).click();

    }

}
