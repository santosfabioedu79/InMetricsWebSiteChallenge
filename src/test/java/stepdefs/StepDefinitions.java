package stepdefs;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.devtools.browser.Browser;
import pageObject.*;

public class StepDefinitions {

    private WebDriver driver;
    public String arg1;

    @Given("^acesso ao portal \"([^\"]*)\"$")
    public void acesso_ao_portal(String arg1) throws Exception {
        this.driver = Navegador.navegador();
    }

    @When("^Clicar no link Na Mídia$")
    public void clicar_no_link_Na_Mídia() throws Exception {
        MainPageInMetrics.ClickLinkNaMidia(this.driver);
    }

    @Then("^a mensagem \"([^\"]*)\" deve ser exibida$")
    public void a_mensagem_deve_ser_exibida(String arg1) throws Exception {
        NaMidiaInMetrics.validarTituloNaMidia(this.driver);
    }

    @Then("^título \"([^\"]*)\" deve ser exibida$")
    public void título_deve_ser_exibida(String arg1) throws Exception {
        NaMidiaInMetrics.validarExibicaoTextoConhecaFinalistas(this.driver);
        NaMidiaInMetrics.validarExibicaoTextoNaEssenciaAcessibilidadeDigital(this.driver);
        NaMidiaInMetrics.validarExibicaoTextoFabricantesCelularesAumentamInvestimentoSeguranca(this.driver);
        NaMidiaInMetrics.validarExibicaoTextoOrizonMelhoraProcessamento(this.driver);
        NaMidiaInMetrics.validarExibicaoTextoInmetricsOfereceProgramaEstagioSP(this.driver);
        NaMidiaInMetrics.validarExibicaoTextoInmetricsAbreInscriçõesProgramaTechTalent(this.driver);
        NaMidiaInMetrics.validarExibicaoTextoInmetricsVagasSPMGPR(this.driver);
        NaMidiaInMetrics.validarExibicaoTextoInmetricsBuscaTalentosTecnologiaBrasil(this.driver);
        NaMidiaInMetrics.validarExibicaoTextoInmetricsProgramaTechTalentBrasil(this.driver);
        NaMidiaInMetrics.validarExibicaoTextoNaoEstágio(this.driver);
    }

    @When("Deve ser exibido link lateral para Facebook")
    public void deve_ser_exibido_link_lateral_para_Facebook() {
        FooterPage.validarExibicaoLinkFacebook(this.driver);
    }

    @When("Deve ser exibido link lateral para Twitter")
    public void deve_ser_exibido_link_lateral_para_Twitter() {
        FooterPage.validarExibicaoLinkTwitter(this.driver);
    }

    @When("Deve ser exibido link lateral para YouTube")
    public void deve_ser_exibido_link_lateral_para_YouTube() {
        FooterPage.validarExibicaoLinkYouTube(this.driver);
    }

    @When("Deve ser exibido link lateral para LikedI")
    public void deve_ser_exibido_link_lateral_para_LikedI() {
        FooterPage.validarExibicaoLinkLinkedIn(this.driver);
    }

    @When("clicar no botão Carregar mais")
    public void clicar_no_botão_Carregar_mais() {
        NaMidiaInMetrics.clickBotaoCarregarMais(this.driver);
    }

    @Then("Atualização da página deve ser realizada")
    public void atualização_da_página_deve_ser_realizada() {
        NaMidiaInMetrics.validarTituloNaMidia(this.driver);
    }

    @Then("clicar no link Conheça os finalistas do prêmio Executivo de TI do Ano {int}")
    public void clicar_no_link_Conheça_os_finalistas_do_prêmio_Executivo_de_TI_do_Ano(Integer int1) {
        NaMidiaInMetrics.clickConhecaFinalistas(this.driver);
    }

    @Then("deve exibir o titulo Conheça os finalistas do prêmio Executivo de TI do Ano {int}")
    public void deve_exibir_o_titulo_Conheça_os_finalistas_do_prêmio_Executivo_de_TI_do_Ano(Integer int1) {
        NaMidiaInMetrics.validarExibicaoTextoConhecaFinalistas(this.driver);
    }

    @Then("Deve ser exibido link para Facebook")
    public void deve_ser_exibido_link_para_Facebook() {
        ConhecaFinalistasPremioExecutivoPage.validarExibicaoLinkFacebook(this.driver);
    }

    @Then("Deve ser exibido link para Twitter")
    public void deve_ser_exibido_link_para_Twitter() {
        ConhecaFinalistasPremioExecutivoPage.validarExibicaoLinkTwitter(this.driver);
    }

    @Then("Deve ser exibido link para LikedIn")
    public void deve_ser_exibido_link_para_LikedIn() {
        ConhecaFinalistasPremioExecutivoPage.validarExibicaoLinkLinkedIn(this.driver);
    }
    @Then("fechar o navegador")
    public void fechar_o_navegador() {
        Navegador.tearDown(this.driver);
    }
    @Then("deve exibir o titulo da página conheça os finalistas do prêmio Executivo de TI do Ano {int}")
    public void deve_exibir_o_titulo_da_página_conheça_os_finalistas_do_prêmio_Executivo_de_TI_do_Ano(Integer int1) {
        ConhecaFinalistasPremioExecutivoPage.validarTitulodaPagina(this.driver);
    }

}