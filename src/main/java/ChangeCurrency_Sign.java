import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.ArrayList;
import java.util.List;

public class ChangeCurrency_Sign extends Utils
{
    public void clickOnCurrencySelector(){
        clickonElements(By.name("customerCurrency"));
    }

    public void selectsCurrencyToEuro(){
        SelectElement(By.xpath("//select[@id=\"customerCurrency\"]"), "Euro");
    }

    public void checkThePriceCurrencySign(){
        currencySymbols(By.xpath("//span[@class=\"price actual-price\"]"));
    }

    public void selectCurrencyToDollar(){
        SelectElement(By.xpath("//select[@id=\"customerCurrency\"]"), "US Dollar");
    }



}

