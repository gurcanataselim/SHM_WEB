package testAutomations.seleniumTest.KatmanKontrolu;

import org.junit.Test;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import testAutomations.Kullanici;

public class KatmanKontrolu extends testAutomations.TestBase{

    private String baseUrl;
    private boolean acceptNextAlert = true;

    @FindBy(xpath = "//body/div[@id='root']/div[1]/div[2]/div[4]/div[1]/div[1]/label[1]/span[1]/span[1]/*[1]")
    public WebElement KatmanKontrolu;
    @FindBy(xpath = "//body/div[@id='root']/div[1]/div[2]/div[4]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[3]/div[1]/div[1]/div[1]/div[5]/span[3]")
    public WebElement pistNoktalari;
    @FindBy(xpath = "//body/div[@id='root']/div[1]/div[2]/div[4]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[3]/div[1]/div[1]/div[1]/div[5]/span[3]")
    public WebElement GolgelemeCalismasi;
    @FindBy(xpath = "//body/div[@id='root']/div[1]/div[2]/div[4]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[3]/div[1]/div[1]/div[1]/div[1]/span[3]")
    public WebElement DigerKatman;
    @FindBy(xpath = "//body[1]/div[1]/div[1]/div[2]/div[4]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[3]/div[1]/div[1]/div[1]/div[2]/span[4]/span[2]/span[1]")
    public WebElement PisNokta;
    @FindBy(xpath = "//body/div[@id='root']/div[1]/div[2]/div[4]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div[2]/div[1]/div[2]/span[1]/span[3]")
    public WebElement Saydamlik;

    @Test
    public void testKatmanKontrolu() throws Exception {
        PageFactory.initElements(driver, this);
        JavascriptExecutor js = (JavascriptExecutor) driver;

        try {
            kullaniciGirisYap(driver, Kullanici.KULLANICI1);
        } catch (Exception e) {
            Logger.warn("Kullanıcı login olamadı.");
        }
        Thread.sleep(3000);


        Fwait.until(ExpectedConditions.visibilityOf(KatmanKontrolu));
        KatmanKontrolu.click();


        Thread.sleep(8000);

        Fwait.until(ExpectedConditions.visibilityOf(pistNoktalari));
        pistNoktalari.click();

        Thread.sleep(3000);

        Fwait.until(ExpectedConditions.visibilityOf(GolgelemeCalismasi));
        GolgelemeCalismasi.click();


        Thread.sleep(3000);

        Fwait.until(ExpectedConditions.visibilityOf(DigerKatman));
        DigerKatman.click();

        Thread.sleep(3000);

        Fwait.until(ExpectedConditions.visibilityOf(PisNokta));
        PisNokta.click();
        Thread.sleep(3000);

        Fwait.until(ExpectedConditions.visibilityOf(Saydamlik));
        Saydamlik.click();

        System.out.println("Test Tamamlandı!");
        Thread.sleep(3000);
    }
}
