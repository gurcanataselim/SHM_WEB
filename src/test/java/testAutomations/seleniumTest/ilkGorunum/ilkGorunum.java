package testAutomations.seleniumTest.ilkGorunum;

import org.junit.Test;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import testAutomations.Kullanici;

public class ilkGorunum extends testAutomations.TestBase {

    private String baseUrl;
    private boolean acceptNextAlert = true;

    @FindBy(xpath = "//body/div[@id='root']/div[1]/div[2]/div[4]/div[1]/button[2]/i[1]")
    public WebElement ilkGorunumBtr;
    @FindBy(xpath = "//span[contains(text(),'Havaalanı Listesi')]")
    public WebElement HavalimanıList;
    @FindBy(xpath = "//tbody/tr[9]/td[1]/div[1]/button[1]/span[1]/span[1]")
    public WebElement HavalimanıListsec;
    @FindBy(xpath = "//tbody/tr[12]/td[1]/div[1]/button[1]/span[1]/span[1]")
    public WebElement Verigir;
    @Test
    public void testilkGorunum() throws Exception {
        PageFactory.initElements(driver , this);
        JavascriptExecutor js = (JavascriptExecutor) driver;

        try{
            kullaniciGirisYap(driver, Kullanici.KULLANICI1);
        }catch (Exception e){
            Logger.warn("Kullanıcı login olamadı.");
        }
        Thread.sleep(3000);



        Fwait.until(ExpectedConditions.visibilityOf(HavalimanıList));
        HavalimanıList.click();


        Thread.sleep(3000);
//
//        Verigir.sendKeys("10");
//        Thread.sleep(3000);


        Fwait.until(ExpectedConditions.visibilityOf(HavalimanıListsec));
        HavalimanıListsec.click();

        Thread.sleep(8000);

        try {

            Fwait.until(ExpectedConditions.visibilityOf(ilkGorunumBtr));
            ilkGorunumBtr.click();
        }catch(Exception e){
            Logger.warn("İlk görünüme gidilemedi.");
        }


        System.out.println("Test Tamamlandı!");
        Thread.sleep(8000);
    
}
}