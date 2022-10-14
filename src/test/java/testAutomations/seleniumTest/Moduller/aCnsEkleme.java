package testAutomations.seleniumTest.Moduller;

import org.junit.Test;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import testAutomations.Kullanici;

public class aCnsEkleme extends testAutomations.TestBase {

    @FindBy(xpath = "//span[contains(text(),'Modüller')]")
    public WebElement modullerButonu;

    @FindBy(xpath = "//span[contains(text(),'CNS Ekleme')]")
    public WebElement CnsEklemeButonu;

    @FindBy(xpath = "//body/div[@id='root']/div[1]/div[2]/div[5]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/input[1]")
    public WebElement CnsAdıEkleme;

    @FindBy(xpath = "//body/div[@id='root']/div[1]/div[2]/div[5]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/input[1]")
    public WebElement Xkoordinat;

    @FindBy(xpath = "//body/div[@id='root']/div[1]/div[2]/div[5]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/input[1]")
    public WebElement ykoordinat;

    @FindBy(xpath = "//body/div[@id='root']/div[1]/div[2]/div[5]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[3]/div[1]/div[1]/input[1]")
    public WebElement zkoordinat;

    @FindBy(xpath = "//body/div[@id='root']/div[1]/div[2]/div[5]/div[1]/div[1]/div[1]/div[3]/div[1]/div[1]/div[1]")
    public WebElement TipSecimi;

    @FindBy(xpath = "//body/div[@id='root']/div[1]/div[2]/div[5]/div[1]/div[1]/div[1]/div[3]/div[1]/div[1]/div[1]/div[2]/div[2]")
    public WebElement TipCvorSecimi;

    @FindBy(xpath = "//body[1]/div[1]/div[1]/div[2]/div[5]/div[1]/div[1]/div[1]/div[4]/button[1]/span[1]/span[1]")
    public WebElement CnsOlusturButonu;


    @Test
    public void testCnsEkleme() throws Exception {
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

        Fwait.until(ExpectedConditions.visibilityOf(CnsEklemeButonu));
        CnsEklemeButonu.click();

        Fwait.until(ExpectedConditions.visibilityOf(CnsAdıEkleme));
        CnsAdıEkleme.sendKeys("testotomasyon");

        Fwait.until(ExpectedConditions.visibilityOf(Xkoordinat));
        Xkoordinat.sendKeys(Keys.chord(Keys.CONTROL,"a", Keys.DELETE));
        Xkoordinat.sendKeys("32.46");

        Fwait.until(ExpectedConditions.visibilityOf(ykoordinat));
        ykoordinat.sendKeys(Keys.chord(Keys.CONTROL,"a", Keys.DELETE));
        ykoordinat.sendKeys("37.78");


        Fwait.until(ExpectedConditions.visibilityOf(zkoordinat));
        zkoordinat.sendKeys(Keys.chord(Keys.CONTROL,"a", Keys.DELETE));
        zkoordinat.sendKeys("125");

        Fwait.until(ExpectedConditions.visibilityOf(TipSecimi));
        TipSecimi.click();
        Fwait.until(ExpectedConditions.visibilityOf(TipCvorSecimi));
        TipCvorSecimi.click();
        Fwait.until(ExpectedConditions.visibilityOf(CnsOlusturButonu));
        CnsOlusturButonu.click();

        System.out.println("Test Tamamlandı!");
        Thread.sleep(3000);


    }
}
