package testAutomations.seleniumTest.Projeksiyonlar;

import org.junit.Test;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import testAutomations.Kullanici;

public class Projeksiyonlar extends testAutomations.TestBase {



    private String baseUrl;
    private boolean acceptNextAlert = true;

    @FindBy(xpath = "//div[contains(text(),'EPSG:4326')]")
    public WebElement ProjeksiyonlarBtn;

    @FindBy(xpath = "//span[contains(text(),'3Der ITRF DOM39')]")
    public WebElement Projeksiyon;


    @FindBy(id = "map")
    public WebElement haritayatikla;


    @Test
    public void testProjeksiyonlar() throws Exception {
        PageFactory.initElements(driver, this);
        JavascriptExecutor js = (JavascriptExecutor) driver;

        try {
            kullaniciGirisYap(driver, Kullanici.KULLANICI1);
        } catch (Exception e) {
            Logger.warn("Kullanıcı login olamadı.");
        }
        Thread.sleep(3000);


        Fwait.until(ExpectedConditions.visibilityOf(ProjeksiyonlarBtn));
        ProjeksiyonlarBtn.click();


        Thread.sleep(3000);


        Fwait.until(ExpectedConditions.visibilityOf(Projeksiyon));
        Projeksiyon.click();


        Thread.sleep(3000);


        Fwait.until(ExpectedConditions.visibilityOf(haritayatikla));
        haritayatikla.click();



        System.out.println("Test Tamamlandı!");
        Thread.sleep(3000);
    }


}
