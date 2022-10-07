package project.steps;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import project.manager.PageManager;

public class CreateTripSteps {

    PageManager pageManager = PageManager.getPageManager();

    @And("^Проверка наличия на странице заголовка \"Создать командировку\"$")
    public void checkTitleCreateTrip() {
        pageManager.getCreateTripPage().checkTitleCreateTrip();
    }

    @And("^В разделе \"Подразделение\" выбрать \"(.+)\"$")
    public void selectSubdivision(String textOption) {
        pageManager.getCreateTripPage().selectSubdivision(textOption);
    }

    @And("^В разделе \"Принимающая организация\" нажать \"Открыть список\"$")
    public void openSelectHostCompany() {
        pageManager.getCreateTripPage().openSelectHostCompany();
    }

    @And("^В разделе \"Принимающая организация\" выбрать любое значение в \"Укажите организацию\"$")
    public void selectCompanyFromList() {
        pageManager.getCreateTripPage().selectCompanyFromList();
    }

    @And("^В разделе \"Задачи\" установить чекбокс на \"Заказ билетов\"$")
    public void putCheckboxTicketBooking() {
        pageManager.getCreateTripPage().putCheckboxTicketBooking();
    }

    @And("^В разделе \"Сведения\" заполнить поля$")
    public void enterCitiesOrDatesOfDepartureArrival(DataTable mapKeyAndValue) {
        mapKeyAndValue.asMap(String.class, String.class).forEach((key, value) ->
                pageManager.getCreateTripPage().enterValueIntoInputAndCheck((String) key, (String) value));
    }

    @And("^Нажать \"Сохранить и закрыть\"$")
    public void clickSaveAndClose() {
        pageManager.getCreateTripPage().clickSaveAndClose();
    }

    @And("^Проверить наличие сообщения \"Список командируемых сотрудников не может быть пустым\"$")
    public void checkMessageError() {
        pageManager.getCreateTripPage().checkMessageError();
    }
}
