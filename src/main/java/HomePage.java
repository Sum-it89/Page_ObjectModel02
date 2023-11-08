import org.openqa.selenium.By;

public class HomePage extends Utils
{


    public void waitUntilRegistrationLinkClickable(){
        waituntilclickable(By.linkText("Register"), 5);
    }
    public void clickOnRegisterLink (){
        clickonElements(By.linkText("Register"));
    }

    public void waitUntilUserisInHomepage(){
        waitforUrltobe(5);
    }

    public void clickOnMacBookLink(){
        clickonElements(By.xpath("//img[@alt=\"Picture of Apple MacBook Pro 13-inch\"]"));
    }

    public void clickOnSearchBoxAndTypeText(){
        TypetextofElements(By.id("small-searchterms"), "Nike");
    }

    public void clickOnSearchButtonInHomepage(){
        clickonElements(By.xpath("//button[@type=\"submit\"]"));
    }

}
