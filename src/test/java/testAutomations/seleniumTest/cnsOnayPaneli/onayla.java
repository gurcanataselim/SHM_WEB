package testAutomations.seleniumTest.cnsOnayPaneli;

import org.junit.Test;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import testAutomations.Kullanici;


public class onayla extends testAutomations.TestBase {
    private String baseUrl;
    private boolean acceptNextAlert = true;

    @FindBy(xpath = "//span[contains(text(),'Hesap')]")
    public WebElement hesapBtn;


    @FindBy(xpath = "//span[contains(text(),'CNS Onay Paneli')]")
    public WebElement cnsOnayPaneliBtn;


    @FindBy(xpath = "//tbody/tr[2]/td[1]/div[1]/button[2]/span[1]")
    public WebElement onaylaBtn;

    @FindBy(css ="div.swal-overlay.swal-overlay--show-modal:nth-child(9) div.swal-modal div.swal-footer div.swal-button-container:nth-child(2) > button.swal-button.swal-button--catch.confirm-aviation-update-approve")
    public WebElement evetEminimBtn;



    @FindBy(xpath = "//tbody/tr[2]/td[1]/div[1]/button[3]/span[1]/span[1]")
    public WebElement revizeBtn;

//    @FindBy(css= "div.swal-overlay.swal-overlay--show-modal:nth-child(7) div.swal-modal div.swal-footer div.swal-button-container:nth-child(2) > button.swal-button.swal-button--catch.confirm-aviation-cancel-approve")
//    public WebElement evetEminimBtn2;




    @Test
    public void testonayla() throws Exception {
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

        Fwait.until(ExpectedConditions.visibilityOf(cnsOnayPaneliBtn));
        cnsOnayPaneliBtn.click();


        try{
            Fwait.until(ExpectedConditions.visibilityOf(onaylaBtn));
            onaylaBtn.click();
        }catch(Exception e){
            Logger.warn(" Admin 2022-08-24T15:49:11.59218 CVOR _300 adlı çalışmanın Onaylama işlemi gerçekleşmedi.");
        }

        Thread.sleep(3000);

        try{
//            Fwait.until(ExpectedConditions.visibilityOf(evetEminimBtn));
//            evetEminimBtn.click();
            js.executeScript("document.querySelector('body > div.swal-overlay.swal-overlay--show-modal > div > div.swal-footer > div:nth-child(2) > button').click()");
        }catch(Exception e){
            Logger.warn(" Admin Panelinde yer alan 2022-08-24T15:49:11.59218 CVOR_300 Evet eminim butonuna tıklanmadı");
        }

        Thread.sleep(3000);


        driver.get("https://live.basarsoft.com.tr/mania/web/#/login");

        Thread.sleep(3000);


//        //Şube müdürü olarak giriş yapıldı.

        try{
            kullaniciGirisYap(driver, Kullanici.KULLANICI3);
        }catch (Exception e){
            Logger.warn("Kullanıcı login olamadı.");
        }

        Thread.sleep(5000);

        try{
            Fwait.until(ExpectedConditions.visibilityOf(revizeBtn));
            revizeBtn.click();
        }catch(Exception e){
            Logger.warn("Sube müdürü revize butonu tıklanmadı.");
        }

        Thread.sleep(3000);

        try{
//            Fwait.until(ExpectedConditions.visibilityOf(evetEminimBtn2));
//            evetEminimBtn2.click();

            js.executeScript("document.querySelector('body > div.swal-overlay.swal-overlay--show-modal > div > div.swal-footer > div:nth-child(2) > button').click()");
        }catch(Exception e){
            Logger.warn("Şube Müdürü onay işlemi iptali gerçekleşmedi");
        }

        Thread.sleep(5000);















//        String bodyText = driver.findElement(By.cssSelector("body")).getText();
//        Assert.assertTrue("Text not found!", bodyText.contains("Şube Müdürü'ne gönderildi."));
//        System.out.println("Ekleme kontrolü yapıldı.");


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