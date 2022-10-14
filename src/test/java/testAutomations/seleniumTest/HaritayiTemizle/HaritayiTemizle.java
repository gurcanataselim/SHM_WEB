package testAutomations.seleniumTest.HaritayiTemizle;

import org.junit.Test;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import testAutomations.Kullanici;

public class HaritayiTemizle extends testAutomations.TestBase{


    private String baseUrl;
    private boolean acceptNextAlert = true;

    @FindBy(xpath = "//body/div[@id='root']/div[1]/div[2]/div[4]/div[3]/button[1]/i[1]")
    public WebElement UzunlukOlcumuBtn;

    @FindBy(id = "map")
    public WebElement haritayatikla;

    @FindBy(xpath = "//body/div[@id='root']/div[1]/div[2]/div[4]/div[3]/button[2]/i[1]")
    public WebElement AlanOlcumBtn;

    @FindBy(xpath = "//body/div[@id='root']/div[1]/div[2]/div[4]/div[3]/button[3]/img[1]")
    public WebElement CografiKuzeyAcisiBtn;
    @FindBy(xpath = "//body/div[@id='root']/div[1]/div[2]/div[4]/div[3]/button[5]/i[1]")
    public WebElement HaritayiTemizleBtn;

    @Test
    public void testHaritayiTemizle() throws Exception {
        PageFactory.initElements(driver, this);
        JavascriptExecutor js = (JavascriptExecutor) driver;

        try {
            kullaniciGirisYap(driver, Kullanici.KULLANICI1);
        } catch (Exception e) {
            Logger.warn("Kullanıcı login olamadı.");
        }
        Thread.sleep(3000);


        Fwait.until(ExpectedConditions.visibilityOf(UzunlukOlcumuBtn));
        UzunlukOlcumuBtn.click();


        Thread.sleep(3000);


        Fwait.until(ExpectedConditions.visibilityOf(haritayatikla));
        haritayatikla.click();



        Actions builder1 = new Actions(driver);
        builder1.moveToElement(haritayatikla).click().moveByOffset(0, 50).release().perform();
        builder1.click().perform();


        Actions builder2 = new Actions(driver);
        builder2.moveToElement(haritayatikla).click().moveByOffset(50, 0).release().perform();
        builder2.doubleClick().perform();

        Actions builder3 = new Actions(driver);
        builder3.moveToElement(haritayatikla).click().moveByOffset(0, -10).release().perform();
        builder3.doubleClick().perform();

        Thread.sleep(3000);

        Fwait.until(ExpectedConditions.visibilityOf(AlanOlcumBtn));
        AlanOlcumBtn.click();

        Thread.sleep(3000);

        Fwait.until(ExpectedConditions.visibilityOf(haritayatikla));
        haritayatikla.click();


        Actions builder4 = new Actions(driver);
        builder1.moveToElement(haritayatikla).click().moveByOffset(0, 50).release().perform();
        builder1.click().perform();


        Actions builder5 = new Actions(driver);
        builder2.moveToElement(haritayatikla).click().moveByOffset(100, 0).release().perform();
        builder2.doubleClick().perform();

        Actions builder6 = new Actions(driver);
        builder3.moveToElement(haritayatikla).click().moveByOffset(0, -10).release().perform();
        builder3.doubleClick().perform();


        Thread.sleep(3000);

        Fwait.until(ExpectedConditions.visibilityOf(CografiKuzeyAcisiBtn));
        CografiKuzeyAcisiBtn.click();

        Thread.sleep(3000);

        Fwait.until(ExpectedConditions.visibilityOf(haritayatikla));
        haritayatikla.click();


        Actions builder7 = new Actions(driver);
        builder1.moveToElement(haritayatikla).click().moveByOffset(0, 50).release().perform();
        builder1.click().perform();


        Actions builder8 = new Actions(driver);
        builder2.moveToElement(haritayatikla).click().moveByOffset(100, 0).release().perform();
        builder2.doubleClick().perform();

        Actions builder9 = new Actions(driver);
        builder3.moveToElement(haritayatikla).click().moveByOffset(0, -10).release().perform();
        builder3.doubleClick().perform();

        Thread.sleep(3000);


        Fwait.until(ExpectedConditions.visibilityOf(HaritayiTemizleBtn));
        HaritayiTemizleBtn.click();



        System.out.println("Test Tamamlandı!");
        Thread.sleep(3000);
    }



}
