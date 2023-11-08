import org.openqa.selenium.By;
import org.testng.Assert;

public class Order_MacBookPro extends Utils
{
    public void verifyMacBookUrlToBe(){
        waitforUrltobe(5);
    }


    public void clickOnAddToCartButton(){

        clickonElements(By.xpath("//button[@id=\"add-to-cart-button-4\"]"));
    }

    public void clickOnTheShoppingCart(){
        clickonElements(By.className("ico-cart"));
    }

    public void waitUntilItemIsAddedIntheCart(){
        waituntilvisible(By.xpath("//span[@class=\"cart-qty\"]"), 5);
    }




}


