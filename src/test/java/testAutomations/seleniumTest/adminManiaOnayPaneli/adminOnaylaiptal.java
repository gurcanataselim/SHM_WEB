package testAutomations.seleniumTest.adminManiaOnayPaneli;

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

    @FindBy(css = "#root > div > div:nth-child(3) > div.main-menu > div.rightSide > div:nth-child(6) > div > span")
    public WebElement hesap2Btn;



    @FindBy(xpath = "//span[contains(text(),'Mania Planı Onay Paneli')]")
    public WebElement maniaPlanıOnayPaneliBtn;

    @FindBy(xpath= "//tbody/tr[3]/td[1]/div[1]/button[3]/span[1]")
    public WebElement onaylaBtn;

    @FindBy(xpath= "//button[contains(text(),'Hayır, iptal et!')]")
    public WebElement hayirIptalEtBtn;



    @FindBy(css = "body:nth-child(2) div.swal-overlay.swal-overlay--show-modal:nth-child(6) div.swal-modal.confirm-ols-update div.swal-footer > div.swal-button-container:nth-child(2)")
    public WebElement evetEminimBtn;

    @FindBy(xpath = "//tbody/tr[3]/td[1]/div[1]/button[4]/span[1]")
    public WebElement revizeBtn;

    @FindBy(xpath = "#root > div > div:nth-child(3) > div.main-menu > div.rightSide > div:nth-child(6) > div > div > div:nth-child(3) > span")
    public WebElement maniaPlanıOnayPaneliBtnSubeMuduru;


    @FindBy(css= "div.swal-overlay.swal-overlay--show-modal:nth-child(7) div.swal-modal div.swal-footer div.swal-button-container:nth-child(2) > button.swal-button.swal-button--catch.confirm-ols-cancel-approve")
    public WebElement evetEminimBtn2;


//
//    @FindBy(xpath = "//body[1]/div[4]/div[1]/div[1]/div[3]/button[5]/svg[1]/path[1]")
//    public WebElement detayGosterKapatBtn;



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

        Fwait.until(ExpectedConditions.visibilityOf(maniaPlanıOnayPaneliBtn));
        maniaPlanıOnayPaneliBtn.click();


        try {
            Fwait.until(ExpectedConditions.visibilityOf(onaylaBtn));
            onaylaBtn.click();
            //SULETEST ismindeki veri onaylanıp ,Şube müdürüne gönderilecek.
           // js.executeScript("document.querySelector('#root > div > div:nth-child(3) > div.share-panel.react-draggable.react-draggable-dragged > div > div > div.MuiPaper-root.MuiPaper-elevation2.MuiPaper-rounded > div > div > div > div > table > tbody > tr:nth-child(3) > td.MuiTableCell-root.MuiTableCell-body.MuiTableCell-paddingNone > div > button:nth-child(3)').click()");

        }catch (Exception e){
            Logger.warn(" Adminde SULETEST Onayla butonuna tıklanamadı.");
        }
         Thread.sleep(5000);




        try {
            Fwait.until(ExpectedConditions.visibilityOf(hayirIptalEtBtn));
            hayirIptalEtBtn.click();
        }catch (Exception e){
            Logger.warn(" Admin Hayır ,iptal et butonuna tıklanmadı.");
        }




        System.out.println("Test Tamamlandı!");
        Thread.sleep(3000);
    }
}