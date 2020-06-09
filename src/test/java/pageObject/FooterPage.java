package pageObject;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.beans.Visibility;

import static org.openqa.selenium.support.ui.ExpectedConditions.visibilityOfElementLocated;

public class FooterPage {



    public static void validarExibicaoLinkFacebook(WebDriver driver){
        WebDriverWait wait = new WebDriverWait(driver, 10);
        WebElement facebook = wait.until(visibilityOfElementLocated(By.xpath("/html/body/ul//a[@title='Facebook']")));

        if(facebook.isDisplayed()){
            System.out.println("Link Facebook Exibido");
        } else{
            System.out.println("Link Facebook Não Exibido");
        }
    }

    public static void validarExibicaoLinkTwitter(WebDriver driver){
        WebDriverWait wait = new WebDriverWait(driver, 5);
        WebElement twitter = wait.until(visibilityOfElementLocated(By.xpath("/html/body/ul//a[@title='Twitter']")));

        if(twitter.isDisplayed()){
            System.out.println("Link Twitter Exibido");
        } else{
            System.out.println("Link Twitter Não Exibido");
        }
    }

    public static void validarExibicaoLinkLinkedIn(WebDriver driver){
        WebDriverWait wait = new WebDriverWait(driver, 5);
        WebElement linkedin = wait.until(visibilityOfElementLocated(By.xpath("/html/body/ul//a[@title='Linkedin']")));
        if(linkedin.isDisplayed()){
            System.out.println("Link linkedin Exibido");
        } else{
            System.out.println("Link linkedin Não Exibido");
        }
    }

    public static void validarExibicaoLinkYouTube(WebDriver driver){
        WebElement youtube = driver.findElement(By.xpath("/html/body/ul//a[@title='Youtube']"));
        if(youtube.isDisplayed()){
            System.out.println("Link Youtube Exibido");
        } else{
            System.out.println("Link Youtube Não Exibido");
        }
    }
}
