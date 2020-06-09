package pageObject;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ConhecaFinalistasPremioExecutivoPage {

    public static void validarTitulodaPagina(WebDriver driver){
        String textoTitle = driver.findElement(By.xpath("/html/body//section[@class='content-top']//h1[.='Conheça os finalistas do prêmio Executivo de TI do Ano 2020']")).getText();
        String textoExperado = "Conheça os finalistas do prêmio Executivo de TI do Ano 2020";
        Assert.assertEquals(textoExperado,textoTitle);
    }

    public static void validarExibicaoLinkFacebook(WebDriver driver){
        WebElement facebook = driver.findElement(By.cssSelector(".ssba_facebook_share > img[alt='Share on Facebook']"));
        if(facebook.isDisplayed()){
            System.out.println("Ícone Facebook exibido com sucesso!");
        }else {
            System.out.println("Ícone Facebook não disponível");
        }
    }

    public static void validarExibicaoLinkTwitter(WebDriver driver) {
        WebElement twitter = driver.findElement(By.cssSelector(".ssba_twitter_share > img[alt='Tweet about this on Twitter']"));
        if (twitter.isDisplayed()) {
            System.out.println("Ícone Twitter exibido com sucesso!");
        } else {
            System.out.println("Ícone Twitter não disponível");
        }
    }

    public static void validarExibicaoLinkLinkedIn (WebDriver driver){
        WebElement linkedin = driver.findElement(By.cssSelector(".ssba_linkedin_share.ssba_share_link > img[alt='Share on LinkedIn']"));
        if (linkedin.isDisplayed()) {
            System.out.println("Ícone LinkedIn exibido com sucesso!");
        } else {
            System.out.println("Ícone LinkedIn não disponível");
        }
    }
}