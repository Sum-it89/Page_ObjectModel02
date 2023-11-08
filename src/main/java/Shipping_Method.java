import org.openqa.selenium.By;

public class Shipping_Method extends Utils
{
    public void selectShippingMethod(){
        clickonElements(By.id("shippingoption_1"));
    }

    public void waitUntilPageLoads(){
        waitforUrltobe(5);
    }

    public void clickContinue(){
        clickonElements(By.xpath("//button[@class=\"button-1 shipping-method-next-step-button\"]"));
    }

}
