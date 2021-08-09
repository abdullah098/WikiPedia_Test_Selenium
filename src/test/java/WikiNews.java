import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

import java.util.concurrent.TimeUnit;

public class WikiNews {

    OpenBrowswe browser = new OpenBrowswe();

    @Test
    public void WikiNews(){

        browser.StartWebBrouser();
        browser.driver.manage().window().maximize();
        browser.driver.get("https://www.wikipedia.org/");

        //scroll
        WebElement element = browser.driver.findElement(By.xpath("//*[@id=\"www-wikipedia-org\"]/div[7]/div[3]/div[5]/a"));
        ((JavascriptExecutor) browser.driver).executeScript("arguments[0].scrollIntoView(true);", element);
        try{
            TimeUnit.SECONDS.sleep(3);
        }catch (InterruptedException e){
            e.printStackTrace();
        }

//        WebElement element = browser.driver.findElement(new By.ByXPath("//*[@id=\"www-wikipedia-org\"]/div[7]/div[3]/div[5]/a"));
//        Actions actions = new Actions(browser.driver);
//        actions.moveToElement(element);
//        actions.perform();


        //click wikinews
        browser.driver.findElement(new By.ByXPath("//*[@id=\"www-wikipedia-org\"]/div[7]/div[3]/div[5]/a")).click();


        try{
            TimeUnit.SECONDS.sleep(3);
        }catch (InterruptedException e){
            e.printStackTrace();
        }
        browser.driver.close();
    }

}
