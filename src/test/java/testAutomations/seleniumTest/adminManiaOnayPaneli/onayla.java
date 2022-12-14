package testAutomations.seleniumTest.adminManiaOnayPaneli;

import groovy.util.logging.Log;
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

    @FindBy(css = "#root > div > div:nth-child(3) > div.main-menu > div.rightSide > div:nth-child(6) > div > span")
    public WebElement hesap2Btn;



    @FindBy(xpath = "//span[contains(text(),'Mania Plan─▒ Onay Paneli')]")
    public WebElement maniaPlan─▒OnayPaneliBtn;

    @FindBy(xpath= "//tbody/tr[3]/td[1]/div[1]/button[3]/span[1]")
    public WebElement onaylaBtn;



    @FindBy(css = "body:nth-child(2) div.swal-overlay.swal-overlay--show-modal:nth-child(6) div.swal-modal.confirm-ols-update div.swal-footer > div.swal-button-container:nth-child(2)")
    public WebElement evetEminimBtn;

    @FindBy(xpath = "//tbody/tr[3]/td[1]/div[1]/button[4]/span[1]")
    public WebElement revizeBtn;

    @FindBy(xpath = "#root > div > div:nth-child(3) > div.main-menu > div.rightSide > div:nth-child(6) > div > div > div:nth-child(3) > span")
    public WebElement maniaPlan─▒OnayPaneliBtnSubeMuduru;


    @FindBy(css= "div.swal-overlay.swal-overlay--show-modal:nth-child(7) div.swal-modal div.swal-footer div.swal-button-container:nth-child(2) > button.swal-button.swal-button--catch.confirm-ols-cancel-approve")
    public WebElement evetEminimBtn2;


//
//    @FindBy(xpath = "//body[1]/div[4]/div[1]/div[1]/div[3]/button[5]/svg[1]/path[1]")
//    public WebElement detayGosterKapatBtn;



    @Test
    public void testonayla() throws Exception {
        PageFactory.initElements(driver, this);
        JavascriptExecutor js = (JavascriptExecutor) driver;

        try{
            kullaniciGirisYap(driver, Kullanici.KULLANICI1);
        }catch (Exception e){
            Logger.warn("Kullan─▒c─▒ login olamad─▒.");
        }


        Thread.sleep(3000);

        Fwait.until(ExpectedConditions.visibilityOf(hesapBtn));
        hesapBtn.click();

        Fwait.until(ExpectedConditions.visibilityOf(maniaPlan─▒OnayPaneliBtn));
        maniaPlan─▒OnayPaneliBtn.click();


        try {
            Fwait.until(ExpectedConditions.visibilityOf(onaylaBtn));
            onaylaBtn.click();
            //SULETEST ismindeki veri onaylan─▒p ,┼×ube m├╝d├╝r├╝ne g├Ânderilecek.
           // js.executeScript("document.querySelector('#root > div > div:nth-child(3) > div.share-panel.react-draggable.react-draggable-dragged > div > div > div.MuiPaper-root.MuiPaper-elevation2.MuiPaper-rounded > div > div > div > div > table > tbody > tr:nth-child(3) > td.MuiTableCell-root.MuiTableCell-body.MuiTableCell-paddingNone > div > button:nth-child(3)').click()");

        }catch (Exception e){
            Logger.warn(" Adminde SULETEST Onayla butonuna t─▒klanamad─▒.");
        }
         Thread.sleep(5000);




        try {
            js.executeScript("document.querySelector('body > div.swal-overlay.swal-overlay--show-modal > div > div.swal-footer > div:nth-child(2) > button').click()");
        }catch (Exception e){
            Logger.warn(" Admin Evet ,eminim butonuna t─▒klanmad─▒.");
        }

       driver.get("https://live.basarsoft.com.tr/mania/web/#/login");

        Thread.sleep(3000);


//        //┼×ube m├╝d├╝r├╝ olarak giri┼č yap─▒ld─▒.

        try{
            kullaniciGirisYap(driver, Kullanici.KULLANICI3);
        }catch (Exception e){
            Logger.warn("Kullan─▒c─▒ login olamad─▒.");
        }

        Thread.sleep(5000);

       try{
           Fwait.until(ExpectedConditions.visibilityOf(hesapBtn));
           hesapBtn.click();
       }catch(Exception e){
            Logger.warn("Sube m├╝d├╝r├╝ hesap butonu t─▒klanmad─▒.");
        }

//
//

        try{
            Fwait.until(ExpectedConditions.visibilityOf(maniaPlan─▒OnayPaneliBtn));
            maniaPlan─▒OnayPaneliBtn.click();
        }catch(Exception e){
            Logger.warn("Sube m├╝d├╝r├╝ mania onay paneli butonu t─▒klanmad─▒.");
        }

////
//
//
        try{
            Fwait.until(ExpectedConditions.visibilityOf(revizeBtn));
            revizeBtn.click();
        }catch(Exception e){
            Logger.warn("Sube m├╝d├╝r├╝ revize butonu t─▒klanmad─▒.");
        }

        Thread.sleep(3000);

        try{
//            Fwait.until(ExpectedConditions.visibilityOf(evetEminimBtn2));
//            Thread.sleep(1500);
//            evetEminimBtn2.click();

            js.executeScript("document.querySelector('body > div.swal-overlay.swal-overlay--show-modal > div > div.swal-footer > div:nth-child(2) > button').click()");
        }catch(Exception e){
            Logger.warn(e.getMessage());
           // Logger.warn("┼×ube M├╝d├╝r├╝ onay i┼člemi adminOnaylaiptal edilmedi ,revize i┼člemi ger├žekle┼čmedi.");
        }

        Thread.sleep(5000);



//        String bodyText = driver.findElement(By.xpath("//span[contains(text(),'─░┼člem adminOnaylaiptal edildi.')]")).getText();
//        Assert.assertTrue("Text not found!", bodyText.contains("i┼člem adminOnaylaiptal edildi."));

























//        driver.get("https://live.basarsoft.com.tr/mania/web/#/login");

//
//        try{
//            kullaniciGirisYap(driver, Kullanici.KULLANICI1);
//        }catch (Exception e){
//            Logger.warn("Kullan─▒c─▒ login olamad─▒.");
//        }
//
//
//        Thread.sleep(3000);
//
//        Fwait.until(ExpectedConditions.visibilityOf(hesapBtn));
//        hesapBtn.click();
//
//        Fwait.until(ExpectedConditions.visibilityOf(maniaPlan─▒OnayPaneliBtn));
//        maniaPlan─▒OnayPaneliBtn.click();
//
//
//        try {
//            Fwait.until(ExpectedConditions.visibilityOf(onaylaBtn));
//            onaylaBtn.click();
//        }catch (Exception e){
//            Logger.warn("Onayla butonuna t─▒klanamad─▒.");
//        }
//
//
//
//        try {
//            Fwait.until(ExpectedConditions.visibilityOf(evetEminimBtn));
//            evetEminimBtn.click();
//        }catch (Exception e){
//            Logger.warn("Evet ,eminim butonuna t─▒klanmad─▒.");
//        }
//
//
//
//
//
//












//        String bodyText = driver.findElement(By.xpath("//body/div[@id='root']/div[1]/div[2]/div[5]")).getText();
//        Assert.assertTrue("Text not found!", bodyText.contains("Nesne"));

//        act.keyDown(Keys.CONTROL).sendKeys("v").keyUp(Keys.CONTROL).perform();
//        act.keyDown(Keys.ENTER).keyUp(Keys.ENTER).perform();

//
//        System.out.println("File is Uploaded Successfully");


        System.out.println("Test Tamamland─▒!");
        Thread.sleep(3000);
    }
}