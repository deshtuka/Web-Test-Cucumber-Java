package project.manager;

import project.pages.LoginPage;
import project.pages.MainPage;
import project.pages.ListAllTripPage;
import project.pages.CreateTripPage;

public class PageManager {

    private static PageManager pageManager;

    private LoginPage loginPage;
    private MainPage mainPage;
    private ListAllTripPage listAllTripPage;
    private CreateTripPage createTripPage;

    private PageManager() {
    }

    public static PageManager getPageManager() {
        if (pageManager == null) {
            pageManager = new PageManager();
        }
        return pageManager;
    }

    /** Инициализация объектов страниц */
    public LoginPage getLoginPage() {
        if (loginPage == null) {
            loginPage = new LoginPage();
        }
        return loginPage;
    }

    public MainPage getMainPage() {
        if (mainPage == null) {
            mainPage = new MainPage();
        }
        return mainPage;
    }

    public ListAllTripPage getListAllTripPage() {
        if (listAllTripPage == null) {
            listAllTripPage = new ListAllTripPage();
        }
        return listAllTripPage;
    }

    public CreateTripPage getCreateTripPage() {
        if (createTripPage == null) {
            createTripPage = new CreateTripPage();
        }
        return createTripPage;
    }
}