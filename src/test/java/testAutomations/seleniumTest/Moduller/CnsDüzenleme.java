package testAutomations.seleniumTest.Moduller;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import testAutomations.Kullanici;

import java.io.File;

public class CnsDüzenleme extends testAutomations.TestBase {

    @FindBy(xpath = "//span[contains(text(),'Modüller')]")
    public WebElement modullerButonu;

    @FindBy(xpath = "//span[contains(text(),'CNS Düzenleme')]")
    public WebElement CnsDüzenlemeButonu;

    @FindBy(xpath = "//input[@id='search-tree-data']")
    public WebElement BaslıkFiltreleme;

    @FindBy(xpath = "//tbody/tr[1]/td[2]/div[1]/div[1]")
    public WebElement TipSecimi;

    @FindBy(xpath = "//body/div[@id='menu-']/div[3]/ul[1]/li[2]")
    public WebElement TipCvorSecimi;

    @FindBy(xpath = "//tbody/tr[1]/td[4]/div[1]/div[1]/input[1]")
    public WebElement isimFitreleme;

    @FindBy(xpath = "//tbody/tr[1]/td[5]/div[1]/div[1]")
    public WebElement durumFiltreleme;

    @FindBy(xpath = "//body/div[@id='menu-']/div[3]/ul[1]/li[2]")
    public WebElement durumFiltrelemeAktifSecimi;

    @FindBy(xpath = "//tbody/tr[2]/td[1]/div[1]/button[1]/span[1]/span[1]")
    public WebElement HaritadaGösterislevi;

    @FindBy(xpath = "//tbody/tr[2]/td[1]/div[1]/button[3]/span[1]/span[1]")
    public WebElement CnsSilmeİslevi;

    @FindBy(xpath = "//button[contains(text(),'Evet, eminim!')]")
    public WebElement EvetEminimOnayı;



    @Test
    public void testCnsDüzenleme() throws Exception {
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

        Fwait.until(ExpectedConditions.visibilityOf(CnsDüzenlemeButonu));
        CnsDüzenlemeButonu.click();
        Thread.sleep(4000);
        Fwait.until(ExpectedConditions.visibilityOf(BaslıkFiltreleme));
        BaslıkFiltreleme.sendKeys("testotomasyon");
        Thread.sleep(2000);

//        Fwait.until(ExpectedConditions.visibilityOf(TipSecimi));
//        TipSecimi.click();
//        Thread.sleep(2000);
//
//        Fwait.until(ExpectedConditions.visibilityOf(TipCvorSecimi));
//        TipCvorSecimi.click();
//
//        Fwait.until(ExpectedConditions.visibilityOf(isimFitreleme));
//        isimFitreleme.sendKeys("CVOR_3000");
//        Thread.sleep(1000);
//        Fwait.until(ExpectedConditions.visibilityOf(durumFiltreleme));
//        durumFiltreleme.click();
//        Thread.sleep(1000);
//        Fwait.until(ExpectedConditions.visibilityOf(durumFiltrelemeAktifSecimi));
//        durumFiltrelemeAktifSecimi.click();

        Fwait.until(ExpectedConditions.visibilityOf(HaritadaGösterislevi));
        Thread.sleep(1000);
        HaritadaGösterislevi.click();

        Fwait.until(ExpectedConditions.visibilityOf(CnsSilmeİslevi));
        Thread.sleep(1000);
        CnsSilmeİslevi.click();

        Fwait.until(ExpectedConditions.visibilityOf(EvetEminimOnayı));
        Thread.sleep(1000);
        EvetEminimOnayı.click();


        System.out.println("Test Tamamlandı!");
        Thread.sleep(3000);


    }
}
