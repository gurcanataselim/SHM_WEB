package testAutomations.seleniumTest.AktifKoordinatlar;

import org.junit.Test;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import testAutomations.Kullanici;

public class AktifKoordinatlar extends testAutomations.TestBase {


    private String baseUrl;
    private boolean acceptNextAlert = true;

    @FindBy(xpath = "//span[contains(text(),'Aktif Koordinatlar')]")
    public WebElement AktifKoordinatlarBtn;

    @FindBy(xpath = "//body/div[3]/div[1]/div[1]/input[1]")
    public WebElement AktifKoordinatGir;
    @FindBy(xpath = "//body/div[3]/div[1]/div[1]/button[1]")
    public WebElement KoordinataGit;




    @Test
    public void testAktifKoordinatlar() throws Exception {
        PageFactory.initElements(driver, this);
        JavascriptExecutor js = (JavascriptExecutor) driver;

        try {
            kullaniciGirisYap(driver, Kullanici.KULLANICI1);
        } catch (Exception e) {
            Logger.warn("Kullanıcı login olamadı.");
        }
        Thread.sleep(3000);


        Fwait.until(ExpectedConditions.visibilityOf(AktifKoordinatlarBtn));
        AktifKoordinatlarBtn.click();

        Thread.sleep(3000);

        Fwait.until(ExpectedConditions.visibilityOf(AktifKoordinatGir));
        AktifKoordinatGir.click();
        AktifKoordinatGir.sendKeys("B: 43.364112 E: 35.697931");
        Thread.sleep(3000);


        Fwait.until(ExpectedConditions.visibilityOf(KoordinataGit));
        KoordinataGit.click();


        System.out.println("Test Tamamlandı!");
        Thread.sleep(3000);
    }




}
