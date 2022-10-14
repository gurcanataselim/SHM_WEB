package testAutomations.seleniumTest.havacilikCalismasiOnayPaneli;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
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


    @FindBy(xpath = "//span[contains(text(),'Havacılık Çalışması Onay Paneli')]")
    public WebElement havacilikCalismasiOnayPaneliBtn;


    @FindBy(xpath = "//tbody/tr[8]/td[1]/div[1]/button[2]")
    public WebElement onaylaBtn;

//    @FindBy(css ="div.swal-overlay.swal-overlay--show-modal:nth-child(9) div.swal-modal div.swal-footer div.swal-button-container:nth-child(2) > button.swal-button.swal-button--catch.confirm-aviation-update-approve")
//    public WebElement evetEminimBtn;



    @FindBy(xpath = "//tbody/tr[8]/td[1]/div[1]/button[3]")
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

        Fwait.until(ExpectedConditions.visibilityOf(havacilikCalismasiOnayPaneliBtn));
        havacilikCalismasiOnayPaneliBtn.click();


        try{
            Fwait.until(ExpectedConditions.visibilityOf(onaylaBtn));
            onaylaBtn.click();

           // js.executeScript("document.querySelector('#root > div > div:nth-child(3) > div.share-panel.react-draggable.react-draggable-dragged > div > div > div > div > div > div > div > table > tbody > tr:nth-child(8) > td.MuiTableCell-root.MuiTableCell-body.MuiTableCell-paddingNone > div > button:nth-child(2) > span.MuiIconButton-label > span').click(");
        }catch(Exception e){
            Logger.warn(" Admin test1 adlı çalışmanın Onaylama işlemi gerçekleşmedi.");
        }

Thread.sleep(3000);
        try{
//            Fwait.until(ExpectedConditions.visibilityOf(evetEminimBtn));
//            evetEminimBtn.click();
            js.executeScript("document.querySelector('body > div.swal-overlay.swal-overlay--show-modal > div > div.swal-footer > div:nth-child(2) > button').click()");
        }catch(Exception e){
            Logger.warn(" Admin Panelinde yer alan test1 Evet eminim butonuna tıklanmadı");
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

            js.executeScript(" document.querySelector('body > div.swal-overlay.swal-overlay--show-modal > div > div.swal-footer > div:nth-child(2) > button').click()");
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