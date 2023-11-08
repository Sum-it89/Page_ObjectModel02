import org.openqa.selenium.By;

public class Confirm_order extends Utils
{
    public void confirmOrder(){
        clickonElements(By.xpath("//button[@class=\"button-1 confirm-order-next-step-button\"]"));
    }
}
