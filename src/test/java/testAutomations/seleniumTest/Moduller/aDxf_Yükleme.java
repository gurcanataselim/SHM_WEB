package testAutomations.seleniumTest.Moduller;

import org.junit.Test;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import testAutomations.Kullanici;

public class aDxf_Yükleme extends testAutomations.TestBase {

    @FindBy(xpath = "//span[contains(text(),'Modüller')]")
    public WebElement modullerButonu;

    @FindBy(xpath = "//span[contains(text(),'Dxf Yükleme')]")
    public WebElement DxfYükleme;

    @FindBy(id = "file")
    public WebElement Gözat;

    @FindBy(xpath = "//span[contains(text(),'Gözat')]")
    public WebElement GözatButonu;

    @FindBy(xpath = "//div[contains(text(),'Projeksiyon Seçiniz...')]")
    public WebElement ProjeksiyonSecimi;

    @FindBy(xpath = "//body/div[@id='root']/div[1]/div[2]/div[5]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/div[2]/div[1]")
    public WebElement ProjeksiyonSecimiTürü;

    @FindBy(xpath = "//span[contains(text(),'Haritaya Yükle')]")
    public WebElement YukleButonu;


    @Test
    public void testDxf_Yükleme() throws Exception {
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

        Fwait.until(ExpectedConditions.visibilityOf(DxfYükleme));
        DxfYükleme.click();

        Fwait.until(ExpectedConditions.visibilityOf(GözatButonu));
        Thread.sleep(1000);
        Gözat.sendKeys("C:/Users/hakan.beyhan/Desktop/Mania Planı-5_27_2022_1653650292830.dxf");
        Thread.sleep(1000);

        Fwait.until(ExpectedConditions.visibilityOf(ProjeksiyonSecimi));
        ProjeksiyonSecimi.click();

        Fwait.until(ExpectedConditions.visibilityOf(ProjeksiyonSecimiTürü));
        ProjeksiyonSecimiTürü.click();

        Fwait.until(ExpectedConditions.visibilityOf(YukleButonu));
        YukleButonu.click();

        System.out.println("Test Tamamlandı!");
        Thread.sleep(3000);


    }
}
