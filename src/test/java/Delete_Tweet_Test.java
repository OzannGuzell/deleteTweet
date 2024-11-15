import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;

public class Delete_Tweet_Test extends BaseTest{

    DeleteTweet delete_tweet_test;
    FillUsernamePassword fillInformation;
    LeftMenu leftMenu;

    @Test
    @Order(1)
    public void fill_information(){
        fillInformation = new FillUsernamePassword(driver);
        fillInformation.fill_username_password(
                "yourmail",
                "yourusername",
                "yourpassword"
        ); //fill in the information
    }

    @Test
    @Order(2)
    public void select_profile(){
        leftMenu = new LeftMenu(driver);
        leftMenu.click_profile_icon();
    }

    @Test
    @Order(3)
    public void delete_tweet(){
        delete_tweet_test = new DeleteTweet(driver);
        delete_tweet_test.delete_tweet();
    }
}
