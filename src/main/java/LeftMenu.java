import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LeftMenu extends BasePage{

    By profileText = new By.ByCssSelector("[data-testid='AppTabBar_Profile_Link']");
    By editProfile = new By.ByCssSelector("[data-testid='editProfileButton']");

    public LeftMenu(WebDriver driver) {
        super(driver);
    }

    public void click_profile_icon(){
        isVisible(profileText);
        click(profileText);
        isVisible(editProfile);
        System.out.println("Clicked profile icon");
    }
}
