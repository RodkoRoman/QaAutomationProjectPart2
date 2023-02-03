package org.rodko;

import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class PriceTest {
    public static WebDriver driver;
    public static MainPage mainPage;
    public static MountaineeringPage mountaineeringPage;
    public static BracesPage bracesPage;
    public static RodPage rodPage;


    /**
     * осуществление первоначальной настройки
     */
    @BeforeClass
    public static void setup() {
        //определение пути до драйвера и его настройка
        System.setProperty("webdriver.chrome.driver", "D:\\Users\\Rodko-RS\\chromedriver\\chromedriver.exe");

        //создание экземпляра драйвера
        driver = new ChromeDriver();
        mainPage = new MainPage(driver);
        mountaineeringPage = new MountaineeringPage(driver);
        bracesPage = new BracesPage(driver);
        rodPage = new RodPage(driver);

        //окно разворачивается на полный экран
        driver.manage()
                .window()
                .maximize();

        //задержка на выполнение теста = 10 сек.
        driver.manage()
                .timeouts()
                .implicitlyWait(10, TimeUnit.SECONDS);

        //получение ссылки на страницу входа из файла настроек
        driver.get("https://tramontana.ru/");
    }

    /**
     * тестовый метод для проверки цены товара
     */
    @Test
    public void priseTest() {
        //С главной страницы заходим в раздел "Альпинизм"
        mainPage.entryMountaineering();

        //Со страницы альпинизм переходим в раздел "Оттяжки"
        mountaineeringPage.entryBraces();

        //Нажимаем на кнопку "Удочка для встегивания оттяжек KAILAS Clip Up III"
        bracesPage.entryRodForBraces();

        //Проверяем имя продукта
        String productName = rodPage.getProductName();
        Assert.assertEquals("Удочка для встегивания оттяжек KAILAS Clip Up III", productName);

        //Проверяем цену продукта
        String productPrice = rodPage.getProductPrice();
        Assert.assertEquals("4 950 ₽", productPrice);
    }

    /**
     * отключение драйвера
     */
    @AfterClass
    public static void driverQuit() {
        driver.quit();
    }
}
