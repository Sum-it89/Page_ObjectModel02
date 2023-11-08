import org.openqa.selenium.By;

public class Alert_PopUps extends Utils
{
    public void clickSearchAndAcceptAlert(){
        clickonElements(By.xpath("//button[@type=\"submit\"]"));
        alertAccept();
    }

    public void clickVoteAndAcceptAlert(){
        clickonElements(By.xpath("//button[@id=\"vote-poll-1\"]"));
        alertAccept();
    }


}
