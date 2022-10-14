package testAutomations.seleniumTest.Moduller;

import org.junit.Test;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import testAutomations.Kullanici;

public class aMevcut_Mania_Dosya_Ekle extends testAutomations.TestBase {

    @FindBy(xpath = "//span[contains(text(),'Modüller')]")
    public WebElement modullerButonu;

    @FindBy(xpath = "//body/div[@id='root']/div[1]/div[2]/div[2]/div[2]/div[1]/div[1]/div[1]/div[5]")
    public WebElement MevcutMania;

    @FindBy(xpath = "//body[1]/div[1]/div[1]/div[2]/div[2]/div[2]/div[1]/div[1]/div[1]/div[5]/div[1]/div[1]/div[1]/span[1]")
    public WebElement EkleButonu;

    @FindBy(id = "raised-button-file")
    public WebElement DosyaButonu;

    @FindBy(xpath = "//span[contains(text(),'Dosya')]")
    public WebElement Dosya;

    @FindBy(xpath = "//body[1]/div[1]/div[1]/div[2]/div[5]/div[2]/div[1]/div[3]/div[3]/span[1]/span[1]/span[1]")
    public WebElement YukleButonu;


    @Test
    public void testMevcut_Mania_Dosya_Ekle() throws Exception {
        PageFactory.initElements(driver, this);
        JavascriptExecutor js = (JavascriptExecutor) driver;

        Thread.sleep(2000);

        try{
            kullaniciGirisYap(driver, Kullanici.KULLANICI1);
        }catch (Exception e){
            Logger.warn("Kullanıcı login olamadı.");
        }
        Fwait.until(ExpectedConditions.visibilityOf(modullerButonu));
        modullerButonu.click();

        Fwait.until(ExpectedConditions.visibilityOf(MevcutMania));
        MevcutMania.click();

        Fwait.until(ExpectedConditions.visibilityOf(EkleButonu));
        EkleButonu.click();

        Fwait.until(ExpectedConditions.visibilityOf(Dosya));

        DosyaButonu.sendKeys("C:/Users/hakan.beyhan/Desktop/test2222.kml");

        Fwait.until(ExpectedConditions.visibilityOf(YukleButonu));
        YukleButonu.click();

        System.out.println("Test Tamamlandı!");
        Thread.sleep(3000);


    }
}
