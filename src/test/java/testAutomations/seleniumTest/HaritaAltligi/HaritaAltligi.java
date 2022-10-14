package testAutomations.seleniumTest.HaritaAltligi;

import org.junit.Test;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import testAutomations.Kullanici;

public class HaritaAltligi extends testAutomations.TestBase {
    private String baseUrl;
    private boolean acceptNextAlert = true;

    @FindBy(xpath = "//body/div[@id='root']/div[1]/div[2]/div[4]/div[2]/div[1]/div[1]/img[1]")
    public WebElement HaritaAltligi;
    @FindBy(xpath = "//body/div[@id='root']/div[1]/div[2]/div[4]/div[2]/div[1]/div[2]/div[1]/img[1]")
    public WebElement GoogleUydu;
    @FindBy(xpath = "//body/div[@id='root']/div[1]/div[2]/div[4]/div[2]/div[1]/div[2]/div[2]/img[1]")
    public WebElement Altliksiz;
    @FindBy(xpath = "//body/div[@id='root']/div[1]/div[2]/div[4]/div[2]/div[1]/div[2]/div[3]/img[1]")
    public WebElement GoogleYol;
    @FindBy(xpath = "//body/div[@id='root']/div[1]/div[2]/div[4]/div[2]/div[1]/div[2]/div[4]/img[1]")
    public WebElement GoogleFiziksel;

    @Test
    public void testHaritaAltligi() throws Exception {
        PageFactory.initElements(driver , this);
        JavascriptExecutor js = (JavascriptExecutor) driver;

        try{
            kullaniciGirisYap(driver, Kullanici.KULLANICI1);
        }catch (Exception e){
            Logger.warn("Kullanıcı login olamadı.");
        }
        Thread.sleep(3000);


        Fwait.until(ExpectedConditions.visibilityOf(HaritaAltligi));
        HaritaAltligi.click();


        Thread.sleep(3000);

        Fwait.until(ExpectedConditions.visibilityOf(GoogleUydu));
        GoogleUydu.click();

        Thread.sleep(5000);


        Fwait.until(ExpectedConditions.visibilityOf(HaritaAltligi));
        HaritaAltligi.click();

        Thread.sleep(3000);

        Fwait.until(ExpectedConditions.visibilityOf(Altliksiz));
        Altliksiz.click();

        Thread.sleep(5000);

        Fwait.until(ExpectedConditions.visibilityOf(HaritaAltligi));
        HaritaAltligi.click();

        Thread.sleep(3000);

        Fwait.until(ExpectedConditions.visibilityOf(GoogleYol));
        GoogleYol.click();

        Thread.sleep(5000);

        Fwait.until(ExpectedConditions.visibilityOf(HaritaAltligi));
        HaritaAltligi.click();

        Thread.sleep(3000);

        Fwait.until(ExpectedConditions.visibilityOf(GoogleFiziksel));
        GoogleFiziksel.click();



        Fwait.until(ExpectedConditions.visibilityOf(HaritaAltligi));
        HaritaAltligi.click();


        Thread.sleep(3000);

        Fwait.until(ExpectedConditions.visibilityOf(GoogleUydu));
        GoogleUydu.click();


        System.out.println("Test Tamamlandı!");
        Thread.sleep(3000);



    }
}
