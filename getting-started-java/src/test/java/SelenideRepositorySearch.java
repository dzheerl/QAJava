package github;


import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.*;


public class SelenideRepositorySearch {

    @Test
    void shouldFindSelenideRepositoryAtTheTop() {
        // открыть главную страницу
        open("https://github.com/");
        // ввести в поле поиска selenide и нажать enter
        $(".header-search-button").click();
        $("#query-builder-test").setValue("selenide").pressEnter();
        // кликнуть на первый репозиторий из списка найденых
        $$(".search-match").first().click();
        // проверка: заголовок selenide/selenide
        $("#repository-container-header").shouldHave(text("selenide / selenide"));
    }
}