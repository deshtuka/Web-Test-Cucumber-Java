package project.steps;

import io.cucumber.java.en.And;
import project.manager.PageManager;

public class MainSteps {

    PageManager pageManager = PageManager.getPageManager();

    @And("^Проверить наличие заголовка \"Панель быстрого запуска\"$")
    public void checkTitle() {
        pageManager.getMainPage().checkTitle();
    }

    @And("^В выплывающем окне раздела \"Расходы\" нажать на \"Командировки\"$")
    public void clickCostsToTrip() {
        pageManager.getMainPage().clickCostsToTrip();
    }

}
