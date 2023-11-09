import org.openqa.selenium.By;
import org.testng.Assert;

public class Search_NikePage extends Utils
{

    public void verifyUserInNikeBrandPage(){
        waitforUrltobe(5);
    }

    public void verifyAllItemsContainsNike(){
      itemByBrand(By.xpath("//h2[@class=\"product-title\"]"));
      Assert.assertTrue(getTextElement(By.xpath("//h2[@class=\"product-title\"]")).contains("Nike"));
    }

//    public void verifyItemsWithBrand(){
//        Assert.assertTrue(itemByBrand(By.xpath("//h2[@class=\"product-title\"]")).contains("Nike"));
//
//    }






}
