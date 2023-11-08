import org.openqa.selenium.By;
import org.testng.Assert;

public class Checkout_Page extends Utils
{
    public void clickOnCheckoutButton(){
        clickonElements(By.xpath("//button[@id=\"checkout\"]"));
    }

    public void closePopUp(){
        clickonElements(By.xpath("//button[@title=\"Close\"]"));
    }

    public void tickTermsOfService(){
        clickonElements(By.name("termsofservice"));
    }

    public void verifyPrice(){
    Assert.assertEquals(getTextElement(By.xpath("//span[@class=\"product-subtotal\"]")), "$3,600.00", "The value doesn't match");
    }




}
