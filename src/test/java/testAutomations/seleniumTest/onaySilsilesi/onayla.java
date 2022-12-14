package testAutomations.seleniumTest.onaySilsilesi;

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


    @FindBy(xpath = "//tbody/tr[8]/td[1]/div[1]/button[2]/span[1]/span[1]")
    public WebElement onaylaBtn;

    @FindBy(css ="div.swal-overlay.swal-overlay--show-modal:nth-child(9) div.swal-modal div.swal-footer div.swal-button-container:nth-child(2) > button.swal-button.swal-button--catch.confirm-aviation-update-approve")
    public WebElement evetEminimBtn;



    @FindBy(xpath = "//tbody/tr[8]/td[1]/div[1]/button[2]/span[1]/span[1]")
    public WebElement onaylaSubeBtn;


    @FindBy(xpath = "//tbody/tr[8]/td[1]/div[1]/button[3]/span[1]/span[1]")
    public WebElement revizeBtn;

    @FindBy(xpath = "//tbody/tr[7]/td[1]/div[1]/button[3]")
    public WebElement daireBaskanirevizeBtn;


    @FindBy(xpath = "//tbody/tr[8]/td[1]/div[1]/button[2]/span[1]/span[1]")
    public WebElement daireBaskaniOnayBtn;

    @FindBy(xpath = "//tbody/tr[8]/td[1]/div[1]/button[2]/span[1]/span[1]")
    public WebElement genelMudurYardimcisiOnayBtn;

    @FindBy(xpath = "//tbody/tr[8]/td[1]/div[1]/button[3]")
    public WebElement revizeGenelMudurBtn;






    @FindBy(css= "div.swal-overlay.swal-overlay--show-modal:nth-child(7) div.swal-modal div.swal-footer div.swal-button-container:nth-child(2) > button.swal-button.swal-button--catch.confirm-aviation-cancel-approve")
    public WebElement evetEminimBtn2;




    @Test
    public void testonayla() throws Exception {
        PageFactory.initElements(driver, this);
        JavascriptExecutor js = (JavascriptExecutor) driver;

        try{
            kullaniciGirisYap(driver, Kullanici.KULLANICI1);
        }catch (Exception e){
            Logger.warn("Kullan??c?? login olamad??.");
        }


        Thread.sleep(3000);

        Fwait.until(ExpectedConditions.visibilityOf(hesapBtn));
        hesapBtn.click();

        Fwait.until(ExpectedConditions.visibilityOf(cnsOnayPaneliBtn));
        cnsOnayPaneliBtn.click();

        Thread.sleep(3000);


        try{
            Fwait.until(ExpectedConditions.visibilityOf(onaylaBtn));
            onaylaBtn.click();
//            js.executeScript("document.querySelector('#root > div > div:nth-child(3) > div.share-panel.react-draggable.react-draggable-dragged > div > div > div.MuiPaper-root.MuiPaper-elevation2.MuiPaper-rounded > div > div > div > div > table > tbody > tr:nth-child(13) > td.MuiTableCell-root.MuiTableCell-body.MuiTableCell-paddingNone > div > button:nth-child(3)').click()");
        }catch(Exception e){
            Logger.warn("  RADAR_15000  Onaylama i??lemi ger??ekle??medi.");
        }

        Thread.sleep(4000);

        try{
//            Fwait.until(ExpectedConditions.visibilityOf(evetEminimBtn));
//            evetEminimBtn.click();
            js.executeScript("document.querySelector('body > div.swal-overlay.swal-overlay--show-modal > div > div.swal-footer > div:nth-child(2) > button').click()");
        }catch(Exception e){
            Logger.warn(" RADAR_15000 adl?? verinin Evet eminim butonuna t??klanmad??");
        }
//6_

        Thread.sleep(3000);

        driver.get("https://live.basarsoft.com.tr/mania/web/#/login");

        Thread.sleep(3000);


//        //??ube m??d??r?? olarak giri?? yap??ld??.

        try{
            kullaniciGirisYap(driver, Kullanici.KULLANICI3);
        }catch (Exception e){
            Logger.warn("Kullan??c?? login olamad??.");
        }

        Thread.sleep(5000);

        try{
            Fwait.until(ExpectedConditions.visibilityOf(onaylaSubeBtn));
            onaylaSubeBtn.click();
        }catch(Exception e){
            Logger.warn("Sube m??d??r?? onayla butonu t??klanmad??.");
        }

        Thread.sleep(3000);

        try{
//            Fwait.until(ExpectedConditions.visibilityOf(evetEminimBtn2));
//            evetEminimBtn2.click();

            js.executeScript("document.querySelector('body > div.swal-overlay.swal-overlay--show-modal > div > div.swal-footer > div:nth-child(2) > button').click()");
        }catch(Exception e){
            Logger.warn("??ube m??d??r??nde beklenen veri RADAR_15000 Daire ba??kan??na g??nderildi.");
        }

        Thread.sleep(5000);



        driver.get("https://live.basarsoft.com.tr/mania/web/#/login");
        // Daire ba??kan?? ile giri?? yap??ld??

        try{
            kullaniciGirisYap(driver, Kullanici.KULLANICI4);
        }catch (Exception e){
            Logger.warn("Kullan??c?? login olamad??.");
        }

        Thread.sleep(5000);

        try{
            Fwait.until(ExpectedConditions.visibilityOf(daireBaskaniOnayBtn));
            daireBaskaniOnayBtn.click();
        }catch(Exception e){
            Logger.warn("Daire ba??kan?? onay  butonu t??klanmad??.");
        }

        Thread.sleep(3000);

        try {

            js.executeScript("document.querySelector('body > div.swal-overlay.swal-overlay--show-modal > div > div.swal-footer > div:nth-child(2) > button').click()");
        }catch (Exception e){
            Logger.warn("Daire ba??kan?? evet eminime t??klayarak Genel M??d??r yard??mc??n??na g??nderim yapmad??");
        }
         Thread.sleep(3000);


        driver.get("https://live.basarsoft.com.tr/mania/web/#/login");
        // Genel M??d??r Yard??mc??s??  ile giri?? yap??ld??.

        try{
            kullaniciGirisYap(driver, Kullanici.KULLANICI5);
        }catch (Exception e){
            Logger.warn("Kullan??c?? login olamad??.");
        }
        Thread.sleep(3000);

        try{
            Fwait.until(ExpectedConditions.visibilityOf(genelMudurYardimcisiOnayBtn));
            genelMudurYardimcisiOnayBtn.click();

            //js.executeScript("document.querySelector('#root > div > div:nth-child(3) > div.share-panel.react-draggable.react-draggable-dragged > div > div > div.MuiPaper-root.MuiPaper-elevation2.MuiPaper-rounded > div > div > div > div > table > tbody > tr:nth-child(8) > td.MuiTableCell-root.MuiTableCell-body.MuiTableCell-paddingNone > div > button:nth-child(2)').click()");


        }catch(Exception e){
            Logger.warn("Genel M??d??r yard??mc??s?? onay  butonu t??klanmad??.");
        }

        Thread.sleep(3000);

        try {
            js.executeScript("document.querySelector('body > div.swal-overlay.swal-overlay--show-modal > div > div.swal-footer > div:nth-child(2) > button').click()");
        }catch (Exception e){
            Logger.warn("Genel m??d??r yard??mc??s?? evet eminim butonuna t??klanmay??p Genel m??d??re onay gidemedi");
        }
        Thread.sleep(3000);


        driver.get("https://live.basarsoft.com.tr/mania/web/#/login");
        // Genel M??d??r  ile giri?? yap??ld??.

        try{
            kullaniciGirisYap(driver, Kullanici.KULLANICI6);
        }catch (Exception e){
            Logger.warn(" Genel M??d??r Kullan??c??s?? login olamad??.");
        }
        Thread.sleep(3000);


        try{
            Fwait.until(ExpectedConditions.visibilityOf(revizeGenelMudurBtn));
            revizeGenelMudurBtn.click();

            //js.executeScript("document.querySelector('#root > div > div:nth-child(3) > div.share-panel.react-draggable.react-draggable-dragged > div > div > div.MuiPaper-root.MuiPaper-elevation2.MuiPaper-rounded > div > div > div > div > table > tbody > tr:nth-child(8) > td.MuiTableCell-root.MuiTableCell-body.MuiTableCell-paddingNone > div > button:nth-child(3)').click()");
        }catch(Exception e){
            Logger.warn("Genel M??d??r revize  butonu t??klanmad??.");
        }

        Thread.sleep(3000);

         try {
             js.executeScript("document.querySelector('body > div.swal-overlay.swal-overlay--show-modal > div > div.swal-footer > div:nth-child(2) > button').click()");
         }catch (Exception e){
             Logger.warn(" Genel m??d??r reddi olup en ba??a admin panel onay paneline revize sonras?? gelemedi.");
         }


















        System.out.println("Test Tamamland??!");
        Thread.sleep(3000);
    }
}