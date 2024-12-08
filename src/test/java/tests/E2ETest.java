package tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.CartPage;
import pages.CheckoutPage;
import pages.HomePage;
import pages.ProductPage;
import utils.TestBase;

public class E2ETest extends TestBase {
    @Test
    public void testE2EFlow() {
        // Step 1: Home Page
        HomePage homePage = new HomePage(driver);
        homePage.searchProduct("Smartphone");

        // Step 2: Product Page
        ProductPage productPage = new ProductPage(driver);
        productPage.addToCart();

        // Step 3: Cart Page
        CartPage cartPage = new CartPage(driver);
        Assert.assertTrue(cartPage.isProductInCart("Smartphone"), "Product not found in cart");

        // Step 4: Checkout Page
        CheckoutPage checkoutPage = new CheckoutPage(driver);
        checkoutPage.fillDetails("John Doe", "123 Street, City");
        checkoutPage.proceedToPayment();

        // Step 5: Verify Completion
        Assert.assertTrue(driver.getPageSource().contains("Sipariş başarıyla tamamlandı"), "Order not completed");
    }
}
