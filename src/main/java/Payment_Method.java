import org.openqa.selenium.By;

public class Payment_Method extends Utils
{
    public void selectPaymentMethod(){
        clickonElements(By.id("paymentmethod_1"));
    }

    public void clickOnContinueButton(){
        clickonElements(By.xpath("//button[@class=\"button-1 payment-method-next-step-button\"]"));
    }

}
