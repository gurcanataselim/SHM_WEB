package testAutomations.seleniumTest.havaalaniListesi;

import org.junit.Test;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import testAutomations.Kullanici;

public class diller extends testAutomations.TestBase {
    private String baseUrl;
    private boolean acceptNextAlert = true;


    @FindBy(xpath = "//body/div[@id='root']/div[1]/div[2]/div[2]/div[2]/div[4]/div[1]")
    public WebElement diller;
    @FindBy(xpath = "//body/div[@id='root']/div[1]/div[2]/div[2]/div[2]/div[4]/div[1]/div[2]/div[1]")
    public WebElement turkce;
    @FindBy(xpath = "//body/div[@id='root']/div[1]/div[2]/div[2]/div[2]/div[4]/div[1]/div[2]/div[2]")
    public WebElement english;
    @FindBy(xpath = "//body/div[@id='root']/div[1]/div[2]/div[2]/div[2]/div[4]/div[1]/div[2]/div[3]")
    public WebElement francais;

    @Test
    public void testdiller() throws Exception {
        PageFactory.initElements(driver, this);
        JavascriptExecutor js = (JavascriptExecutor) driver;

        try {
            kullaniciGirisYap(driver, Kullanici.KULLANICI1);
        } catch (Exception e) {
            Logger.warn("Kullanıcı login olamadı.");
        }
        Thread.sleep(2000);


        Fwait.until(ExpectedConditions.visibilityOf(diller));
        diller.click();
        Fwait.until(ExpectedConditions.visibilityOf(english));
        english.click();
        Thread.sleep(2000);


        Fwait.until(ExpectedConditions.visibilityOf(diller));
        diller.click();
        Fwait.until(ExpectedConditions.visibilityOf(turkce));
        turkce.click();
        Thread.sleep(2000);


        Fwait.until(ExpectedConditions.visibilityOf(diller));
        diller.click();
        Fwait.until(ExpectedConditions.visibilityOf(francais));
        francais.click();
        Thread.sleep(3000);

        Fwait.until(ExpectedConditions.visibilityOf(diller));
        diller.click();
        Fwait.until(ExpectedConditions.visibilityOf(turkce));
        turkce.click();
        Thread.sleep(2000);



        System.out.println("Test Tamamlandı!");
        Thread.sleep(2000);
    }
}