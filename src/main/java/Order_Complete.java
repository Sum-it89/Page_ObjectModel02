import org.openqa.selenium.By;
import org.testng.Assert;

public class Order_Complete extends Utils
{
    public void orderCompleteMessage (){

        System.out.println( getTextElement(By.xpath("//div[@class=\"section order-completed\"]/div[1]")));
    }

    public void verifyOrderCompleteMessage(){
        Assert.assertEquals(getTextElement(By.xpath("//div[@class=\"section order-completed\"]/div[1]")), "Your order has been successfully processed!", "Message Doesn't match");
    }

}
