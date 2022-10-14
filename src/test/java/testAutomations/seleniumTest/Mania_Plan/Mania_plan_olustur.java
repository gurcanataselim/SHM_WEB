package testAutomations.seleniumTest.Mania_Plan;

import org.junit.Test;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import testAutomations.Kullanici;

public class Mania_plan_olustur extends testAutomations.TestBase {

    @FindBy(xpath = "//body/div[@id='root']/div[1]/div[2]/div[2]/div[2]/div[2]/div[1]/span[1]")
    public WebElement maniaplanButonu;

    @FindBy(xpath = "//span[contains(text(),'Mania Planı Oluştur')]")
    public WebElement maniaPlanOlusturButonu;

    @FindBy(xpath = "//body/div[@id='root']/div[1]/div[2]/div[5]/div[1]/form[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/input[1]")
    public WebElement baslangıcNoktası;

    @FindBy(xpath = "//body/div[@id='root']/div[1]/div[2]/div[5]/div[1]/form[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/input[1]")
    public WebElement bitisNoktası;

    @FindBy(xpath = "//body/div[@id='root']/div[1]/div[2]/div[5]/div[1]/form[1]/div[3]/div[1]/div[1]/div[1]/input[1]")
    public WebElement refesansYuksekligi;

    @FindBy(xpath = "//body/div[@id='root']/div[1]/div[2]/div[5]/div[1]/form[1]/div[3]/div[3]/div[1]/div[1]/input[1]")
    public WebElement clearway;

    @FindBy(xpath = "//body/div[@id='root']/div[1]/div[2]/div[5]/div[1]/form[1]/div[4]/div[1]/div[1]/div[1]/input[1]")
    public WebElement adı;

    @FindBy(xpath = "//body/div[@id='root']/div[1]/div[2]/div[5]/div[1]/form[1]/div[1]/div[1]/div[1]/div[1]/div[3]/div[1]/div[1]/input[1]")
    public WebElement xKoordinat1;

    @FindBy(xpath = "//body/div[@id='root']/div[1]/div[2]/div[5]/div[1]/form[1]/div[1]/div[1]/div[1]/div[1]/div[4]/div[1]/div[1]/input[1]")
    public WebElement yKoordinat1;

    @FindBy(xpath = "//body/div[@id='root']/div[1]/div[2]/div[5]/div[1]/form[1]/div[1]/div[1]/div[1]/div[1]/div[5]/div[1]/div[1]/input[1]")
    public WebElement zKoordinat1;

    @FindBy(xpath = "//body/div[@id='root']/div[1]/div[2]/div[5]/div[1]/form[1]/div[1]/div[1]/div[1]/div[2]/div[3]/div[1]/div[1]/input[1]")
    public WebElement xKoordinat2;

    @FindBy(xpath = "//body/div[@id='root']/div[1]/div[2]/div[5]/div[1]/form[1]/div[1]/div[1]/div[1]/div[2]/div[4]/div[1]/div[1]/input[1]")
    public WebElement yKoordinat2;

    @FindBy(xpath = "//body/div[@id='root']/div[1]/div[2]/div[5]/div[1]/form[1]/div[1]/div[1]/div[1]/div[2]/div[5]/div[1]/div[1]/input[1]")
    public WebElement zKoordinat2;

    @FindBy(xpath = "//span[contains(text(),'Pist Türü')]")
    public WebElement pistTürüSecimi;

    @FindBy(xpath = "//span[contains(text(),'AletsizKodNo1')]")
    public WebElement pistTürüSecimiAletsizSecimi;

    @FindBy(xpath = "//span[contains(text(),'Clearway Tip')]")
    public WebElement getClearwaytipSecimi;

    @FindBy(xpath = "//span[contains(text(),'Pist Başı')]")
    public WebElement getClearwaytipSecimiPistBasıSecimi;

    @FindBy(xpath = "//body[1]/div[1]/div[1]/div[2]/div[5]/div[1]/form[1]/div[4]/div[2]/button[1]/span[1]/span[1]")
    public WebElement OlusturButonu;

    @Test
    public void testMania_plan_olustur() throws Exception {
        PageFactory.initElements(driver, this);
        JavascriptExecutor js = (JavascriptExecutor) driver;

        Thread.sleep(2000);

        try{
            kullaniciGirisYap(driver, Kullanici.KULLANICI1);
        }catch (Exception e){
            Logger.warn("Kullanıcı login olamadı.");
        }
        Fwait.until(ExpectedConditions.visibilityOf(maniaplanButonu));
        maniaplanButonu.click();

        Fwait.until(ExpectedConditions.visibilityOf(maniaPlanOlusturButonu));
        maniaPlanOlusturButonu.click();

        Fwait.until(ExpectedConditions.visibilityOf(baslangıcNoktası));
        baslangıcNoktası.sendKeys("test1");

        Fwait.until(ExpectedConditions.visibilityOf(bitisNoktası));
        bitisNoktası.sendKeys("test2");

        Fwait.until(ExpectedConditions.visibilityOf(refesansYuksekligi));
        yKoordinat1.sendKeys(Keys.chord(Keys.CONTROL,"a", Keys.DELETE));
        refesansYuksekligi.sendKeys("123");

        Fwait.until(ExpectedConditions.visibilityOf(clearway));
        yKoordinat1.sendKeys(Keys.chord(Keys.CONTROL,"a", Keys.DELETE));
        clearway.sendKeys("10");

        Fwait.until(ExpectedConditions.visibilityOf(adı));
        adı.sendKeys("TestOtomasyon");

        Fwait.until(ExpectedConditions.visibilityOf(xKoordinat1));
        xKoordinat1.sendKeys(Keys.chord(Keys.CONTROL,"a", Keys.DELETE));
        xKoordinat1.sendKeys("33.46");


        Fwait.until(ExpectedConditions.visibilityOf(yKoordinat1));
        yKoordinat1.sendKeys(Keys.chord(Keys.CONTROL,"a", Keys.DELETE));
        yKoordinat1.sendKeys("37.78");

        Fwait.until(ExpectedConditions.visibilityOf(zKoordinat1));
        zKoordinat1.sendKeys(Keys.chord(Keys.CONTROL,"a", Keys.DELETE));
        zKoordinat1.sendKeys("125");

        Fwait.until(ExpectedConditions.visibilityOf(xKoordinat2));
        xKoordinat2.sendKeys(Keys.chord(Keys.CONTROL,"a", Keys.DELETE));
        xKoordinat2.sendKeys("33.47");

        Fwait.until(ExpectedConditions.visibilityOf(yKoordinat2));
        yKoordinat2.sendKeys(Keys.chord(Keys.CONTROL,"a", Keys.DELETE));
        yKoordinat2.sendKeys("37.79");

        Fwait.until(ExpectedConditions.visibilityOf(zKoordinat2));
        zKoordinat2.sendKeys(Keys.chord(Keys.CONTROL,"a", Keys.DELETE));
        zKoordinat2.sendKeys("120");

        Fwait.until(ExpectedConditions.visibilityOf(pistTürüSecimi));
        pistTürüSecimi.click();

        Fwait.until(ExpectedConditions.visibilityOf(pistTürüSecimiAletsizSecimi));
        pistTürüSecimiAletsizSecimi.click();

        Fwait.until(ExpectedConditions.visibilityOf(getClearwaytipSecimi));
        getClearwaytipSecimi.click();

        Fwait.until(ExpectedConditions.visibilityOf(getClearwaytipSecimiPistBasıSecimi));
        getClearwaytipSecimiPistBasıSecimi.click();


        Fwait.until(ExpectedConditions.visibilityOf(OlusturButonu));
        OlusturButonu.click();


        System.out.println("Test Tamamlandı!");
        Thread.sleep(3000);


    }
}
