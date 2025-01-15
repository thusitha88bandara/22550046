package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class ProductPage {
    WebDriver driver;

    // Locators
    @FindBy(id = "atcBtn_btn_1") // Add to Cart button
    WebElement addToCartButton1;

    @FindBy(id = "watchBtn_btn_1") // Proceed to checkout button
    WebElement addToWatchList1;

    @FindBy(id = "binBtn_btn_1") // Proceed to Buy It Now
    WebElement buyItNow1;

    @FindBy(id = "wrong element") // Proceed to Buy It Now
    WebElement wrongElement1;

    // Constructor to initialize elements
    public ProductPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    // Methods Used in Products Page
    public void buyItNow() {
        buyItNow1.click();
    }

    public void addToCart() {
        addToCartButton1.click();
    }

    public void addToWatchList() {
        addToWatchList1.click();
    }

    public void wrongElementTest() {
        wrongElement1.click();
    }
}
