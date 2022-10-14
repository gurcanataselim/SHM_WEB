package testAutomations.seleniumTest.golgelemeCalismasiOnayPaneli;

import org.junit.Test;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import testAutomations.Kullanici;


public class onaylaiptal extends testAutomations.TestBase {
    private String baseUrl;
    private boolean acceptNextAlert = true;

    @FindBy(xpath = "//span[contains(text(),'Hesap')]")
    public WebElement hesapBtn;


    @FindBy(xpath = "//span[contains(text(),'Gölgeleme Çalışması Onay Paneli')]")
    public WebElement golgelemeCalismasiOnayPaneliBtn;


    @FindBy(xpath = "//tbody/tr[12]/td[1]/div[1]/button[2]/span[1]/span[1]")
    public WebElement onaylaBtn;

    @FindBy(css ="div.swal-overlay.swal-overlay--show-modal:nth-child(9) div.swal-modal div.swal-footer div.swal-button-container:nth-child(2) > button.swal-button.swal-button--catch.confirm-aviation-update-approve")
    public WebElement evetEminimBtn;



    @FindBy(xpath = "//tbody/tr[21]/td[1]/div[1]/button[3]/span[1]/span[1]")
    public WebElement revizeBtn;

//    @FindBy(css= "div.swal-overlay.swal-overlay--show-modal:nth-child(7) div.swal-modal div.swal-footer div.swal-button-container:nth-child(2) > button.swal-button.swal-button--catch.confirm-aviation-cancel-approve")
//    public WebElement evetEminimBtn2;




    @Test
    public void testonaylaiptal() throws Exception {
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

        Fwait.until(ExpectedConditions.visibilityOf(golgelemeCalismasiOnayPaneliBtn));
        golgelemeCalismasiOnayPaneliBtn.click();


        try{
            Fwait.until(ExpectedConditions.visibilityOf(onaylaBtn));
            onaylaBtn.click();

        }catch(Exception e){
            Logger.warn(" test16 adlı çalışmanın Onaylama işlemi gerçekleşmedi.");
        }

        Thread.sleep(3000);




        try{
            js.executeScript("document.querySelector('body > div.swal-overlay.swal-overlay--show-modal > div > div.swal-footer > div:nth-child(1) > button').click()");

        }catch(Exception e){
            Logger.warn(" test16 adlı çalışmanın Onaylama işlemi gerçekleşmedi.");
        }





        System.out.println("Test Tamamlandı!");
        Thread.sleep(3000);
    }
}