package testAutomations.seleniumTest.havacilikCalismasiOnayPaneli;

import org.junit.Test;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import testAutomations.Kullanici;


public class haritadaGor extends testAutomations.TestBase {
    private String baseUrl;
    private boolean acceptNextAlert = true;

    @FindBy(xpath = "//span[contains(text(),'Hesap')]")
    public WebElement hesapBtn;


    @FindBy(xpath = "//span[contains(text(),'Havacılık Çalışması Onay Paneli')]")
    public WebElement havacilikCalismasiOnayPaneliBtn;

// test1 için haritada gör butonu kullanılmıştır.
    @FindBy(xpath = "//tbody/tr[7]/td[1]/div[1]/button[1]/span[1]/span[1]")
    public WebElement haritadaGorBtn;





    @Test
    public void testharitadaGor() throws Exception {
        PageFactory.initElements(driver, this);
        JavascriptExecutor js = (JavascriptExecutor) driver;

        try{
            kullaniciGirisYap(driver, Kullanici.KULLANICI1);
        }catch (Exception e){
            Logger.warn("Kullanıcı login olamadı.");
        }


        Thread.sleep(3000);

        Fwait.until(ExpectedConditions.visibilityOf(hesapBtn));
        hesapBtn.click();

        Fwait.until(ExpectedConditions.visibilityOf(havacilikCalismasiOnayPaneliBtn));
        havacilikCalismasiOnayPaneliBtn.click();




        try{
            Fwait.until(ExpectedConditions.visibilityOf(haritadaGorBtn));
            haritadaGorBtn.click();
        }catch(Exception e){
            Logger.warn("İlk eklenen kayıt test1 haritada gösterilemedi.");
        }










//        String bodyText = driver.findElement(By.xpath("//body/div[@id='root']/div[1]/div[2]/div[5]")).getText();
//        Assert.assertTrue("Text not found!", bodyText.contains("Nesne"));

//        act.keyDown(Keys.CONTROL).sendKeys("v").keyUp(Keys.CONTROL).perform();
//        act.keyDown(Keys.ENTER).keyUp(Keys.ENTER).perform();

//
//        System.out.println("File is Uploaded Successfully");


        System.out.println("Test Tamamlandı!");
        Thread.sleep(3000);
    }
}