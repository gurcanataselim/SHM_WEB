package testAutomations.seleniumTest.Mania_Plan;

import org.junit.Test;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import testAutomations.Kullanici;

public class ManiaDuzenle extends testAutomations.TestBase {

    @FindBy(xpath = "//body[1]/div[1]/div[1]/div[2]/div[2]/div[2]/button[1]/span[1]")
    public WebElement havaalanıListeButonu;

    @FindBy(xpath = "//input[@id='search-tree-data']")
    public WebElement HavalanıFiltremele;

    @FindBy(xpath = "//tbody/tr[1]/td[1]/div[1]/button[1]/span[1]/span[1]")
    public WebElement HaritadaGöster;

    @FindBy(xpath = "//body/div[@id='root']/div[1]/div[2]/div[5]/div[1]/label[1]/span[1]/span[1]/*[1]")
    public WebElement HavaalanıPenceresiKapatma;

    @FindBy(xpath = "//body/div[@id='root']/div[1]/div[2]/div[2]/div[2]/div[2]/div[1]/span[1]")
    public WebElement ManiaPlanıButonu;

    @FindBy(xpath = "//span[contains(text(),'Mania Düzenle')]")
    public WebElement ManiaDüzenleButonu;

    @FindBy(xpath = "//body/div[@id='root']/div[1]/div[2]/div[1]/div[1]/canvas[1]")
    public WebElement HaritaButonu;

    @FindBy(xpath = "//span[contains(text(),'Sil')]")
    public WebElement ManiaSilButonu;

    @FindBy(xpath = "//button[contains(text(),'Evet, eminim!!')]")
    public WebElement DüzenlemeEvetButonu;


    @Test
    public void testManiaDuzenle() throws Exception {
        PageFactory.initElements(driver, this);
        JavascriptExecutor js = (JavascriptExecutor) driver;

        Thread.sleep(2000);

        try{
            kullaniciGirisYap(driver, Kullanici.KULLANICI1);
        }catch (Exception e){
            Logger.warn("Kullanıcı login olamadı.");
        }
        Fwait.until(ExpectedConditions.visibilityOf(havaalanıListeButonu));
        havaalanıListeButonu.click();
        Thread.sleep(3000);

        Fwait.until(ExpectedConditions.visibilityOf(HavalanıFiltremele));
        HavalanıFiltremele.sendKeys("TestOtomasyon");
        Thread.sleep(3000);

        Fwait.until(ExpectedConditions.visibilityOf(HaritadaGöster));
        HaritadaGöster.click();
        Thread.sleep(3000);

        Fwait.until(ExpectedConditions.visibilityOf(HavaalanıPenceresiKapatma));
        HavaalanıPenceresiKapatma.click();
        Thread.sleep(3000);

        Fwait.until(ExpectedConditions.visibilityOf(ManiaPlanıButonu));
        ManiaPlanıButonu.click();


        Fwait.until(ExpectedConditions.visibilityOf(ManiaDüzenleButonu));
        ManiaDüzenleButonu.click();

        Fwait.until(ExpectedConditions.visibilityOf(HaritaButonu));
        HaritaButonu.click();

        Fwait.until(ExpectedConditions.visibilityOf(ManiaSilButonu));
        ManiaSilButonu.click();

        Fwait.until(ExpectedConditions.visibilityOf(DüzenlemeEvetButonu));
        DüzenlemeEvetButonu.click();

        
        System.out.println("Test Tamamlandı!");
        Thread.sleep(3000);


    }
}
