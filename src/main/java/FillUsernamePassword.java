import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class FillUsernamePassword extends BasePage{
    By emailTextBox = new By.ByCssSelector("[autocomplete='username']");
    By forwardButton = new By.ByXPath("//span[text()='İleri']");
    By passwordTextBox = new By.ByCssSelector("[type='password']");
    By loginButton = new By.ByCssSelector("[data-testid='LoginForm_Login_Button']");
    By userName = new By.ByCssSelector("[data-testid='ocfEnterTextTextInput']");

    public FillUsernamePassword(WebDriver driver) {
        super(driver);
    }

    public void fill_username_password(String email,String username,String password) {
        isVisible(emailTextBox);
        type(emailTextBox, email);
        System.out.println("Username entered");
        click(forwardButton);
        isVisible(userName);
        if (isDisplayed(userName)) {
            type(userName, username);
            click(forwardButton);
        }
        isVisible(passwordTextBox);
        type(passwordTextBox, password);
        System.out.println("Password entered");
        click(loginButton);
        System.out.println("Login button clicked");
    }
}
