package treinamento.steps;

import cucumber.api.java.pt.Dado;
import cucumber.api.java.pt.Então;
import cucumber.api.java.pt.Quando;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import treinamento.pages.LoginPage;
import treinamento.setup.Hooks;

public class RealizarLoginSteps {

    public static WebDriver driver;

    private LoginPage loginPage = new LoginPage(Hooks.getDriver());

    @Dado("^que eu esteja no site do broadleaf$")
    public void que_eu_esteja_no_site_do_broadleaf() throws Throwable {

        Assert.assertTrue("Página login não foi apresentada",loginPage.checkPage());

    }

    @Quando("^faço o preenchimento do usuario \"([^\"]*)\" e senha \"([^\"]*)\"$")
    public void faço_o_preenchimento_do_usuario_e_senha(String user, String senha) throws Throwable {

    loginPage.realizarLogin(user, senha);

    }

    @Então("^eu sou logado com sucesso$")
    public void eu_sou_logado_com_sucesso() throws Throwable {

        Assert.assertFalse("Login não realizado", loginPage.checkLogin());
    }
}




