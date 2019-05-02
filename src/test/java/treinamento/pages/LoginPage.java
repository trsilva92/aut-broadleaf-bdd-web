package treinamento.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

    public LoginPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }

    @FindBy(id = "username")
    WebElement campoUsuario;

    @FindBy(id = "password")
    WebElement campoPassword;

    @FindBy(xpath = "//*[@id=\"js-visible\"]/form/div[4]/input")
    WebElement botaoSignIn;

    @FindBy(id = "lightbox")
    WebElement loginRealizado;

    public boolean checkPage() {
        return botaoSignIn.isDisplayed();
    }

    public void realizarLogin(String user, String senha) {

        campoUsuario.sendKeys(user);

        campoPassword.sendKeys(senha);

        botaoSignIn.click();
    }

    public boolean checkLogin() {
        return loginRealizado.isDisplayed();
    }
}
