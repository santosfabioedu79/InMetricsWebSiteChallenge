package pageObject;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

import static org.openqa.selenium.support.ui.ExpectedConditions.visibilityOfElementLocated;

public class NaMidiaInMetrics {

    WebDriver driver;


    public static void clickConhecaFinalistas(WebDriver driver){
        WebDriverWait wait = new WebDriverWait(driver, 5);
        WebElement image = wait.until(visibilityOfElementLocated(By.xpath("/html//section[@class='content-top']/div/div[1]/article[1]/a[1]/img")));
        image.click();
    }

    public static void clickNaEssenciaAcessibilidadeDigital(WebDriver driver, WebDriverWait wait){
        WebElement image = wait.until(visibilityOfElementLocated(By.xpath("/html//section[@class='content-top']/div/div[1]/article[2]/a[1]/img")));
        image.click();
    }

    public static void clickFabricantesCelularesAumentamInvestimentoSeguranca(WebDriver driver){
        driver.findElement(By.xpath("/html//section[@class='content-top']/div/div[1]/article[3]/a[1]/img")).click();
    }

    public static void clickOrizonMelhoraProcessamento(WebDriver driver){
        driver.findElement(By.xpath("/html//section[@class='content-top']/div/div[1]/article[4]/a[1]/img")).click();
    }

    public static void clickInmetricsOfereceProgramaEstagioSP(WebDriver driver){
        driver.findElement(By.xpath("/html//section[@class='content-top']/div/div[1]/article[5]/a[1]/img")).click();
    }

    public static void clickInmetricsAbreInscriçõesProgramaTechTalent(WebDriver driver){
        driver.findElement(By.xpath("/html//section[@class='content-top']/div/div[1]/article[6]/a[1]/img")).click();
    }

    public static void clickInmetricsVagasSPMGPR(WebDriver driver){
        driver.findElement(By.xpath("/html//section[@class='content-top']/div/div[1]/article[7]/a[1]/img")).click();
    }

    public static void clickInmetricsBuscaTalentosTecnologiaBrasil(WebDriver driver){
        driver.findElement(By.xpath("/html//section[@class='content-top']/div/div[1]/article[8]/a[1]/img")).click();
    }

    public static void clickInmetricsProgramaTechTalentBrasil(WebDriver driver){
        driver.findElement(By.xpath("/html//section[@class='content-top']/div/div[1]/article[9]/a[1]/img")).click();
    }

    public static void clickNaoEstágio(WebDriver driver){
        driver.findElement(By.xpath("/html//section[@class='content-top']/div/div[1]/article[10]/a[1]/img")).click();
    }

    public static void validarExibicaoTextoConhecaFinalistas(WebDriver driver){
        String textLink1 = driver.findElement(By.xpath("/html//section[@class='content-top']/div/div[1]/article[1]/a[2]/h3[.='Conheça os finalistas do prêmio Executivo de TI do Ano 2020']")).getText();
        String title1 = "Conheça os finalistas do prêmio Executivo de TI do Ano 2020";
        Assert.assertEquals(title1,textLink1);
    }
    public static void validarExibicaoTextoNaEssenciaAcessibilidadeDigital(WebDriver driver){
        String textLink2 = driver.findElement(By.xpath("/html//section[@class='content-top']/div/div[1]/article[2]/a[2]/h3[.='Na essência da acessibilidade digital']")).getText();
        String title2 = "Na essência da acessibilidade digital";
        Assert.assertEquals(title2,textLink2);
    }
    public static void validarExibicaoTextoFabricantesCelularesAumentamInvestimentoSeguranca(WebDriver driver){
        String textLink3 = driver.findElement(By.xpath("/html//section[@class='content-top']/div/div[1]/article[3]/a[2]/h3[.='Fabricantes de celulares aumentam investimento em segurança']")).getText();
        String title3 = "Fabricantes de celulares aumentam investimento em segurança";
        Assert.assertEquals(title3, textLink3);
    }
    public static void validarExibicaoTextoOrizonMelhoraProcessamento(WebDriver driver){
        String textLink4 = driver.findElement(By.xpath("/html//section[@class='content-top']/div/div[1]/article[4]/a[2]/h3")).getText();
        String title4 = "Orizon melhora seu processamento de extração de dados em 10 vezes";
        Assert.assertEquals(title4, textLink4);
    }
    public static void validarExibicaoTextoInmetricsOfereceProgramaEstagioSP(WebDriver driver){
        String textLink5 = driver.findElement(By.xpath("/html//section[@class='content-top']/div/div[1]/article[5]/a[2]/h3[.='Inmetrics oferece programa de estágio em São Paulo']")).getText();
        String title5 = "Inmetrics oferece programa de estágio em São Paulo";
        Assert.assertEquals(title5, textLink5);
    }
    public static void validarExibicaoTextoInmetricsAbreInscriçõesProgramaTechTalent(WebDriver driver){
        String textLink6 = driver.findElement(By.xpath("/html//section[@class='content-top']/div/div[1]/article[6]/a[2]/h3[.='Inmetrics abre inscrições para programa Tech Talent 2020']")).getText();
        String title6 = "Inmetrics abre inscrições para programa Tech Talent 2020";
        Assert.assertEquals(title6, textLink6);
    }
    public static void validarExibicaoTextoInmetricsVagasSPMGPR(WebDriver driver){
        String textLink7 = driver.findElement(By.xpath("/html//section[@class='content-top']/div/div[1]/article[7]/a[2]/h3")).getText();
        String title7 = "Inmetrics abre mais de 100 vagas em São Paulo, Minas Gerais e Paraná";
        Assert.assertEquals(title7, textLink7);
    }
    public static void validarExibicaoTextoInmetricsBuscaTalentosTecnologiaBrasil(WebDriver driver){
        String textLink8 = driver.findElement(By.xpath("/html//section[@class='content-top']/div/div[1]/article[8]/a[2]/h3[.='Inmetrics busca talentos em tecnologia no Brasil']")).getText();
        String title8 = "Inmetrics busca talentos em tecnologia no Brasil";
        Assert.assertEquals(title8, textLink8);
    }
    public static void validarExibicaoTextoInmetricsProgramaTechTalentBrasil(WebDriver driver){
        String textLink9 = driver.findElement(By.xpath("/html//section[@class='content-top']/div/div[1]/article[9]/a[2]/h3")).getText();
        String title9 = "Inmetrics lança programa Tech Talent que busca talentos em tecnologia no Brasil";
        Assert.assertEquals(title9, textLink9);
    }
    public static void validarExibicaoTextoNaoEstágio(WebDriver driver){
        String textLink10 = driver.findElement(By.xpath("/html//section[@class='content-top']/div/div[1]/article[10]/a[2]/h3")).getText();
        String title10 = "Não é estágio: empresa vai efetivar estudantes e ensinar habilidades de TI";
        Assert.assertEquals(title10, textLink10);
    }

    public static void validarTituloNaMidia(WebDriver driver){
        String textMainTitle = driver.findElement(By.xpath("/html//section[@id='topo-deafult']//p[.='Veja onde a Inmetrics apareceu na mídia']")).getText();
        String title = "Veja onde a Inmetrics apareceu na mídia";
        Assert.assertEquals(title, textMainTitle);
    }

    public static void clickBotaoCarregarMais(WebDriver driver){
        WebDriverWait wait = new WebDriverWait(driver, 10);
        WebElement btnCarregarMais = wait.until(visibilityOfElementLocated(By.linkText("CARREGAR MAIS")));
        btnCarregarMais.click();
    }

}
