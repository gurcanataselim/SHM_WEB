package testAutomations.seleniumTest.Moduller;

import org.junit.Test;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import testAutomations.Kullanici;

public class aGölgemeCalısmasıNoktası extends testAutomations.TestBase {

    @FindBy(xpath = "//span[contains(text(),'Modüller')]")
    public WebElement modullerButonu;

    @FindBy(xpath = "//body/div[@id='root']/div[1]/div[2]/div[2]/div[2]/div[1]/div[1]/div[1]/div[2]/div[1]/span[1]")
    public WebElement GölgelemeCalısmasıButonu;

    @FindBy(xpath = "//span[contains(text(),'Gölgeleme Çalışması Noktası')]")
    public WebElement GölgelemeCalısmasıNoktasıButonu;

    @FindBy(xpath = "//body/div[@id='root']/div[1]/div[2]/div[1]/div[1]/canvas[1]")
    public WebElement Harita;

    @FindBy(xpath = "//body/div[@id='root']/div[1]/div[2]/div[5]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/input[1]")
    public WebElement İsimEkleme;

    @FindBy(xpath = "//body/div[@id='root']/div[1]/div[2]/div[5]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/input[1]")
    public WebElement YükseklikEkleme;

    @FindBy(xpath = "//span[contains(text(),'Haritadan Belirle')]")
    public WebElement CapHaritadanBelirleme;

    @FindBy(xpath = "//body/div[@id='root']/div[1]/div[2]/div[5]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[4]/div[1]/div[1]/input[1]")
    public WebElement SlopeEkleme;

    @FindBy(xpath = "//body[1]/div[1]/div[1]/div[2]/div[5]/div[1]/div[1]/div[1]/div[3]/button[1]/span[1]/span[1]")
    public WebElement OlusturButonu;


    @Test
    public void testGölgelemeCalısmasıNoktası() throws Exception {
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

        Fwait.until(ExpectedConditions.visibilityOf(GölgelemeCalısmasıNoktasıButonu));
        GölgelemeCalısmasıNoktasıButonu.click();

        Fwait.until(ExpectedConditions.visibilityOf(Harita));
        Harita.click();

        Fwait.until(ExpectedConditions.visibilityOf(İsimEkleme));
        İsimEkleme.sendKeys("testotomasyon");

        Fwait.until(ExpectedConditions.visibilityOf(YükseklikEkleme));
        YükseklikEkleme.sendKeys(Keys.chord(Keys.CONTROL,"a", Keys.DELETE));
        YükseklikEkleme.sendKeys("12");

        Fwait.until(ExpectedConditions.visibilityOf(CapHaritadanBelirleme));
        CapHaritadanBelirleme.click();
        Actions builder1 = new Actions(driver);
        builder1.moveToElement(Harita).moveByOffset(0, 50).release().perform();
        builder1.click().perform();


        Fwait.until(ExpectedConditions.visibilityOf(SlopeEkleme));
        SlopeEkleme.sendKeys(Keys.chord(Keys.CONTROL,"a", Keys.DELETE));
        SlopeEkleme.sendKeys("12");


        Fwait.until(ExpectedConditions.visibilityOf(OlusturButonu));
        OlusturButonu.click();

        System.out.println("Test Tamamlandı!");
        Thread.sleep(3000);


    }
}
