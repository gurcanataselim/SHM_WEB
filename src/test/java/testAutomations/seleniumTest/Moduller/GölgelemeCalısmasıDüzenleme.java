package testAutomations.seleniumTest.Moduller;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import testAutomations.Kullanici;

import java.io.File;

public class GölgelemeCalısmasıDüzenleme extends testAutomations.TestBase {

    @FindBy(xpath = "//span[contains(text(),'Modüller')]")
    public WebElement modullerButonu;

    @FindBy(xpath = "//body/div[@id='root']/div[1]/div[2]/div[2]/div[2]/div[1]/div[1]/div[1]/div[2]/div[1]/span[1]")
    public WebElement GölgelemeCalısmasıButonu;

    @FindBy(xpath = "//span[contains(text(),'Gölgeleme Çalışması Düzenleme')]")
    public WebElement GölgelemeCalısmasıDüzenlemeButonu;

    @FindBy(xpath = "//input[@id='search-tree-data']")
    public WebElement FiltrelemeButonu;

    @FindBy(xpath = "//tbody/tr[1]/td[1]/div[1]/button[1]/span[1]/span[1]")
    public WebElement HaritadaGöster;

    @FindBy(xpath = "//tbody/tr[1]/td[1]/div[1]/button[2]")
    public WebElement PasifeAl;

    @FindBy(xpath = "//button[contains(text(),'Evet, eminim!')]")
    public WebElement EvetEminimButonu;

    @FindBy(xpath = "//tbody/tr[1]/td[1]/div[1]/button[3]/span[1]/span[1]")
    public WebElement SilmeButonu;


    @Test
    public void testGölgelemeCalısmasıDüzenleme() throws Exception {
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

        Fwait.until(ExpectedConditions.visibilityOf(GölgelemeCalısmasıButonu));
        GölgelemeCalısmasıButonu.click();

        Fwait.until(ExpectedConditions.visibilityOf(GölgelemeCalısmasıDüzenlemeButonu));
        GölgelemeCalısmasıDüzenlemeButonu.click();

        Fwait.until(ExpectedConditions.visibilityOf(FiltrelemeButonu));
        FiltrelemeButonu.sendKeys("testotomasyonhat");

        Fwait.until(ExpectedConditions.visibilityOf(HaritadaGöster));
        HaritadaGöster.click();

        Fwait.until(ExpectedConditions.visibilityOf(PasifeAl));
        PasifeAl.click();

        Fwait.until(ExpectedConditions.visibilityOf(EvetEminimButonu));
        EvetEminimButonu.click();



        System.out.println("Test Tamamlandı!");
        Thread.sleep(3000);


    }
}
