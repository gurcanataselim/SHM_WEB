package testAutomations.seleniumTest.mevcutManiaOnayPaneli;

import org.junit.Test;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import testAutomations.Kullanici;


public class adminOnaylaiptal extends testAutomations.TestBase {
    private String baseUrl;
    private boolean acceptNextAlert = true;

    @FindBy(xpath = "//span[contains(text(),'Hesap')]")
    public WebElement hesapBtn;


    @FindBy(xpath = "//span[contains(text(),'Mevcut Mania Onay Paneli')]")
    public WebElement mevcutManiaOnayBtn;





    @FindBy(xpath = "//tbody/tr[8]/td[1]/div[1]/button[2]/span[1]")
    public WebElement onaylaBtn;

//
//    @FindBy(xpath = "//button[contains(text(),'Hayır, iptal et!')]")
//    public WebElement hayirIptalEtBtn;







    @Test
    public void testadminOnaylaiptal() throws Exception {
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

        Fwait.until(ExpectedConditions.visibilityOf(mevcutManiaOnayBtn));
        mevcutManiaOnayBtn.click();


        try{
            Fwait.until(ExpectedConditions.visibilityOf(onaylaBtn));
            onaylaBtn.click();
        }catch(Exception e){
            Logger.warn(" Admin 6_29_2022_1656510178776 adlı veri  Onaylama işlemi gerçekleşmedi.");
        }


        Thread.sleep(3000);



        try{
//            Fwait.until(ExpectedConditions.visibilityOf(hayirIptalEtBtn));
//            hayirIptalEtBtn.click();
//
            js.executeScript("document.querySelector('body > div.swal-overlay.swal-overlay--show-modal > div > div.swal-footer > div:nth-child(1) > button').click()");
        }catch(Exception e){
            Logger.warn("Hayır , Iptal et butonuna tıklanmadı.");
        }











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