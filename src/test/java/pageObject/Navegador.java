package pageObject;

import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Navegador {

    public static WebDriver navegador(){
    WebDriver driver;
    System.setProperty("webdriver.chrome.driver", "C:\\Drivers\\chromedriver_win32\\chromedriver.exe");
    driver = new ChromeDriver();
    org.openqa.selenium.Dimension tamanhoJanela = new Dimension(1280, 1024);
    driver.manage().window().setSize(tamanhoJanela);
    driver.get("https://www.inmetrics.com.br");
    driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
    return driver;
}

    public static void tearDown(WebDriver driver){
    driver.quit();
}
}
