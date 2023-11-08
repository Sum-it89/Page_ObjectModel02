import org.openqa.selenium.By;

public class Billing_Address extends Utils
{
    public void fillShippingInformation(){
        SelectByValue(By.xpath("//select[@data-trigger=\"country-select\"]"), "233");
        TypetextofElements(By.id("BillingNewAddress_City"), "London");
        TypetextofElements(By.id("BillingNewAddress_Address1"), "123 Springfield Ave");
        TypetextofElements(By.id("BillingNewAddress_ZipPostalCode"), "SE10 6LY");
        TypetextofElements(By.id("BillingNewAddress_PhoneNumber"), "07768892534");
    }

    public void waitUntilFirstNameIsVisible(){
        waituntilvisible(By.id("BillingNewAddress_FirstName"), 5);
    }
    public void clickOnContinue(){
        clickonElements(By.xpath("//button[@onclick=\"Billing.save()\"]"));
    }

}
