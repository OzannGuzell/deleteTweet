import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class DeleteTweet extends BasePage {
    By tweetOptions = new By.ByXPath("(//button[@data-testid='caret'])[1]");
    By deleteTweet = new By.ByCssSelector("[data-testid='Dropdown'] > div:first-of-type");
    By retweet = new By.ByXPath("(//span[@data-testid='socialContext'])[1]");
    By unRetweet = new By.ByXPath("(//button[@data-testid='unretweet'])[1]");
    By unRetweetConfirm = new By.ByCssSelector("[data-testid='unretweetConfirm']");
    By deleteTweetConfirm = new By.ByCssSelector("[data-testid='confirmationSheetConfirm']");
    By bookMark = new By.ByXPath("(//button[@data-testid='bookmark'])[1]");

    public DeleteTweet(WebDriver driver) {
        super(driver);
    }

    public void delete_tweet(){
       if(isVisible(bookMark)){
           while (isVisible(retweet)){
               System.out.println("Retweet found, retweet is being undone.");
               isVisible(unRetweet);
               click(unRetweet);
               isVisible(unRetweetConfirm);
               click(unRetweetConfirm);
               if (!isVisible(unRetweet)) {
                   driver.navigate().refresh();
                   break;
               }
           }
           while (isVisible(tweetOptions)){
               System.out.println("The tweet was deleted.");
               isDisplayed(tweetOptions);
               click(tweetOptions);
               isVisible(deleteTweet);
               click(deleteTweet);
               isVisible(deleteTweetConfirm);
               click(deleteTweetConfirm);
               if (!isVisible(bookMark)) {break;}
           }
       } else {
           System.out.println("No tweets found to delete.");
       }

    }

}
