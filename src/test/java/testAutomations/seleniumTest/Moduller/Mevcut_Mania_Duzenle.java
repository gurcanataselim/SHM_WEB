package testAutomations.seleniumTest.Moduller;

import org.junit.Test;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import testAutomations.Kullanici;

public class Mevcut_Mania_Duzenle extends testAutomations.TestBase {

    @FindBy(xpath = "//span[contains(text(),'Modüller')]")
    public WebElement modullerButonu;

    @FindBy(xpath = "//body/div[@id='root']/div[1]/div[2]/div[2]/div[2]/div[1]/div[1]/div[1]/div[5]")
    public WebElement MevcutMania;

    @FindBy(xpath = "//body/div[@id='root']/div[1]/div[2]/div[2]/div[2]/div[1]/div[1]/div[1]/div[5]/div[1]/div[1]/div[2]")
    public WebElement DuzenleButonu;

    @FindBy(xpath = "//input[@id='search-tree-data']")
    public WebElement BaslıkFitreleme;

    @FindBy(xpath = "//tbody/tr[1]/td[3]/div[1]/div[1]")
    public WebElement DurumSecimi;

    @FindBy(xpath = "//body/div[@id='menu-']/div[3]/ul[1]/li[3]")
    public WebElement PasifDurumSecimi;

    @FindBy(xpath = "//tbody/tr[2]/td[1]/div[1]/button[1]/span[1]/span[1]")
    public WebElement OnizlemeButonu;

    @FindBy(xpath = "//tbody/tr[2]/td[1]/div[1]/button[3]/span[1]/span[1]")
    public WebElement DosyaSilmeButonu;

    @FindBy(xpath = "//button[contains(text(),'Evet, eminim!')]")
    public WebElement DosyaSilmeEminimButonu;


    @Test
    public void testMevcut_Mania_Duzenle() throws Exception {
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

        Fwait.until(ExpectedConditions.visibilityOf(DuzenleButonu));
        DuzenleButonu.click();

        Fwait.until(ExpectedConditions.visibilityOf(BaslıkFitreleme));
        BaslıkFitreleme.sendKeys("test2222");
//
//        Fwait.until(ExpectedConditions.visibilityOf(DurumSecimi));
//        DurumSecimi.click();

//        Thread.sleep(1000);
//        Fwait.until(ExpectedConditions.visibilityOf(PasifDurumSecimi));
//        PasifDurumSecimi.click();

        Fwait.until(ExpectedConditions.visibilityOf(OnizlemeButonu));
        OnizlemeButonu.click();

        Fwait.until(ExpectedConditions.visibilityOf(DosyaSilmeButonu));
        DosyaSilmeButonu.click();

        Fwait.until(ExpectedConditions.visibilityOf(DosyaSilmeEminimButonu));
        DosyaSilmeEminimButonu.click();

        System.out.println("Test Tamamlandı!");
        Thread.sleep(3000);


    }
}
