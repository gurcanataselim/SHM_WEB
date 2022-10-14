package testAutomations.seleniumTest.adminManiaOnayPaneli;

import org.junit.Test;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import testAutomations.Kullanici;


public class detayGoster extends testAutomations.TestBase {
    private String baseUrl;
    private boolean acceptNextAlert = true;

    @FindBy(xpath = "//span[contains(text(),'Hesap')]")
    public WebElement hesapBtn;


    @FindBy(xpath = "//span[contains(text(),'Mania Planı Onay Paneli')]")
    public WebElement maniaPlanıOnayPaneliBtn;

    @FindBy(xpath = "//tbody/tr[4]/td[1]/div[1]/button[2]/span[1]/span[1]")
    public WebElement detayGosterBtn;
//
//    @FindBy(xpath = "//body[1]/div[4]/div[1]/div[1]/div[3]/button[5]/svg[1]/path[1]")
//    public WebElement detayGosterKapatBtn;





    @Test
    public void testdetayGoster() throws Exception {
        PageFactory.initElements(driver, this);
        JavascriptExecutor js = (JavascriptExecutor) driver;

        try{
            kullaniciGirisYap(driver, Kullanici.KULLANICI1);
        }catch (Exception e){
            Logger.warn("Kullanıcı login olamadı.");
        }


        Thread.sleep(3000);

        Fwait.until(ExpectedConditions.visibilityOf(hesapBtn));
        hesapBtn.click();

        Fwait.until(ExpectedConditions.visibilityOf(maniaPlanıOnayPaneliBtn));
        maniaPlanıOnayPaneliBtn.click();


        try {
            Fwait.until(ExpectedConditions.visibilityOf(detayGosterBtn));
            detayGosterBtn.click();
        }catch (Exception e){
            Logger.warn("Detay butonuna tıklanamadı.");
        }

//
//        try {
//            Fwait.until(ExpectedConditions.visibilityOf(detayGosterKapatBtn));
//            detayGosterKapatBtn.click();
//        }catch (Exception e){
//            Logger.warn("Detay göster penceresi kapatılamadı.");
//        }














//        String bodyText = driver.findElement(By.xpath("//body/div[@id='root']/div[1]/div[2]/div[5]")).getText();
//        Assert.assertTrue("Text not found!", bodyText.contains("Nesne"));

//        act.keyDown(Keys.CONTROL).sendKeys("v").keyUp(Keys.CONTROL).perform();
//        act.keyDown(Keys.ENTER).keyUp(Keys.ENTER).perform();

//
//        System.out.println("File is Uploaded Successfully");


        System.out.println("Test Tamamlandı!");
        Thread.sleep(3000);
    }
}