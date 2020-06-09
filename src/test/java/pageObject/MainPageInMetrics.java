package pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class MainPageInMetrics {

    public static void ClickLinkNaMidia(WebDriver driver) throws InterruptedException{
        driver.findElement(By.linkText("Na Mídia")).click();
    }
}
