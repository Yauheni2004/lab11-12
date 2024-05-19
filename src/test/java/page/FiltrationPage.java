package page;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FiltrationPage extends BasePage {
    private final Logger log = LogManager.getLogger();

    @FindBy(xpath = "//*[@id=\'header\']/div/noindex/div/div/div/div/div/nav/div/table/tbody/tr/td[1]/div/a")
    private WebElement catalogButton;

    // рассрочка 0%
    @FindBy(xpath = "//*[@id=\'header\']/div/noindex/div/div/div/div/div/nav/div/table/tbody/tr/td[1]/div/ul/li[2]/ul/li[1]/a/span")
    private WebElement targetElement;

    @FindBy(xpath = "//*[@id=\'content\']/div[4]/div[3]/div/noindex/div/form/div[15]/div[1]")
    private WebElement colorSelect;

    @FindBy(xpath = "//*[@id=\'content\']/div[4]/div[3]/div/noindex/div/form/div[15]/div[2]/div[1]/label[4]/span")
    private WebElement greenColor;

    @FindBy(xpath = "//span[@class='bx_filter_param_text' and @title='Apple']")
    private WebElement appleElement;

    @FindBy(xpath = "//*[@id=\'modef\']/a")
    private WebElement submitButton;

    @FindBy(xpath = "//div[@class='bx_filter_parameters_box_title icons_fa' and contains(text(), 'Бренд')]")
    private WebElement brandElement;

    @FindBy(xpath = "//input[@id='set_filter']")
    private WebElement showButton;

    public FiltrationPage(WebDriver driver) {
        super(driver);
        PageFactory.initElements(this.driver, this);
    }

    public void searchProductWithSomeStats() throws InterruptedException {
        Actions actions = new Actions(driver);
        actions.moveToElement(catalogButton).perform();
        targetElement.click();
        log.info("Target element is clicked");
        showButton.click();
        appleElement.click();
        Thread.sleep(2000);
        showButton.click();

    }
}
