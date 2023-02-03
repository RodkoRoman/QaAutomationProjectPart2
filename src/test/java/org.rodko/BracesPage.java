package org.rodko;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BracesPage {
    public WebDriver driver;

    /**
     * конструктор класса, занимающийся инициализацией полей класса
     */
    public BracesPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
        this.driver = driver;
    }

    /**
     * определение локатора кнопки "Удочка для встегивания оттяжек KAILAS Clip Up III"
     */
    @FindBy(xpath = "/html/body/div[2]/main/section/div/div/div[2]/div/div[3]/div/div[18]")
    private WebElement rodForBracesBtn;

    /**
     * метод для нажатия кнопки "Удочка для встегивания оттяжек KAILAS Clip Up III"
     */
    public void entryRodForBraces() {
        rodForBracesBtn.click();
    }

}
