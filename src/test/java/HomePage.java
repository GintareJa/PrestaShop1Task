import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
    WebDriver driver;

//konstruktorius

    public HomePage(WebDriver driver) {
        this.driver = driver;
    }

    //    lokatoriai
    public By clickSignInButton = By.cssSelector("div#_desktop_user_info .hidden-sm-down");
    public By clickCreateNewAccountButton = By.linkText("No account? Create one here");
    public By clickSocialTitleButton = By.cssSelector("label:nth-of-type(2)  input[name='id_gender']");
    public By inputName = By.cssSelector("input#field-firstname");
    public By inputLastName = By.cssSelector("input#field-lastname");
    public By inputEmail = By.cssSelector("input#field-email");
    public By inputPassword = By.cssSelector("input#field-password");
    public By inputBirthdate = By.cssSelector("input#field-birthday");
    public By agreeToTheTermsButton = By.cssSelector("input[name='psgdpr']");
    public By agreeCustomerDataButton = By.cssSelector("input[name='customer_privacy']");
    public By clickSaveButton = By.xpath("//form[@id='customer-form']//button[@type='submit']");
    public By clickMyAccountButton = By.cssSelector("[title] .hidden-sm-down");
    public By clickLogoutButton = By.cssSelector(".page-footer [href]");
    public By inputEmailToSignIn = By.cssSelector("input#field-email");
    public By inputPasswordToSignIn = By.cssSelector("input#field-password");
    public By clickButtonToSignIn = By.cssSelector("button#submit-login");


//    metodai

    public void setClickSignInButton() {
        driver.findElement(clickSignInButton).click();
    }

    public void setClickCreateNewAccountButton() {
        driver.findElement(clickCreateNewAccountButton).click();
    }

    public void setClickSocialTitleButton() {
        driver.findElement(clickSocialTitleButton).click();
    }

    public void setInputName(String name) {
        driver.findElement(inputName).sendKeys(name);
    }

    public void setInputLastName(String lastName) {
        driver.findElement(inputLastName).sendKeys(lastName);
    }

    public void setInputEmail(String email) {
        driver.findElement(inputEmail).sendKeys(email);
    }

    public void setInputPassword(String password) {
        driver.findElement(inputPassword).sendKeys(password);
    }

    public void setInputBirthdate(String birthdate) {
        driver.findElement(inputBirthdate).sendKeys(birthdate);
    }

    public void setAgreeToTheTermsButton() {
        driver.findElement(agreeToTheTermsButton).click();
    }

    public void setAgreeCustomerDataButton() {
        driver.findElement(agreeCustomerDataButton).click();
    }

    public void setClickSaveButton() {
        driver.findElement(clickSaveButton).click();
    }

    public void setClickMyAccountButton() {
        driver.findElement(clickMyAccountButton).click();
    }

    public void setClickLogoutButton() {
        driver.findElement(clickLogoutButton).click();
    }

    public void setInputEmailToSignIn(String email) {
        driver.findElement(inputEmailToSignIn).sendKeys(email);
    }

    public void setInputPasswordToSignIn(String password) {
        driver.findElement(inputPasswordToSignIn).sendKeys(password);
    }

    public void setClickButtonToSignIn() {
        driver.findElement(clickButtonToSignIn).click();
    }
}
