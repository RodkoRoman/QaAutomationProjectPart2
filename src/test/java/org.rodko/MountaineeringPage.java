package org.rodko;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MountaineeringPage {
    public WebDriver driver;

    /**
     * конструктор класса, занимающийся инициализацией полей класса
     */
    public MountaineeringPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
        this.driver = driver;
    }

    /**
     * определение локатора кнопки "Оттяжки"
     */
    @FindBy(xpath = "//*[@id=\"heading69\"]")
    WebElement bracesBtn;

    /**
     * метод для нажатия кнопки "Оттяжки"
     */
    public void entryBraces() {
        bracesBtn.click();
    }
}
