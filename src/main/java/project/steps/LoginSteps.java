package project.steps;

import io.cucumber.java.en.And;
import project.manager.PageManager;

public class LoginSteps {

    PageManager pageManager = PageManager.getPageManager();

    @And("^Ожидание загрузки страницы и ввод логина \"(.+)\" и пароля \"(.+)\"$")
    public void enterLoginPassword(String login, String password) {
        pageManager.getLoginPage().enterLoginPassword(login, password);
    }

    @And("^Нажать на кнопку \"Авторизоваться\"$")
    public void enterLoginPassword() {
        pageManager.getLoginPage().clickSubmit();
    }
}
