package pages;
import contants.Constants;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
public class Login extends Header{
    private  WebDriver driver;
    private WebDriverWait wait;
    @FindBy(id = "spree_user_email")
    private WebElement userName;
    @FindBy(id = "spree_user_password")
    private WebElement passWord;
    @FindBy(name = "commit")
    private WebElement loginButton;
    public Login(WebDriver driver){
        super(driver);
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }
    public void as(String email, String Password){
        WebDriverWait wait = new WebDriverWait(driver, Constants.EXPLICIT_WAIT);
        wait.until(ExpectedConditions.elementToBeClickable(userName));
        userName.sendKeys(email);
        passWord.sendKeys(Password);
        loginButton.click();
    }
}
