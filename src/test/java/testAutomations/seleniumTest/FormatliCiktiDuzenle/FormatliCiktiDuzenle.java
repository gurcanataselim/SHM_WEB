package testAutomations.seleniumTest.FormatliCiktiDuzenle;

import org.junit.Test;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import testAutomations.Kullanici;

public class FormatliCiktiDuzenle extends testAutomations.TestBase{


    private String baseUrl;
    private boolean acceptNextAlert = true;

    @FindBy(xpath = "//body/div[@id='root']/div[1]/div[2]/div[4]/div[3]/button[4]/i[1]")
    public WebElement FormatliCiktiDuzenleBtn;

    @FindBy(xpath = "//body[1]/div[3]/form[1]/div[2]/div[1]/ul[1]/li[1]/label[2]/span[1]")
    public WebElement Portrait;


    @FindBy(xpath = "//body[1]/div[3]/form[1]/div[2]/div[1]/ul[1]/li[1]/label[2]/span[1]")
    public WebElement Saveas;

    @FindBy(xpath = "//body/div[3]/form[1]/div[2]/div[1]/div[2]/button[1]")
    public WebElement Cansel;



    @Test
    public void testFormatliCiktiDuzenle() throws Exception {
        PageFactory.initElements(driver, this);
        JavascriptExecutor js = (JavascriptExecutor) driver;

        try {
            kullaniciGirisYap(driver, Kullanici.KULLANICI1);
        } catch (Exception e) {
            Logger.warn("Kullanıcı login olamadı.");
        }
        Thread.sleep(3000);


        Fwait.until(ExpectedConditions.visibilityOf(FormatliCiktiDuzenleBtn));
        FormatliCiktiDuzenleBtn.click();


        Thread.sleep(3000);


        Fwait.until(ExpectedConditions.visibilityOf(Portrait));
        Portrait.click();

        Thread.sleep(3000);

        Fwait.until(ExpectedConditions.visibilityOf(Saveas));
        Saveas.click();

        Thread.sleep(3000);

        Fwait.until(ExpectedConditions.visibilityOf(Cansel));
        Cansel.click();

        System.out.println("Test Tamamlandı!");
        Thread.sleep(3000);
    }



}
