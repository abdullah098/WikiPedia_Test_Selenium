import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.openqa.selenium.By;

public class Search {
    OpenBrowswe browser = new OpenBrowswe();
    TimeOut timeOut = new TimeOut();



    @Test
    public void testSearch(){

        browser.StartWebBrouser();
        browser.driver.manage().window().maximize();
        browser.driver.get("https://www.wikipedia.org/");

        timeOut.timeoOut(3);

        //type on searchbar
        browser.driver.findElement(By.cssSelector("#searchInput")).sendKeys("abc");
        timeOut.timeoOut(2);

        //click search button
        try{
            browser.driver.findElement(By.cssSelector(".pure-button.pure-button-primary-progressive")).click();
        }catch(Exception e){
            System.out.println(e);
        }

        timeOut.timeoOut(2);
        browser.driver.close();


    }

}
