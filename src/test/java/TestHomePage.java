import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;

public class TestHomePage extends BaseTestPage {

    @Test
    public void login() throws InterruptedException {
        HomePage homePage = new HomePage(driver);
        homePage.setClickSignInButton();
        homePage.setClickCreateNewAccountButton();
        homePage.setClickSocialTitleButton();
        String name = "Neringa";
        homePage.setInputName(name);
        String lastName = "Kazlauskaitė";
        homePage.setInputLastName(lastName);
        String email = "neringa7.kazlauskaite@email.com";
        homePage.setInputEmail(email);
        String password = "Neringa123";
        homePage.setInputPassword(password);
        String birthday = "11/06/1989";
        homePage.setInputBirthdate(birthday);
        homePage.setAgreeToTheTermsButton();
        homePage.setAgreeCustomerDataButton();
        homePage.setClickSaveButton();
        homePage.setClickMyAccountButton();
        Assertions.assertTrue(driver.getCurrentUrl().contains("my-account"));
        homePage.setClickLogoutButton();
        homePage.setInputEmailToSignIn(email);
        homePage.setInputPasswordToSignIn(password);
        homePage.setClickButtonToSignIn();
        Assertions.assertTrue(driver.getCurrentUrl().contains("my-account"));
    }
}