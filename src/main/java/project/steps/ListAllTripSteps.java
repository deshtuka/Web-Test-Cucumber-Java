package project.steps;

import io.cucumber.java.en.And;
import project.manager.PageManager;

public class ListAllTripSteps {

    PageManager pageManager = PageManager.getPageManager();

    @And("^Нажать на \"Создать командировку\"$")
    public void clickButtonCreateTrip() {
        pageManager.getListAllTripPage().clickButtonCreateTrip();
    }

}
