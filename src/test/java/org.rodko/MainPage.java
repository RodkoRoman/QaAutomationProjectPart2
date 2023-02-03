package org.rodko;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MainPage {
    public WebDriver driver;

    /**
     * конструктор класса, занимающийся инициализацией полей класса
     */
    public MainPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
        this.driver = driver;
    }

    /**
     * определение локатора кнопки "Альпинизм"
     */
    @FindBy(xpath = "//*[@id=\"navbarSupportedContent\"]/div/div/ul[1]/li[4]/a")
    private WebElement mountaineeringBtn;

    /**
     * метод для нажатия кнопки "Фльпинизм"
     */
    public void entryMountaineering() {
        mountaineeringBtn.click();
    }

}
