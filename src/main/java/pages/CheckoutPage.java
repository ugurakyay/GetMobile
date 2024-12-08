package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CheckoutPage {
    private WebDriver driver;

    // Locators
    private By nameField = By.id("name");
    private By addressField = By.id("address");
    private By paymentButton = By.id("payment");

    public CheckoutPage(WebDriver driver) {
        this.driver = driver;
    }

    public void fillDetails(String name, String address) {
        driver.findElement(nameField).sendKeys(name);
        driver.findElement(addressField).sendKeys(address);
    }

    public void proceedToPayment() {
        driver.findElement(paymentButton).click();
    }
}
