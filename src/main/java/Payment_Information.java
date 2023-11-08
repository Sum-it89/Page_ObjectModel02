import org.openqa.selenium.By;

public class Payment_Information extends Utils
{
    public void fillPaymentMethod(){
        SelectByValue(By.id("CreditCardType"), "MasterCard");
        TypetextofElements(By.id("CardholderName"), "Homer Simpson");
        TypetextofElements(By.id("CardNumber"), "4921823183219404");
        SelectByValue(By.id("ExpireMonth"), "8");
        SelectByValue(By.id("ExpireYear"), "2028");
        TypetextofElements(By.id("CardCode"), "789");
        clickonElements(By.xpath("//button[@onclick=\"PaymentInfo.save()\"]"));


    }


}
