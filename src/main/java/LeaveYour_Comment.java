import org.openqa.selenium.By;
import org.testng.Assert;

public class LeaveYour_Comment extends Utils
{


    public void clickOnNewsReleaseDetails(){
        clickonElements(By.xpath("//div[@class=\"news-items\"]/div[2]/div[3]/a"));
    }

    public void waitsUntilPageIsVisible(){
        waituntilvisible(By.className("page-title"), 5);
    }

    public void typeCommentTitle(){
        TypetextofElements(By.id("AddNewComment_CommentTitle"), "Best Online Store to Buy Computer Components");
    }

    public void typeComment(){
        TypetextofElements(By.id("AddNewComment_CommentText"), "Bought Intel Core i7-12700K processors, the price was reasonable and the customer service was really helpful to deal with order processing and fast shipment");
    }

    public void clickOnNewCommentButton(){
        clickonElements(By.name("add-comment"));
    }

    public void verifyThecommentAddedMessage() {
        Assert.assertEquals(getTextElement(By.xpath("//div[@class=\"result\"]")), "News comment is successfully added.", "The message doesn't match the actual");
    }

    public void verifyThecommentIsPosted(){
       // commentList(By.xpath("//div[@class=\"comment-title\"]"));
        Assert.assertEquals(commentList(By.xpath("//div[@class=\"comment-title\"]")), "Best Online Store to Buy Computer Components", "Does not exist");


    }

}
