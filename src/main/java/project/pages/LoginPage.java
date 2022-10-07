package project.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends BasePage {

    @FindBy(xpath = "//form[@id='login-form']")
    private WebElement formAuth;

    @FindBy(xpath = "//*[@name='_username']")
    private WebElement loginAuth;

    @FindBy(xpath = "//*[@name='_password']")
    private WebElement passwordAuth;

    @FindBy(id = "_submit")
    private WebElement btnAuth;

    public void enterLoginPassword(String login, String password) {
        // Ожидание загрузки страницы и ввод логина/пароля
        this.waitUntilVisibilityOf(formAuth);
        this.enterInput(loginAuth, login);
        this.enterInput(passwordAuth, password);
    }

    public void clickSubmit() {
        // Нажать на кнопку "Авторизоваться"
        this.isDisplayed("Авторизация", btnAuth);
        btnAuth.click();
    }
}
