import io.github.bonigarcia.wdm.config.DriverManagerType;
import io.github.bonigarcia.wdm.managers.ChromeDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class OpenBrowswe {
    WebDriver driver;

    public void StartWebBrouser (){
        ChromeDriverManager.getInstance(DriverManagerType.CHROME).setup();
        this.driver = new ChromeDriver();
    }
}
