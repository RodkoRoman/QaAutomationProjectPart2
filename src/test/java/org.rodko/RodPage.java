package org.rodko;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RodPage {
    public WebDriver driver;

    /**
     * конструктор класса, занимающийся инициализацией полей класса
     */
    public RodPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
        this.driver = driver;
    }

    /**
     * определение локатора названия товара
     */
    @FindBy(xpath = "//*[@id=\"pright\"]/div[2]")
    WebElement productName;

    /**
     * определение локатора цены товара
     */
    @FindBy(xpath = "//*[@id=\"pright\"]/div[4]/div/span")
    WebElement productPrice;

    /**
     * метод для вытягивания названия товара
     */
    public String getProductName() {
        return productName.getText();
    }

    /**
     * метод для вытягивания цены товара
     */
    public String getProductPrice() {
        return productPrice.getText();
    }


}
